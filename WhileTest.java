
public class WhileTest {
	public static void main(String[] args) {
		WhileTest obj = new WhileTest();
    	obj.nNos(5);
		obj.sumOfNaturalNos(5);
    	obj.sumOfEvenNos(3);
		obj.sumOfOddNos(5);
    	obj.noOfDigitsCount(123);
    	obj.sumOfDigitsOfaNo(12345);
		obj.firstAndLastDigit(48889775);
    	obj.sumOfFirstAndLastDigit(2456);
   		obj.reverseTheNo(123);
		obj.primeNo(12);
		obj.reverseTheNoAndPrimeOrNot(31);
    	obj.sumOfGivenNoAndPrimeOrNot(17);
		obj.palindrome(121);
		obj.divisors(10);
	}

	public void nNos(int n) {
		int i = 1;

		while (n >= i) {

			System.out.println(n);
			n--;
		}
	}

	public void sumOfNaturalNos(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i; // sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public void sumOfEvenNos(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			if (i % 2 == 0) {
				sum = sum + i; // sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}

	public void sumOfOddNos(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			if (i % 2 != 0) {
				sum = sum + i; // sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}

	public void noOfDigitsCount(int n) {

		int count = 0;
		while (n != 0) {
			n = n / 10; // n/= 10;
			count++;
		}
		System.out.println(count);
	}

	public void sumOfDigitsOfaNo(int n) {

		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println(sum);
	}

	public void firstAndLastDigit(int n) {
		int first = n;
		int i = 9;
		int last = n % 10;
		while (first > i) {
			first = first / 10;
		}
		System.out.println(first);
		System.out.println(last);
	}

	public void sumOfFirstAndLastDigit(int n) {
		int sum = 0;
		int first = n;
		int i = 9;
		int last = n % 10;
		while (first > i) {
			first = first / 10;
			sum = first + last;
		}
		System.out.println(sum);
	}

	public void reverseTheNo(int n) {
		int rNo = 0;

		while (n > 0) {
			int a = n % 10;
			rNo = rNo * 10 + a;
			n = n / 10;
		}
		System.out.println(rNo);
	}

	public void primeNo(int n) {
		int i = 1;
		int count = 0;
		while (n >= i) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println("Prime No");
		} else {
			System.out.println("Not a primeNo");
		}
	}

	public void reverseTheNoAndPrimeOrNot(int n) {
		int rNo = 0, i = 1, count = 0;

		while (n > 0) {
			int a = n % 10;
			rNo = rNo * 10 + a;
			n = n / 10;
		}
		System.out.println(rNo);

		while (rNo >= i) {
			if (rNo % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println("Prime No");
		} else {
			System.out.println("Not a primeNo");
		}
	}

	public void sumOfGivenNoAndPrimeOrNot(int n) {
		int i = 1, sum = 0, count = 0;
		while (i <= n) {
			sum = sum + i; // sum += i;
			i++;
		}
		System.out.println(sum);

		while (sum >= i) {
			if (sum % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println("Prime No");
		} else {
			System.out.println("Not a primeNo");
		}
	}

	public void palindrome(int n) {
		int reverse = 0;
		if (n > 9) {
			while (n > 0) {
				int a = n % 10;
				reverse = (reverse * 10) + a;
				n = n / 10;
			}
		}

		if (reverse == n) {
			System.out.println(n + " is Palindrome");
		} else {
			System.out.println(n + " is Not a palindrome");
		}
	}

	public void divisors(int n) {
		int i = 1;
		while (n >= i) {
			if (n % i == 0) {
				System.out.println("Divisors = " + i);
			}
			i++;
		}
	}
}

