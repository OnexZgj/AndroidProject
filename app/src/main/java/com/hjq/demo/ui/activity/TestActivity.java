package com.hjq.demo.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hjq.demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {


    @BindView(R.id.tv_aadd_sqdw)
    TextView tvAaddSqdw;
    @BindView(R.id.tv_aadd_bzbm)
    TextView tvAaddBzbm;
    @BindView(R.id.tv_aadd_bzr)
    TextView tvAaddBzr;
    @BindView(R.id.tv_aadd_sjhm)
    EditText tvAaddSjhm;
    @BindView(R.id.tv_aadd_gzbz)
    TextView tvAaddGzbz;
    @BindView(R.id.tv_aadd_dzxl)
    TextView tvAaddDzxl;
    @BindView(R.id.ll_aadd_jxfl)
    LinearLayout llAaddJxfl;
    @BindView(R.id.tv_aadd_gzlx)
    TextView tvAaddGzlx;
    @BindView(R.id.yxcs_image_zyfl)
    ImageView yxcsImageZyfl;
    @BindView(R.id.ll_aadd_gzlx)
    LinearLayout llAaddGzlx;
    @BindView(R.id.tv_aadd_zt)
    TextView tvAaddZt;
    @BindView(R.id.tv_aadd_jhkgsj)
    TextView tvAaddJhkgsj;
    @BindView(R.id.ll_aadd_jhkgsj)
    LinearLayout llAaddJhkgsj;
    @BindView(R.id.tv_aadd_jhwgsj)
    TextView tvAaddJhwgsj;
    @BindView(R.id.ll_aadd_jhwgsj)
    LinearLayout llAaddJhwgsj;
    @BindView(R.id.tv_aadd_sftd)
    TextView tvAaddSftd;
    @BindView(R.id.ll_aadd_sftd)
    LinearLayout llAaddSftd;
    @BindView(R.id.tv_aadd_sfysdfa)
    TextView tvAaddSfysdfa;
    @BindView(R.id.ll_aadd_sfysdfa)
    LinearLayout llAaddSfysdfa;
    @BindView(R.id.tv_aadd_jhtdkssj)
    TextView tvAaddJhtdkssj;
    @BindView(R.id.ll_aadd_jhtdkssj)
    LinearLayout llAaddJhtdkssj;
    @BindView(R.id.tv_aadd_jhtdjssj)
    TextView tvAaddJhtdjssj;
    @BindView(R.id.tv_aadd_sfddzy)
    TextView tvAaddSfddzy;
    @BindView(R.id.ll_aadd_sfddzy)
    LinearLayout llAaddSfddzy;
    @BindView(R.id.tv_aadd_sfww)
    TextView tvAaddSfww;
    @BindView(R.id.ll_aadd_sfww)
    LinearLayout llAaddSfww;
    @BindView(R.id.tv_aadd_ddgx)
    TextView tvAaddDdgx;
    @BindView(R.id.ll_aadd_ddgx)
    LinearLayout llAaddDdgx;
    @BindView(R.id.tv_aadd_pmsgzxz)
    TextView tvAaddPmsgzxz;
    @BindView(R.id.ll_aadd_pmsgzxz)
    LinearLayout llAaddPmsgzxz;
    @BindView(R.id.tv_aadd_jsdw)
    TextView tvAaddJsdw;
    @BindView(R.id.ll_aadd_jsdw)
    LinearLayout llAaddJsdw;
    @BindView(R.id.tv_aadd_jhtzyy)
    TextView tvAaddJhtzyy;
    @BindView(R.id.ll_aadd_jhtzyy)
    LinearLayout llAaddJhtzyy;
    @BindView(R.id.tv_aadd_ddgxgx)
    TextView tvAaddDdgxgx;
    @BindView(R.id.ll_aadd_ddgxgx)
    LinearLayout llAaddDdgxgx;
    @BindView(R.id.tv_aadd_gzfl)
    TextView tvAaddGzfl;
    @BindView(R.id.ll_aadd_gzfl)
    LinearLayout llAaddGzfl;
    @BindView(R.id.tv_aadd_sfyxtx)
    TextView tvAaddSfyxtx;
    @BindView(R.id.ll_aadd_sfyxtx)
    LinearLayout llAaddSfyxtx;
    @BindView(R.id.tv_aadd_zyfxlx)
    TextView tvAaddZyfxlx;
    @BindView(R.id.ll_aadd_zyfxlx)
    LinearLayout llAaddZyfxlx;
    @BindView(R.id.et_aadd_gznr)
    EditText etAaddGznr;
    @BindView(R.id.ll_fy_byqyt)
    LinearLayout llFyByqyt;
    @BindView(R.id.et_aadd_fyyq)
    EditText etAaddFyyq;
    @BindView(R.id.et_aadd_gkcs)
    EditText etAaddGkcs;
    @BindView(R.id.et_aadd_tdfw)
    EditText etAaddTdfw;
    @BindView(R.id.et_aadd_bz)
    EditText etAaddBz;
    @BindView(R.id.et_aadd_xczbfzr)
    EditText etAaddXczbfzr;
    @BindView(R.id.tv_aadd_zydl)
    TextView tvAaddZydl;
    @BindView(R.id.ll_aadd_zydl)
    LinearLayout llAaddZydl;
    @BindView(R.id.et_aadd_xcdbld)
    EditText etAaddXcdbld;
    @BindView(R.id.tv_aadd_zylx)
    TextView tvAaddZylx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.ll_aadd_jxfl, R.id.ll_aadd_gzlx, R.id.ll_aadd_jhkgsj, R.id.ll_aadd_jhwgsj, R.id.ll_aadd_sftd, R.id.ll_aadd_sfysdfa, R.id.ll_aadd_jhtdkssj, R.id.ll_aadd_sfddzy, R.id.ll_aadd_sfww, R.id.ll_aadd_ddgx, R.id.ll_aadd_pmsgzxz, R.id.ll_aadd_jsdw, R.id.ll_aadd_jhtzyy, R.id.ll_aadd_ddgxgx, R.id.ll_aadd_gzfl, R.id.ll_aadd_sfyxtx, R.id.ll_aadd_zyfxlx, R.id.ll_fy_byqyt, R.id.ll_aadd_zydl})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_aadd_jxfl:
                break;
            case R.id.ll_aadd_gzlx:
                break;
            case R.id.ll_aadd_jhkgsj:
                break;
            case R.id.ll_aadd_jhwgsj:
                break;
            case R.id.ll_aadd_sftd:
                break;
            case R.id.ll_aadd_sfysdfa:
                break;
            case R.id.ll_aadd_jhtdkssj:
                break;
            case R.id.ll_aadd_sfddzy:
                break;
            case R.id.ll_aadd_sfww:
                break;
            case R.id.ll_aadd_ddgx:
                break;
            case R.id.ll_aadd_pmsgzxz:
                break;
            case R.id.ll_aadd_jsdw:
                break;
            case R.id.ll_aadd_jhtzyy:
                break;
            case R.id.ll_aadd_ddgxgx:
                break;
            case R.id.ll_aadd_gzfl:
                break;
            case R.id.ll_aadd_sfyxtx:
                break;
            case R.id.ll_aadd_zyfxlx:
                break;
            case R.id.ll_fy_byqyt:
                break;
            case R.id.ll_aadd_zydl:
                break;
        }
    }
}
