
public class validationManager implements validationService {

	@Override
	public boolean validate(gamer gamer) {
		if (gamer.getIdentityNumber().length()==11  && gamer.getYearofbirth() < 2004) {
			return true;
		}
		return false;
	}
}
