/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.UpdateSchemaSubscribeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSchemaSubscribeResponseUnmarshaller {

	public static UpdateSchemaSubscribeResponse unmarshall(UpdateSchemaSubscribeResponse updateSchemaSubscribeResponse, UnmarshallerContext _ctx) {
		
		updateSchemaSubscribeResponse.setRequestId(_ctx.stringValue("UpdateSchemaSubscribeResponse.RequestId"));
	 
	 	return updateSchemaSubscribeResponse;
	}
}