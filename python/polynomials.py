def evaluate_poly(poly, x):
  """ 
  Computes the polynomial function for a given value x. Returns that value.
  Example:
  poly = (0.0, 0.0, 5.0, 9.3, 7.0)
  x = -13 
  print evaluate_poly(poly, x)
  180339.9 
  """ 
  
  result = 0.0
  for i in range(len(poly)):
    result += poly[i] * (x ** i)
  return result

#poly = (0.0, 0.0, 5.0, 9.3, 7.0)
#x = -13 
#print evaluate_poly(poly, x)

