import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import Footer from './FooterMyTwo.es';
import Header from './HeaderMyTwo.es';
import templates from './ViewMyTwo.soy';

/**
 * View Component
 */
class ViewMyTwo extends Component {
	_handleClick(event) {
		event.preventDefault();
		alert(event.target.innerText + " [MyTest02] pushed!");
	}
}

// Register component
Soy.register(ViewMyTwo, templates);

export default ViewMyTwo;