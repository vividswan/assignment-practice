package com.vividswan.practice.common;

public class Constants {

	public enum ExceptionClass {

		TOPIC("Topic");

		private String exceptionClass;

		ExceptionClass(String exceptionClass) {
			this.exceptionClass = exceptionClass;
		}

		public String getExceptionClass() {
			return exceptionClass;
		}

		@Override
		public String toString() {
			return getExceptionClass() + " Exception. ";
		}

	}

}
