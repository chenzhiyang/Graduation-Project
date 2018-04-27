package cn.czy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czy.dao.InviteMapper;
import cn.czy.pojo.Invite;

@Service
public class InviteServiceImpl implements InviteService {

	@Autowired
	private InviteMapper inviteMapper;

	@Override
	public boolean insertInviteByExample(Invite invite) throws Exception {
		return inviteMapper.insertSelective(invite)>0;
	}
}
