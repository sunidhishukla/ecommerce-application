import { FormControl, ValidationErrors } from '@angular/forms';

export class CustomValidators {
  // whitespace vaidation
  static notOnlyWhitespace(control: FormControl): ValidationErrors {
    // check if string only contains whitepsace
    if (control.value != null && control.value.trim().length === 0) {
      // invalid, return error object
      return { notOnlyWhitespace: true };
    } else {
      // valid, return null
      return null;
    }
  }
}
