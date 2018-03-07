package cn.devcenter.model.approval.event;

import cn.devcenter.model.approval.ApprovalProcessInstance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfterApprovedApprovalProcessInstanceEvent implements Serializable {

    private ApprovalProcessInstance approvalProcessInstance;

}
