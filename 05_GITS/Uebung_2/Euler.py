def mod_pow(base, exponent, modulus):
    result = 1

    for i in range(exponent):
        result = (result * base) % modulus
    return result

def euler():
    val = 1
    for prime in primes:
        val *= (prime - 1)
    return val

# Setup
values = [666, 1113, 1313]
primes = [8933, 16889]

# 1 * 8933 * 16889 = 150869437
modulus = 1
for prime in primes:
    modulus *= prime

# Run
exponent = euler()
print(f"i for val^i ≡ 1 mod m is {exponent}")

# Check
print("Check:")
for val in values:
    print(f"{val}^{exponent} mod {modulus} ≡ {mod_pow(val, exponent, modulus)}")