package Concrete;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements IPlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException {

		return false;
	}

}
