import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';

import templates from './FooterMyOne.soy';

/**
 * Footer Component
 */
class FooterMyOne extends Component {}

// Register component
Soy.register(FooterMyOne, templates);

export default FooterMyOne;