/**
 * 
 */
package com.susheelkb.romannumeral.service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.susheelkb.romannumeral.domain.RomanNumber;
import com.susheelkb.romannumeral.exception.NumberIsZeroException;
import com.susheelkb.romannumeral.exception.RangeViolationException;
import com.susheelkb.romannumeral.service.RomanNumeralConverterService;

/**
 * @author susheel.kaparaboyna
 *
 */
public class RomanNumsServiceTest {
	private RomanNumeralConverterService numsService;

	@Before
	public void setUp() {
		numsService = new RomanNumeralConverterService();
	}

	@Test(expected = NumberIsZeroException.class)
	public void testExceptionThrownIfGivenZero() {
	           numsService.toRomanNumber(0);
	}
	
	@Test(expected = RangeViolationException.class)
	public void testExceptionThrownIfGivenOutOfRange() {
		numsService.toRomanNumber(4000);
	}

	@Test
	public void When_NumberIs299_Expect_CCXCIX() {
		RomanNumber romanNumber = numsService.toRomanNumber(299);
		RomanNumber expected = new RomanNumber(299, "CCXCIX");
		assertEquals(expected, romanNumber);
	}

	@Test
	public void When_NumberIs2987_Expect_MMCMLXXXVII() {
		RomanNumber romanNumber = numsService.toRomanNumber(2987);
		RomanNumber expected = new RomanNumber(2987, "MMCMLXXXVII");
		assertEquals(expected, romanNumber);
	}

	@Test
	public void When_NumberIs3999_Expect_MMMCMXCIX() {
		RomanNumber romanNumber = numsService.toRomanNumber(3999);
		RomanNumber expected = new RomanNumber(3999, "MMMCMXCIX");
		assertEquals(expected, romanNumber);
	}

}
