def compute_deriv(poly):
  """
  Computes and returns the derivative of a polynomial function. If the
  derivative is 0, returns (0.0,).
  Example:
  poly = (-13.39, 0.0, 17.5, 3.0, 1.0)
  print compute_deriv(poly) 
  [0.0, 35.0, 9.0, 4.0]
  """

  result = [0.0]
  for i in xrange(2, len(poly)):
    result.append(poly[i] * i)
  return result

poly = (-13.39, 0.0, 17.5, 3.0, 1.0)
print compute_deriv(poly) 
