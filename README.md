# Negate decimal

Converting positive decimals into negative decimals and vice versa.

The negateDecimal class can be accessed in the [src folder](src) or by [clicking here](src/NegateDecimal.java).

> [!IMPORTANT]
> The negateDecimal class must be inside your project before any methods can be used.

```Java
// One way of getting the negateDecimal class inside your project. This requires the class to be in the same folder as the file using this code.
NegateDecimal negateDecimal = new NegateDecimal();
```

## Negate decimal methods

### negateDecimal.negateDouble(double decimalDouble) | Returns a double

Returns a negative version of a positive double and vice versa.

```Java
negateDecimal.negateDouble(6.0); // Returns -6.0 as a double.
```

```Java
negateDecimal.negateDouble(156.415); // Returns -156.415 as a double.
```

```Java
negateDecimal.negateDouble(0.0); // Returns 0.0 as a double.
```

```Java
negateDecimal.negateDouble(-9.0); // Returns 9.0 as a double.
```

```Java
negateDecimal.negateDouble(-16.5); // Returns 16.5 as a double.
```

### negateDecimal.negateFloat(float decimalFloat) | Returns a float

Returns a negative version of a positve float and vice versa.

```Java
negateDecimal.negateFloat(6.0f); // Returns -6.0 as a float.
```

```Java
negateDecimal.negateFloat(156.415f); // Returns -156.415 as a float.
```

```Java
negateDecimal.negateFloat(0.0f); // Returns 0.0 as a float.
```

```Java
negateDecimal.negateFloat(-9.0f); // Returns 9.0 as a float.
```

```Java
negateDecimal.negateFloat(-16.5f); // Returns 16.5 as a float.
```

### negateDecimal.negate(float or double decimal) | Returns a float or double

Returns a negative version of a positve float or negative float and vice versa depending on the datatype placed in the parameter.

```Java
negateDecimal.negate(156.415); // Returns -156.415 as a double.
```

```Java
negateDecimal.negate(156.415f); // Returns -156.415 as a float.
```

## License

This repository contains the MIT license. You must give credit if you are going to use its source code.
