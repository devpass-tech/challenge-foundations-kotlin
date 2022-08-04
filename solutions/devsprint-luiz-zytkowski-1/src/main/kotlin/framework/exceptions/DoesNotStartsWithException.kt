package framework.exceptions

import framework.OwnedException

class DoesNotStartsWithException(message: String) : OwnedException(message)
