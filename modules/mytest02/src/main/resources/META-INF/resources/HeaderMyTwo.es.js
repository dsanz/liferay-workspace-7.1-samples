import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';

import templates from './HeaderMyTwo.soy';

/**
 * Header Component
 */
class HeaderMyTwo extends Component {}

// Register component
Soy.register(HeaderMyTwo, templates);

export default HeaderMyTwo;