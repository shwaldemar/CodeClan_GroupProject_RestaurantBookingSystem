import React, {Component} from 'react';
import BookingsForm from './BookingsForm';
import BookingsList from './BookingsList';
import BookingsDetails from './BookingDetails';
import Request from '../../helpers/request';

class BookingsView extends Component {

  constructor(props) {
    super(props);

  }


  render() {
    return(
      <div>
      <h2>New booking</h2>
      <BookingsForm onClickSubmit={this.props.onBookingSubmit}/>
      <BookingsList bookings={this.props.bookings} />
      </div>
    )
  }
}

export default BookingsView;
