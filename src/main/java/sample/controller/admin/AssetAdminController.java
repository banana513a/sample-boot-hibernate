package sample.controller.admin;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.Setter;
import sample.controller.ControllerSupport;
import sample.model.asset.CashInOut;
import sample.model.asset.CashInOut.FindCashInOut;
import sample.usecase.AssetAdminService;

/**
 * 資産に関わる社内のUI要求を処理します。
 */
@RestController
@RequestMapping("/api/admin/asset")
@Setter
public class AssetAdminController extends ControllerSupport {

    @Autowired
    private AssetAdminService service;

    /** 未処理の振込依頼情報を検索します。 */
    @GetMapping("/cio/")
    public List<CashInOut> findCashInOut(@Valid FindCashInOut p) {
        return service.findCashInOut(p);
    }

}
