/*
 * Encog(tm) Core v3.4 - Java Version
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-core
 
 * Copyright 2008-2016 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.app.quant;

import org.encog.Encog;
import org.encog.util.arrayutil.NormalizeArray;
import org.junit.Assert;
import org.junit.Test;

public class TestNormalizeArray {

    @Test
    public void testNormalize()
    {
        NormalizeArray norm = new NormalizeArray();
        double[] input = { 1,5,10 };
        double[] output = norm.process(input);
        Assert.assertEquals(3, output.length);
        Assert.assertEquals(-1.0, output[0], Encog.DEFAULT_DOUBLE_EQUAL);
        Assert.assertEquals(1.0, output[2], Encog.DEFAULT_DOUBLE_EQUAL);
        Assert.assertEquals(1.0, norm.getStats().getActualLow(), Encog.DEFAULT_DOUBLE_EQUAL);
        Assert.assertEquals(10.0, norm.getStats().getActualHigh(), Encog.DEFAULT_DOUBLE_EQUAL);
    }
	
}
