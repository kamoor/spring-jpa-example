package com.nube.core.vo.idm;

public enum UserStatus {

	ACTIVE,
	LOCKED, /*Locked due to suspecious acitvity*/
	INACTIVE, /*Before activation*/
	DELETED,  /*User got deleted*/
	SUSPENDED ,/*Suspend user*/
}
