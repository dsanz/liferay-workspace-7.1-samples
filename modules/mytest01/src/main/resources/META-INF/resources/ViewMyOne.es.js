import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import Footer from './FooterMyOne.es';
import Header from './HeaderMyOne.es';
import templates from './ViewMyOne.soy';

/**
 * View Component
 */
class ViewMyOne extends Component {}

// Register component
Soy.register(ViewMyOne, templates);

export default ViewMyOne;