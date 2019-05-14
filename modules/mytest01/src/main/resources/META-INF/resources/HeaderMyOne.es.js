import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';

import templates from './HeaderMyOne.soy';

/**
 * Header Component
 */
class HeaderMyOne extends Component {}

// Register component
Soy.register(HeaderMyOne, templates);

export default HeaderMyOne;