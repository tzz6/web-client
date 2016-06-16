package com.tzz.netty.control;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.tzz.netty.bean.InformationPacket.Group.User;
import com.tzz.netty.bean.InformationPacket.Login;
import com.tzz.netty.bean.InformationPacket.MsgInfo;
import com.tzz.netty.bean.UserBean;
import com.tzz.netty.service.MsgHandleService;
import com.tzz.netty.thread.ClientThreadPool;
import com.tzz.netty.view.GroupChat;
import com.tzz.netty.view.MM;

public class CoreBusinessControl {

	private MM mm;
	private GroupChat groupChat;
	private ExecutorService es = Executors.newCachedThreadPool();// 线程池
	private ClientThreadPool clientThread;
	private UserBean userBean;

	@SuppressWarnings("unused")
	private CoreBusinessControl() {
	};

	public CoreBusinessControl(MM mm) {
		this.mm = mm;
	}

	/** 校验登录 */
	public void doCheckConnectLogin(String userName, String userPwd) {
		//连接服务端
		doConnectServer();
		userBean = new UserBean();
		userBean.setUserName(userName);
		userBean.setUserPwd(userPwd);
	}

	public void doCheckLogin() {
		MsgHandleService.doCheckLogin(userBean);
	}

	/**发送消息*/
	public void doSendMsg(String msgStr) {
		MsgHandleService.doSendMsgStr(userBean.getUserName(), msgStr);
	}

	public void doChangeGroupChatView(Login login) {
		mm.dispose();
		groupChat = new GroupChat();
		groupChat.setUser(userBean);
	}

	public void doRefreshFriendList(List<User> userListList) {
		groupChat.refreshFriendsList(userListList);
	}

	/** 连接服务端 */
	public void doConnectServer() {
		clientThread = new ClientThreadPool();
		es.execute(clientThread);
	}

	/** 开启聊天界面 */
	public void doOpenChatView() {
		mm.dispose();
		groupChat = new GroupChat();
	}

	public void doReceivedMsgInfo(MsgInfo msgInfo) {
		groupChat.refreshReceivedMsg(msgInfo);
	}

}
