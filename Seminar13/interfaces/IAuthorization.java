package resolved.interfaces;

import resolved.classes.Supermarket;

public interface IAuthorization {
	boolean hasInsurance(Supermarket c);
	float priceInsuranceMP();
}
