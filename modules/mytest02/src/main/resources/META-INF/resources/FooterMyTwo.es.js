import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';

import templates from './FooterMyTwo.soy';

/**
 * Footer Component
 */
class FooterMyTwo extends Component {}

// Register component
Soy.register(FooterMyTwo, templates);

export default FooterMyTwo;