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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeSnapshotHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotHistoryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Snapshot> snapshots;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Snapshot> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}

	public static class Snapshot {

		private Long createdTime;

		private Long updatedTime;

		private String snapshotId;

		private String clientId;

		private String vaultId;

		private String jobId;

		private String snapshotHash;

		private String snapshotName;

		private String sourceType;

		private String source;

		private String parentHash;

		private String status;

		private Long size;

		private Long retention;

		private String snapshotOption;

		private Long duration;

		private Long completeTime;

		private Long errorCount;

		private Long bytesDone;

		private Long bytesTotal;

		private Long itemsDone;

		private Long itemsTotal;

		private Long actualBytes;

		private String exitCode;

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getSnapshotHash() {
			return this.snapshotHash;
		}

		public void setSnapshotHash(String snapshotHash) {
			this.snapshotHash = snapshotHash;
		}

		public String getSnapshotName() {
			return this.snapshotName;
		}

		public void setSnapshotName(String snapshotName) {
			this.snapshotName = snapshotName;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getParentHash() {
			return this.parentHash;
		}

		public void setParentHash(String parentHash) {
			this.parentHash = parentHash;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public String getSnapshotOption() {
			return this.snapshotOption;
		}

		public void setSnapshotOption(String snapshotOption) {
			this.snapshotOption = snapshotOption;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getErrorCount() {
			return this.errorCount;
		}

		public void setErrorCount(Long errorCount) {
			this.errorCount = errorCount;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public Long getItemsDone() {
			return this.itemsDone;
		}

		public void setItemsDone(Long itemsDone) {
			this.itemsDone = itemsDone;
		}

		public Long getItemsTotal() {
			return this.itemsTotal;
		}

		public void setItemsTotal(Long itemsTotal) {
			this.itemsTotal = itemsTotal;
		}

		public Long getActualBytes() {
			return this.actualBytes;
		}

		public void setActualBytes(Long actualBytes) {
			this.actualBytes = actualBytes;
		}

		public String getExitCode() {
			return this.exitCode;
		}

		public void setExitCode(String exitCode) {
			this.exitCode = exitCode;
		}
	}

	@Override
	public DescribeSnapshotHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
