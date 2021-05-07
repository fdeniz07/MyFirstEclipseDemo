package Adapters;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(player.getNationalIdentity(), player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), player.getBirthYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

}
