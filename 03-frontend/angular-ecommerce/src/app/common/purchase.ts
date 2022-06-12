import { Address } from './address';
import { Customer } from './customer';
import { Order } from './order';
import { OrderItem } from './order-item';

export class Purchase {
  custormer: Customer;
  shippingAddress: Address;
  billingAddress: Address;
  order: Order;
  orderItems: OrderItem[];
}
