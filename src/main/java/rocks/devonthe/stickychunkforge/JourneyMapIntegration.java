/*
 *  This file is part of StickyChunk by DevOnTheRocks, licensed under GPL-3.0
 *
 *  Copyright (C) 2017 DevOnTheRocks
 *
 *  This program is free software: you can redistribute it and/or modify it under
 *  the terms of the GNU General Public License as published by the Free Software
 *  Foundation, either version 3 of the License, or (at your option) any later version.
 *
 *  You should have received a copy of the GNU General Public License along with this program.
 *  If not, see http://www.gnu.org/licenses/.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * The above notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package rocks.devonthe.stickychunkforge;

import journeymap.client.api.ClientPlugin;
import journeymap.client.api.IClientAPI;
import journeymap.client.api.IClientPlugin;
import journeymap.client.api.event.ClientEvent;

@ClientPlugin
public class JourneyMapIntegration implements IClientPlugin {

	@Override
	public void initialize(IClientAPI client) {
		StickyChunkForge.getLogger().info(String.format("%s has successfully integrated with JourneyMap!", StickyChunkForge.NAME));
	}

	@Override
	public String getModId() {
		return StickyChunkForge.MODID;
	}

	@Override
	public void onEvent(ClientEvent event) {
		if (event.isCancelled()) return;

	}
}
