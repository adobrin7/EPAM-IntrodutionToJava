package ua.epam.lesson_1;

class Lesson_1 {
    public static int task_1(int n) {
        if (n == 0) {
            return n;
        }
        return (n < 0) ? -n : n * n;
    }

    public static int task_2(int n) {
        if (n < 100 || n > 999) {
            return 0;
        }
        // Using arrays and strings is not recommended in the problem
        int res = 0;
        for (int i = 9; i >= 0; i--)
        {
            int tmp = n;
            while (tmp > 0)
            {
                int digit = tmp % 10;
                if (digit == i)
                {
                    res *= 10;
                    res += digit;
                }
                tmp /= 10;
            }
        }
        return res;
    }

    public static int task_3(int n) {
        if (n < 0) {
            return 0;
        }
        int sum = 0;

        while(n != 0) {
            int lastDigit = n % 10;
            if(lastDigit % 2 != 0) {
                sum += lastDigit;
            }
            n = n / 10;
        }
        return sum;
    }

    public static int task_4(int n) {
        if (n < 0 || n == 0) {
            return 0;
        }
        int res = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                res++;
            }
            n /= 2;
        }
        return res;
    }
}
