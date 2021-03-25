package com.palindrome.test.util;

import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.UUID;

public class Util {
	public static String getShortGUID() {
	    final UUID uuid = UUID.randomUUID();

	    final long leastbits = uuid.getLeastSignificantBits();
	    final long mostsigbits = uuid.getMostSignificantBits();
	    final byte[] uuidBytes = ByteBuffer.allocate(16).putLong(mostsigbits).putLong(leastbits).array();

	    return Base64.getEncoder().encodeToString(uuidBytes).substring(0, 22).replace("/", "_").replace("+", "-");
	  }

}
