
package com.chrishammer.repository;

import com.chrishammer.model.Provider;

public interface CalculateRepository {

	Provider getProvider(String providerName);
	
}