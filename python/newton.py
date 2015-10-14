from polynomials import evaluate_poly 
from derivates import compute_deriv

def compute_root(poly, x_0, epsilon):
  """
  Uses Newton's method to find and return a root of a polynomial function.
  Returns a tuple containing the root and the number of iterations required to
  get to the root.
  """
  
  root = x_0
  count = 1
  while abs(evaluate_poly(poly, root)) >= epsilon:
    root = (root - evaluate_poly(poly, root)/ 
      evaluate_poly(compute_deriv(poly), root))
    count += 1
  return [root, count]

#poly = (-13.39, 0.0, 17.5, 3.0, 1.0)
#x_0 = 0.1
#epsilon = .0001
#print compute_root(poly, x_0, epsilon)
#[0.806790753796352, 8]
