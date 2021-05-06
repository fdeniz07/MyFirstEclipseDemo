package Abstract;

import java.rmi.RemoteException;

import Entities.Player;


public interface IPlayerCheckService {
	boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException;
}
