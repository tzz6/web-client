package com.tzz.netty.client;

import com.tzz.netty.bean.InformationPacket;
import com.tzz.netty.bean.InformationPacket.Group;
import com.tzz.netty.service.MsgHandleService;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class TimeClientHandler extends ChannelHandlerAdapter {

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		MsgHandleService.channel = ctx;
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		InformationPacket.Group group = (Group) msg;
		MsgHandleService.doMsgForShunt(group);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		super.exceptionCaught(ctx, cause);
	}
}
