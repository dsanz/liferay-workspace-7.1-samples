import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';
import templates from './NavigationMyOne.soy';

/**
 * Navigation Component
 */
class NavigationMyOne extends Component {}

// Register component
Soy.register(NavigationMyOne, templates);

export default NavigationMyOne;