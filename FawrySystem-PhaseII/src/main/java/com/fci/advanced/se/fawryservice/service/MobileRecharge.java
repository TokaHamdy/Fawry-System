package com.fci.advanced.se.fawryservice.service;
import com.fci.advanced.se.fawryservice.provider.Etisalat;
import com.fci.advanced.se.fawryservice.provider.Orange;
import com.fci.advanced.se.fawryservice.provider.Provider;
import com.fci.advanced.se.fawryservice.provider.Vodafone;
import com.fci.advanced.se.fawryservice.provider.We;

//When user select MobileRecharge service.
public class MobileRecharge implements Service {
	//Name of this service
	private String name;
	//the provider of this service.
	private Provider provider;
	//the cost of this service.
	private double amount;
	//specific discount of this service.
	private Discount discount;
	private static double mobile_discount = 0;
	
	//default constructor.
	public MobileRecharge() {
		this.name = "Mobile Recharge";
	}
	//creating provider object depending on user request.
	public void mobileRecharageForm(double amount,String  request)
	{	 
		this.amount=amount;
	   request=request.toLowerCase();
		if(request=="we")
		{
			this.setProvider(new We());
		}
		else if(request=="etisalat")
			
		{
			this.setProvider(new Etisalat());

		}
		else if(request=="orange")
		{			
			this.setProvider(new Orange());

		}
		else if(request=="vodafone")
		{
			this.setProvider(new Vodafone());

		}
	
	}
	//setter && getters.
	public void serviceForm(double amount  ,String requests)
	{
		 mobileRecharageForm( amount ,  requests);
	}
	
	public double getAmount() {
		return amount;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void updateDiscount(Discount discount) {
		this.discount = discount;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	@Override
	public void setDiscount_Amount(double amount) {
		mobile_discount = amount;
		
	}
	@Override
	public double getDiscount_Amount() {
		return mobile_discount;
	}
	
	
}
