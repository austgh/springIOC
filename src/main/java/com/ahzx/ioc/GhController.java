package com.ahzx.ioc;

public class GhController {
	@GhAnnotation
	private GhService ghService;

	public GhService getGhService() {
		return ghService;
	}

	public void setGhService(GhService ghService) {
		this.ghService = ghService;
	}

	@Override
	public String toString() {
		return "GhController [ghService=" + ghService + "]";
	}

}
