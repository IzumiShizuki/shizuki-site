.class public final synthetic Lfa/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhg/b;


# direct methods
.method public synthetic constructor <init>(Lhg/b;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfa/k;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lfa/k;->b:Lhg/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 67

    move-object/from16 v0, p0

    iget v1, v0, Lfa/k;->a:I

    const/high16 v3, 0x41400000    # 12.0f

    const/16 v4, 0x1e

    const/16 v5, 0xa

    const/4 v6, 0x5

    const/4 v7, 0x2

    const/high16 v8, 0x40800000    # 4.0f

    const/high16 v9, 0x41000000    # 8.0f

    const/high16 v10, -0x3f000000    # -8.0f

    const/high16 v12, -0x3f400000    # -6.0f

    const v13, -0x3fd3d70a    # -2.69f

    const/16 v16, 0x1

    iget-object v2, v0, Lfa/k;->b:Lhg/b;

    const/4 v11, 0x0

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lx0/o;

    move-object/from16 v23, p2

    check-cast v23, Ljava/lang/Integer;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Integer;->intValue()I

    move-result v23

    and-int/lit8 v15, v23, 0x3

    if-eq v15, v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    and-int/lit8 v15, v23, 0x1

    invoke-virtual {v1, v15, v7}, Lx0/o;->N(IZ)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 1
    sget-object v7, Lfa/t;->a:[Lpc/u;

    aget-object v7, v7, v16

    invoke-static {v2, v7}, Lpc/f0;->G(Lhg/b;Lpc/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const v15, 0x402c28f6    # 2.69f

    const/high16 v7, 0x41500000    # 13.0f

    const/high16 v14, 0x41900000    # 18.0f

    if-eq v2, v6, :cond_6

    const/16 v6, 0x20

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_2

    .line 2
    sget-object v2, Lg8/a;->a:Lw1/f;

    if-eqz v2, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    new-instance v12, Lw1/e;

    const/16 v20, 0x0

    const/16 v22, 0x60

    const-string v13, "AutoMirrored.Filled.Forward"

    const/high16 v14, 0x41c00000    # 24.0f

    const/high16 v15, 0x41c00000    # 24.0f

    const/high16 v16, 0x41c00000    # 24.0f

    const/high16 v17, 0x41c00000    # 24.0f

    const-wide/16 v18, 0x0

    const/16 v21, 0x1

    invoke-direct/range {v12 .. v22}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 4
    sget v2, Lw1/g0;->a:I

    .line 5
    new-instance v2, Lq1/n0;

    .line 6
    sget-wide v4, Lq1/q;->b:J

    .line 7
    invoke-direct {v2, v4, v5}, Lq1/n0;-><init>(J)V

    .line 8
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    new-instance v5, Lw1/n;

    invoke-direct {v5, v3, v9}, Lw1/n;-><init>(FF)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v3, Lw1/a0;

    invoke-direct {v3, v8}, Lw1/a0;-><init>(F)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    new-instance v3, Lw1/u;

    invoke-direct {v3, v9, v9}, Lw1/u;-><init>(FF)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    new-instance v3, Lw1/u;

    invoke-direct {v3, v10, v9}, Lw1/u;-><init>(FF)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    new-instance v3, Lw1/z;

    const/high16 v5, -0x3f800000    # -4.0f

    invoke-direct {v3, v5}, Lw1/z;-><init>(F)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    new-instance v3, Lw1/l;

    invoke-direct {v3, v8}, Lw1/l;-><init>(F)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v3, Lw1/a0;

    invoke-direct {v3, v9}, Lw1/a0;-><init>(F)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    sget-object v3, Lw1/j;->c:Lw1/j;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-static {v12, v4, v11, v2}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 18
    invoke-virtual {v12}, Lw1/e;->b()Lw1/f;

    move-result-object v2

    .line 19
    sput-object v2, Lg8/a;->a:Lw1/f;

    :goto_1
    move-object/from16 v23, v2

    goto/16 :goto_2

    .line 20
    :cond_2
    sget-object v2, Ln7/e;->e:Lw1/f;

    if-eqz v2, :cond_3

    goto :goto_1

    .line 21
    :cond_3
    new-instance v25, Lw1/e;

    const/16 v33, 0x0

    const/16 v35, 0x60

    const/16 v34, 0x0

    const/high16 v27, 0x41c00000    # 24.0f

    const/high16 v28, 0x41c00000    # 24.0f

    const/high16 v29, 0x41c00000    # 24.0f

    const/high16 v30, 0x41c00000    # 24.0f

    const-wide/16 v31, 0x0

    const-string v26, "Filled.Forward30"

    invoke-direct/range {v25 .. v35}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v2, v25

    .line 22
    sget v3, Lw1/g0;->a:I

    .line 23
    new-instance v3, Lq1/n0;

    .line 24
    sget-wide v4, Lq1/q;->b:J

    .line 25
    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    .line 26
    invoke-static {v14, v7}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v25

    const/high16 v30, -0x3f400000    # -6.0f

    const/high16 v31, 0x40c00000    # 6.0f

    const/16 v26, 0x0

    const v27, 0x4053d70a    # 3.31f

    const v28, -0x3fd3d70a    # -2.69f

    const/high16 v29, 0x40c00000    # 6.0f

    .line 27
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    move-object/from16 v6, v25

    .line 28
    invoke-virtual {v6, v12, v13, v12, v12}, Lhd/q0;->w(FFFF)V

    const/high16 v7, 0x40c00000    # 6.0f

    .line 29
    invoke-virtual {v6, v15, v12, v7, v12}, Lhd/q0;->w(FFFF)V

    .line 30
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    const/high16 v7, -0x3f600000    # -5.0f

    const/high16 v12, 0x40a00000    # 5.0f

    .line 31
    invoke-virtual {v6, v12, v7}, Lhd/q0;->t(FF)V

    .line 32
    invoke-virtual {v6, v7, v7}, Lhd/q0;->t(FF)V

    .line 33
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    const/high16 v30, -0x3f000000    # -8.0f

    const/high16 v31, 0x41000000    # 8.0f

    const v26, -0x3f728f5c    # -4.42f

    const/16 v27, 0x0

    const/high16 v28, -0x3f000000    # -8.0f

    const v29, 0x40651eb8    # 3.58f

    .line 34
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    const/high16 v30, 0x41000000    # 8.0f

    const/16 v26, 0x0

    const v27, 0x408d70a4    # 4.42f

    const v28, 0x40651eb8    # 3.58f

    const/high16 v29, 0x41000000    # 8.0f

    .line 35
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    const v7, -0x3f9ae148    # -3.58f

    .line 36
    invoke-virtual {v6, v9, v7, v9, v10}, Lhd/q0;->w(FFFF)V

    .line 37
    invoke-virtual {v6, v14}, Lhd/q0;->q(F)V

    .line 38
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 39
    iget-object v6, v6, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 40
    invoke-static {v2, v6, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 41
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    const v6, 0x4120f5c3    # 10.06f

    const v7, 0x4176147b    # 15.38f

    .line 42
    invoke-static {v6, v7}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v22

    const v27, -0x40e147ae    # -0.62f

    const v28, -0x40f5c28f    # -0.54f

    const v23, -0x416b851f    # -0.29f

    const/16 v24, 0x0

    const v25, -0x40e147ae    # -0.62f

    const v26, -0x41d1eb85    # -0.17f

    .line 43
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    move-object/from16 v6, v22

    const v7, 0x410970a4    # 8.59f

    .line 44
    invoke-virtual {v6, v7}, Lhd/q0;->q(F)V

    const v27, 0x3fb9999a    # 1.45f

    const v28, 0x3f9d70a4    # 1.23f

    const/16 v23, 0x0

    const v24, 0x3f7851ec    # 0.97f

    const v25, 0x3f666666    # 0.9f

    const v26, 0x3f9d70a4    # 1.23f

    .line 45
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, 0x3fc147ae    # 1.51f

    const/high16 v28, -0x40600000    # -1.25f

    const v23, 0x3f5eb852    # 0.87f

    const/16 v24, 0x0

    const v25, 0x3fc147ae    # 1.51f

    const v26, -0x41147ae1    # -0.46f

    .line 46
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, -0x40ca3d71    # -0.71f

    const/high16 v28, -0x40800000    # -1.0f

    const/16 v23, 0x0

    const v24, -0x40d70a3d    # -0.66f

    const v25, -0x4119999a    # -0.45f

    const v26, -0x4099999a    # -0.9f

    .line 47
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, 0x3f266666    # 0.65f

    const v28, -0x40947ae1    # -0.92f

    const v23, 0x3de147ae    # 0.11f

    const v24, -0x42b33333    # -0.05f

    const v25, 0x3f266666    # 0.65f

    const v26, -0x415c28f6    # -0.32f

    .line 48
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, -0x4047ae14    # -1.44f

    const v28, -0x4063d70a    # -1.22f

    const/16 v23, 0x0

    const v24, -0x41a8f5c3    # -0.21f

    const v25, -0x42b33333    # -0.05f

    const v26, -0x4063d70a    # -1.22f

    .line 49
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, -0x404ccccd    # -1.4f

    const v28, 0x3f947ae1    # 1.16f

    const v23, -0x40e147ae    # -0.62f

    const/16 v24, 0x0

    const v25, -0x404ccccd    # -1.4f

    const v26, 0x3eb33333    # 0.35f

    .line 50
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v7, 0x3f59999a    # 0.85f

    .line 51
    invoke-virtual {v6, v7}, Lhd/q0;->r(F)V

    const v27, 0x3f11eb85    # 0.57f

    const v28, -0x410a3d71    # -0.48f

    const/16 v23, 0x0

    const v24, -0x4151eb85    # -0.34f

    const v25, 0x3e9eb852    # 0.31f

    const v26, -0x410a3d71    # -0.48f

    .line 52
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, 0x3f147ae1    # 0.58f

    const v28, 0x3f0a3d71    # 0.54f

    const v23, 0x3f170a3d    # 0.59f

    const/16 v24, 0x0

    const v25, 0x3f147ae1    # 0.58f

    const/high16 v26, 0x3f000000    # 0.5f

    .line 53
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, -0x40deb852    # -0.63f

    const v28, 0x3f170a3d    # 0.59f

    const/16 v23, 0x0

    const v24, 0x3f051eb8    # 0.52f

    const v25, -0x412e147b    # -0.41f

    const v26, 0x3f170a3d    # 0.59f

    .line 54
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v7, 0x4118f5c3    # 9.56f

    .line 55
    invoke-virtual {v6, v7}, Lhd/q0;->q(F)V

    const v7, 0x3f28f5c3    # 0.66f

    .line 56
    invoke-virtual {v6, v7}, Lhd/q0;->z(F)V

    const v7, 0x3ee66666    # 0.45f

    .line 57
    invoke-virtual {v6, v7}, Lhd/q0;->r(F)V

    const v27, 0x3f333333    # 0.7f

    const v28, 0x3f23d70a    # 0.64f

    const v23, 0x3f266666    # 0.65f

    const/16 v24, 0x0

    const v25, 0x3f333333    # 0.7f

    const v26, 0x3ed70a3d    # 0.42f

    .line 58
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, 0x4120f5c3    # 10.06f

    const v28, 0x4176147b    # 15.38f

    const v23, 0x412b5c29    # 10.71f

    const v24, 0x4171c28f    # 15.11f

    const/high16 v25, 0x41280000    # 10.5f

    const v26, 0x4176147b    # 15.38f

    .line 59
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->m(FFFFFF)V

    .line 60
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 61
    iget-object v6, v6, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 62
    invoke-static {v2, v6, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 63
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    const v4, 0x415d999a    # 13.85f

    const v5, 0x413ae148    # 11.68f

    .line 64
    invoke-static {v4, v5}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v22

    const v27, -0x4047ae14    # -1.44f

    const v28, 0x3fe8f5c3    # 1.82f

    const v23, -0x41f0a3d7    # -0.14f

    const/16 v24, 0x0

    const v25, -0x4047ae14    # -1.44f

    const v26, -0x425c28f6    # -0.08f

    .line 65
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    move-object/from16 v4, v22

    const v5, 0x3f3d70a4    # 0.74f

    .line 66
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v27, 0x3fb851ec    # 1.44f

    const/16 v23, 0x0

    const v24, 0x3ff33333    # 1.9f

    const v25, 0x3fa7ae14    # 1.31f

    const v26, 0x3fe8f5c3    # 1.82f

    .line 67
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v28, -0x40170a3d    # -1.82f

    const v23, 0x3e0f5c29    # 0.14f

    const/16 v24, 0x0

    const v25, 0x3fb851ec    # 1.44f

    const v26, 0x3db851ec    # 0.09f

    .line 68
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const/high16 v5, 0x41580000    # 13.5f

    .line 69
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    const v27, 0x415d999a    # 13.85f

    const v28, 0x413ae148    # 11.68f

    const v23, 0x4174cccd    # 15.3f

    const v24, 0x413970a4    # 11.59f

    const v25, 0x415fd70a    # 13.99f

    const v26, 0x413ae148    # 11.68f

    .line 70
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->m(FFFFFF)V

    .line 71
    invoke-virtual {v4}, Lhd/q0;->l()V

    const v5, 0x41673333    # 14.45f

    const v6, 0x4165999a    # 14.35f

    .line 72
    invoke-virtual {v4, v5, v6}, Lhd/q0;->u(FF)V

    const v27, -0x40e8f5c3    # -0.59f

    const v28, 0x3f83d70a    # 1.03f

    const/16 v23, 0x0

    const v24, 0x3f451eb8    # 0.77f

    const v25, -0x41a8f5c3    # -0.21f

    const v26, 0x3f83d70a    # 1.03f

    .line 73
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, -0x40e66666    # -0.6f

    const v28, -0x407c28f6    # -1.03f

    const v23, -0x413d70a4    # -0.38f

    const/16 v24, 0x0

    const v25, -0x40e66666    # -0.6f

    const v26, -0x417ae148    # -0.26f

    .line 74
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x4087ae14    # -0.97f

    .line 75
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v27, 0x3f170a3d    # 0.59f

    const v28, -0x407eb852    # -1.01f

    const/16 v23, 0x0

    const/high16 v24, -0x40c00000    # -0.75f

    const v25, 0x3e6147ae    # 0.22f

    const v26, -0x407eb852    # -1.01f

    .line 76
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v27, 0x3f19999a    # 0.6f

    const v28, 0x3f8147ae    # 1.01f

    const v23, 0x3ec28f5c    # 0.38f

    const/16 v24, 0x0

    const v25, 0x3f19999a    # 0.6f

    const v26, 0x3e851eb8    # 0.26f

    .line 77
    invoke-virtual/range {v22 .. v28}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x4165999a    # 14.35f

    .line 78
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    .line 79
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 80
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 81
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 82
    invoke-virtual {v2}, Lw1/e;->b()Lw1/f;

    move-result-object v2

    .line 83
    sput-object v2, Ln7/e;->e:Lw1/f;

    goto/16 :goto_1

    .line 84
    :cond_4
    sget-object v2, Ln7/d;->f:Lw1/f;

    if-eqz v2, :cond_5

    goto/16 :goto_1

    .line 85
    :cond_5
    new-instance v25, Lw1/e;

    const/16 v33, 0x0

    const/16 v35, 0x60

    const/16 v34, 0x0

    const/high16 v27, 0x41c00000    # 24.0f

    const/high16 v28, 0x41c00000    # 24.0f

    const/high16 v29, 0x41c00000    # 24.0f

    const/high16 v30, 0x41c00000    # 24.0f

    const-wide/16 v31, 0x0

    const-string v26, "Filled.Forward10"

    invoke-direct/range {v25 .. v35}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v2, v25

    .line 86
    sget v3, Lw1/g0;->a:I

    .line 87
    new-instance v3, Lq1/n0;

    .line 88
    sget-wide v4, Lq1/q;->b:J

    .line 89
    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    .line 90
    invoke-static {v14, v7}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v25

    const/high16 v30, -0x3f400000    # -6.0f

    const/high16 v31, 0x40c00000    # 6.0f

    const/16 v26, 0x0

    const v27, 0x4053d70a    # 3.31f

    const v28, -0x3fd3d70a    # -2.69f

    const/high16 v29, 0x40c00000    # 6.0f

    .line 91
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    move-object/from16 v7, v25

    .line 92
    invoke-virtual {v7, v12, v13, v12, v12}, Lhd/q0;->w(FFFF)V

    const/high16 v13, 0x40c00000    # 6.0f

    .line 93
    invoke-virtual {v7, v15, v12, v13, v12}, Lhd/q0;->w(FFFF)V

    .line 94
    invoke-virtual {v7, v8}, Lhd/q0;->z(F)V

    const/high16 v12, -0x3f600000    # -5.0f

    const/high16 v13, 0x40a00000    # 5.0f

    .line 95
    invoke-virtual {v7, v13, v12}, Lhd/q0;->t(FF)V

    .line 96
    invoke-virtual {v7, v12, v12}, Lhd/q0;->t(FF)V

    .line 97
    invoke-virtual {v7, v8}, Lhd/q0;->z(F)V

    const/high16 v30, -0x3f000000    # -8.0f

    const/high16 v31, 0x41000000    # 8.0f

    const v26, -0x3f728f5c    # -4.42f

    const/16 v27, 0x0

    const/high16 v28, -0x3f000000    # -8.0f

    const v29, 0x40651eb8    # 3.58f

    .line 98
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    const/high16 v30, 0x41000000    # 8.0f

    const/16 v26, 0x0

    const v27, 0x408d70a4    # 4.42f

    const v28, 0x40651eb8    # 3.58f

    const/high16 v29, 0x41000000    # 8.0f

    .line 99
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    const v8, -0x3f9ae148    # -3.58f

    .line 100
    invoke-virtual {v7, v9, v8, v9, v10}, Lhd/q0;->w(FFFF)V

    .line 101
    invoke-virtual {v7, v14}, Lhd/q0;->q(F)V

    .line 102
    invoke-virtual {v7}, Lhd/q0;->l()V

    .line 103
    iget-object v7, v7, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 104
    invoke-static {v2, v7, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 105
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    .line 106
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 107
    new-instance v6, Lw1/n;

    const v8, 0x412dc28f    # 10.86f

    const v9, 0x417f0a3d    # 15.94f

    invoke-direct {v6, v8, v9}, Lw1/n;-><init>(FF)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    new-instance v6, Lw1/u;

    const/4 v8, 0x0

    const v9, -0x3f775c29    # -4.27f

    invoke-direct {v6, v8, v9}, Lw1/u;-><init>(FF)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    new-instance v6, Lw1/u;

    const v9, -0x4247ae14    # -0.09f

    invoke-direct {v6, v9, v8}, Lw1/u;-><init>(FF)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    new-instance v6, Lw1/u;

    const v8, -0x401d70a4    # -1.77f

    const v9, 0x3f2147ae    # 0.63f

    invoke-direct {v6, v8, v9}, Lw1/u;-><init>(FF)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    new-instance v6, Lw1/u;

    const/4 v8, 0x0

    const v9, 0x3f30a3d7    # 0.69f

    invoke-direct {v6, v8, v9}, Lw1/u;-><init>(FF)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    new-instance v6, Lw1/u;

    const v8, 0x3f8147ae    # 1.01f

    const v9, -0x416147ae    # -0.31f

    invoke-direct {v6, v8, v9}, Lw1/u;-><init>(FF)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    new-instance v6, Lw1/u;

    const/4 v8, 0x0

    const v9, 0x4050a3d7    # 3.26f

    invoke-direct {v6, v8, v9}, Lw1/u;-><init>(FF)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    sget-object v6, Lw1/j;->c:Lw1/j;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    invoke-static {v2, v7, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 116
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    .line 117
    new-instance v4, Lhd/q0;

    const/4 v5, 0x6

    invoke-direct {v4, v11, v5}, Lhd/q0;-><init>(BI)V

    const/high16 v5, 0x41440000    # 12.25f

    const v6, 0x41570a3d    # 13.44f

    .line 118
    invoke-virtual {v4, v5, v6}, Lhd/q0;->u(FF)V

    const v5, 0x3f3d70a4    # 0.74f

    .line 119
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v28, 0x3fb851ec    # 1.44f

    const v29, 0x3fe8f5c3    # 1.82f

    const/16 v24, 0x0

    const v25, 0x3ff33333    # 1.9f

    const v26, 0x3fa7ae14    # 1.31f

    const v27, 0x3fe8f5c3    # 1.82f

    move-object/from16 v23, v4

    .line 120
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->n(FFFFFF)V

    const v29, -0x40170a3d    # -1.82f

    const v24, 0x3e0f5c29    # 0.14f

    const/16 v25, 0x0

    const v26, 0x3fb851ec    # 1.44f

    const v27, 0x3db851ec    # 0.09f

    .line 121
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x40c28f5c    # -0.74f

    .line 122
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v28, -0x4047ae14    # -1.44f

    const/16 v24, 0x0

    const v25, -0x400ccccd    # -1.9f

    const v26, -0x405851ec    # -1.31f

    const v27, -0x40170a3d    # -1.82f

    .line 123
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->n(FFFFFF)V

    const/high16 v28, 0x41440000    # 12.25f

    const v29, 0x41570a3d    # 13.44f

    const v24, 0x4158cccd    # 13.55f

    const v25, 0x4139eb85    # 11.62f

    const/high16 v26, 0x41440000    # 12.25f

    const v27, 0x41387ae1    # 11.53f

    .line 124
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->m(FFFFFF)V

    .line 125
    invoke-virtual {v4}, Lhd/q0;->l()V

    const v5, 0x4164a3d7    # 14.29f

    const v6, 0x41551eb8    # 13.32f

    .line 126
    invoke-virtual {v4, v5, v6}, Lhd/q0;->u(FF)V

    const v5, 0x3f7851ec    # 0.97f

    .line 127
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v28, -0x40e8f5c3    # -0.59f

    const v29, 0x3f83d70a    # 1.03f

    const/16 v24, 0x0

    const v25, 0x3f451eb8    # 0.77f

    const v26, -0x41a8f5c3    # -0.21f

    const v27, 0x3f83d70a    # 1.03f

    .line 128
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->n(FFFFFF)V

    const v28, -0x40e66666    # -0.6f

    const v29, -0x407c28f6    # -1.03f

    const v24, -0x413d70a4    # -0.38f

    const/16 v25, 0x0

    const v26, -0x40e66666    # -0.6f

    const v27, -0x417ae148    # -0.26f

    .line 129
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x4087ae14    # -0.97f

    .line 130
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v28, 0x3f170a3d    # 0.59f

    const v29, -0x407eb852    # -1.01f

    const/16 v24, 0x0

    const/high16 v25, -0x40c00000    # -0.75f

    const v26, 0x3e6147ae    # 0.22f

    const v27, -0x407eb852    # -1.01f

    .line 131
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->n(FFFFFF)V

    const v28, 0x4164a3d7    # 14.29f

    const v29, 0x41551eb8    # 13.32f

    const v24, 0x41611eb8    # 14.07f

    const v25, 0x4144cccd    # 12.3f

    const v26, 0x4164a3d7    # 14.29f

    const v27, 0x41491eb8    # 12.57f

    .line 132
    invoke-virtual/range {v23 .. v29}, Lhd/q0;->m(FFFFFF)V

    .line 133
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 134
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 135
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 136
    invoke-virtual {v2}, Lw1/e;->b()Lw1/f;

    move-result-object v2

    .line 137
    sput-object v2, Ln7/d;->f:Lw1/f;

    goto/16 :goto_1

    .line 138
    :cond_6
    sget-object v2, Lu3/x0;->h:Lw1/f;

    if-eqz v2, :cond_7

    goto/16 :goto_1

    .line 139
    :cond_7
    new-instance v25, Lw1/e;

    const/16 v33, 0x0

    const/16 v35, 0x60

    const/16 v34, 0x0

    const/high16 v27, 0x41c00000    # 24.0f

    const/high16 v28, 0x41c00000    # 24.0f

    const/high16 v29, 0x41c00000    # 24.0f

    const/high16 v30, 0x41c00000    # 24.0f

    const-wide/16 v31, 0x0

    const-string v26, "Filled.Forward5"

    invoke-direct/range {v25 .. v35}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v2, v25

    .line 140
    sget v3, Lw1/g0;->a:I

    .line 141
    new-instance v3, Lq1/n0;

    .line 142
    sget-wide v4, Lq1/q;->b:J

    .line 143
    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    .line 144
    invoke-static {v14, v7}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v25

    const/high16 v30, -0x3f400000    # -6.0f

    const/high16 v31, 0x40c00000    # 6.0f

    const/16 v26, 0x0

    const v27, 0x4053d70a    # 3.31f

    const v28, -0x3fd3d70a    # -2.69f

    const/high16 v29, 0x40c00000    # 6.0f

    .line 145
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    move-object/from16 v6, v25

    .line 146
    invoke-virtual {v6, v12, v13, v12, v12}, Lhd/q0;->w(FFFF)V

    const/high16 v13, 0x40c00000    # 6.0f

    .line 147
    invoke-virtual {v6, v15, v12, v13, v12}, Lhd/q0;->w(FFFF)V

    .line 148
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    const/high16 v7, -0x3f600000    # -5.0f

    const/high16 v13, 0x40a00000    # 5.0f

    .line 149
    invoke-virtual {v6, v13, v7}, Lhd/q0;->t(FF)V

    .line 150
    invoke-virtual {v6, v7, v7}, Lhd/q0;->t(FF)V

    .line 151
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    const/high16 v30, -0x3f000000    # -8.0f

    const/high16 v31, 0x41000000    # 8.0f

    const v26, -0x3f728f5c    # -4.42f

    const/16 v27, 0x0

    const/high16 v28, -0x3f000000    # -8.0f

    const v29, 0x40651eb8    # 3.58f

    .line 152
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    const/high16 v30, 0x41000000    # 8.0f

    const/16 v26, 0x0

    const v27, 0x408d70a4    # 4.42f

    const v28, 0x40651eb8    # 3.58f

    const/high16 v29, 0x41000000    # 8.0f

    .line 153
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    const/high16 v31, -0x3f000000    # -8.0f

    const v26, 0x408d70a4    # 4.42f

    const/16 v27, 0x0

    const/high16 v28, 0x41000000    # 8.0f

    const v29, -0x3f9ae148    # -3.58f

    .line 154
    invoke-virtual/range {v25 .. v31}, Lhd/q0;->n(FFFFFF)V

    .line 155
    invoke-virtual {v6, v14}, Lhd/q0;->q(F)V

    .line 156
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 157
    iget-object v6, v6, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 158
    invoke-static {v2, v6, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 159
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v4, v5}, Lq1/n0;-><init>(J)V

    const v4, 0x41407ae1    # 12.03f

    const v7, 0x4176147b    # 15.38f

    .line 160
    invoke-static {v4, v7}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v12

    const v17, -0x40e66666    # -0.6f

    const v18, -0x40f0a3d7    # -0.56f

    const v13, -0x411eb852    # -0.44f

    const/4 v14, 0x0

    const v15, -0x40eb851f    # -0.58f

    const v16, -0x416147ae    # -0.31f

    .line 161
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->n(FFFFFF)V

    const v4, -0x40a8f5c3    # -0.84f

    .line 162
    invoke-virtual {v12, v4}, Lhd/q0;->r(F)V

    const v17, 0x3fb851ec    # 1.44f

    const/high16 v18, 0x3fa00000    # 1.25f

    const v13, 0x3cf5c28f    # 0.03f

    const v14, 0x3f59999a    # 0.85f

    const v15, 0x3f4a3d71    # 0.79f

    const/high16 v16, 0x3fa00000    # 1.25f

    .line 163
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->n(FFFFFF)V

    const v18, -0x4048f5c3    # -1.43f

    const v13, 0x3f6e147b    # 0.93f

    const/4 v14, 0x0

    const v15, 0x3fb851ec    # 1.44f

    const v16, -0x40deb852    # -0.63f

    .line 164
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->n(FFFFFF)V

    const v17, -0x4059999a    # -1.3f

    const v18, -0x4047ae14    # -1.44f

    const/4 v13, 0x0

    const v14, -0x4055c28f    # -1.33f

    const v15, -0x4087ae14    # -0.97f

    const v16, -0x4047ae14    # -1.44f

    .line 165
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->n(FFFFFF)V

    const v17, -0x40dc28f6    # -0.64f

    const v18, 0x3e23d70a    # 0.16f

    const v13, -0x41b33333    # -0.2f

    const/4 v14, 0x0

    const v15, -0x4123d70a    # -0.43f

    const v16, 0x3d4ccccd    # 0.05f

    .line 166
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->n(FFFFFF)V

    const v4, 0x3de147ae    # 0.11f

    const v5, -0x40947ae1    # -0.92f

    .line 167
    invoke-virtual {v12, v4, v5}, Lhd/q0;->t(FF)V

    const v4, 0x3fd9999a    # 1.7f

    .line 168
    invoke-virtual {v12, v4}, Lhd/q0;->r(F)V

    const v4, -0x40ca3d71    # -0.71f

    .line 169
    invoke-virtual {v12, v4}, Lhd/q0;->z(F)V

    const v4, -0x3fe70a3d    # -2.39f

    .line 170
    invoke-virtual {v12, v4}, Lhd/q0;->r(F)V

    const/high16 v4, -0x41800000    # -0.25f

    const v5, 0x400ae148    # 2.17f

    .line 171
    invoke-virtual {v12, v4, v5}, Lhd/q0;->t(FF)V

    const v4, 0x3f2b851f    # 0.67f

    const v5, 0x3e2e147b    # 0.17f

    .line 172
    invoke-virtual {v12, v4, v5}, Lhd/q0;->t(FF)V

    const v17, 0x3f11eb85    # 0.57f

    const v18, -0x41947ae1    # -0.23f

    const v13, 0x3e051eb8    # 0.13f

    const v14, -0x41fae148    # -0.13f

    const v15, 0x3e8f5c29    # 0.28f

    const v16, -0x41947ae1    # -0.23f

    .line 173
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->n(FFFFFF)V

    const v17, 0x3f30a3d7    # 0.69f

    const/high16 v18, 0x3f400000    # 0.75f

    const v13, 0x3ecccccd    # 0.4f

    const/4 v14, 0x0

    const v15, 0x3f30a3d7    # 0.69f

    const v16, 0x3e6b851f    # 0.23f

    .line 174
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->n(FFFFFF)V

    const v17, 0x41407ae1    # 12.03f

    const v18, 0x4176147b    # 15.38f

    const v13, 0x4149eb85    # 12.62f

    const v14, 0x416a3d71    # 14.64f

    const v15, 0x414a6666    # 12.65f

    const v16, 0x4176147b    # 15.38f

    .line 175
    invoke-virtual/range {v12 .. v18}, Lhd/q0;->m(FFFFFF)V

    .line 176
    invoke-virtual {v12}, Lhd/q0;->l()V

    .line 177
    iget-object v4, v12, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 178
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 179
    invoke-virtual {v2}, Lw1/e;->b()Lw1/f;

    move-result-object v2

    .line 180
    sput-object v2, Lu3/x0;->h:Lw1/f;

    goto/16 :goto_1

    .line 181
    :goto_2
    sget-object v2, Lm0/c1;->a:Lx0/o2;

    .line 182
    invoke-virtual {v1, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v2

    .line 183
    check-cast v2, Lm0/b1;

    .line 184
    invoke-virtual {v2}, Lm0/b1;->c()J

    move-result-wide v26

    const/16 v29, 0x30

    const/16 v30, 0x4

    .line 185
    const-string v24, "musicForward"

    const/16 v25, 0x0

    move-object/from16 v28, v1

    invoke-static/range {v23 .. v30}, Lm0/r3;->b(Lw1/f;Ljava/lang/String;Lj1/q;JLx0/o;II)V

    goto :goto_3

    :cond_8
    move-object/from16 v28, v1

    .line 186
    invoke-virtual/range {v28 .. v28}, Lx0/o;->Q()V

    .line 187
    :goto_3
    sget-object v1, Lub/a0;->a:Lub/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lx0/o;

    move-object/from16 v14, p2

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    and-int/lit8 v15, v14, 0x3

    if-eq v15, v7, :cond_9

    const/4 v7, 0x1

    goto :goto_4

    :cond_9
    const/4 v7, 0x0

    :goto_4
    and-int/lit8 v14, v14, 0x1

    invoke-virtual {v1, v14, v7}, Lx0/o;->N(IZ)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 188
    sget-object v7, Lfa/t;->a:[Lpc/u;

    aget-object v7, v7, v11

    invoke-static {v2, v7}, Lpc/f0;->G(Lhg/b;Lpc/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v15, 0x40e00000    # 7.0f

    if-eq v2, v6, :cond_e

    const v14, -0x41c7ae14    # -0.18f

    if-eq v2, v5, :cond_c

    if-eq v2, v4, :cond_a

    .line 189
    invoke-static {}, Lnh/b;->x()Lw1/f;

    move-result-object v2

    goto/16 :goto_5

    .line 190
    :cond_a
    sget-object v2, Lnd/h;->i:Lw1/f;

    if-eqz v2, :cond_b

    goto/16 :goto_5

    .line 191
    :cond_b
    new-instance v47, Lw1/e;

    const/16 v55, 0x0

    const/16 v57, 0x60

    const/16 v56, 0x0

    const/high16 v49, 0x41c00000    # 24.0f

    const/high16 v50, 0x41c00000    # 24.0f

    const/high16 v51, 0x41c00000    # 24.0f

    const/high16 v52, 0x41c00000    # 24.0f

    const-wide/16 v53, 0x0

    const-string v48, "Filled.Replay30"

    invoke-direct/range {v47 .. v57}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v2, v47

    .line 192
    sget v4, Lw1/g0;->a:I

    .line 193
    new-instance v4, Lq1/n0;

    .line 194
    sget-wide v9, Lq1/q;->b:J

    .line 195
    invoke-direct {v4, v9, v10}, Lq1/n0;-><init>(J)V

    .line 196
    new-instance v5, Lhd/q0;

    const/4 v6, 0x6

    invoke-direct {v5, v11, v6}, Lhd/q0;-><init>(BI)V

    const/high16 v6, 0x40a00000    # 5.0f

    .line 197
    invoke-virtual {v5, v3, v6}, Lhd/q0;->u(FF)V

    .line 198
    invoke-virtual {v5, v7}, Lhd/q0;->y(F)V

    const/high16 v7, 0x40c00000    # 6.0f

    .line 199
    invoke-virtual {v5, v15, v7}, Lhd/q0;->s(FF)V

    .line 200
    invoke-virtual {v5, v6, v6}, Lhd/q0;->t(FF)V

    .line 201
    invoke-virtual {v5, v15}, Lhd/q0;->y(F)V

    const/high16 v53, 0x40c00000    # 6.0f

    const/high16 v54, 0x40c00000    # 6.0f

    const v49, 0x4053d70a    # 3.31f

    const/16 v50, 0x0

    const/high16 v51, 0x40c00000    # 6.0f

    const v52, 0x402c28f6    # 2.69f

    move-object/from16 v48, v5

    .line 202
    invoke-virtual/range {v48 .. v54}, Lhd/q0;->n(FFFFFF)V

    .line 203
    invoke-virtual {v5, v13, v7, v12, v7}, Lhd/q0;->w(FFFF)V

    .line 204
    invoke-virtual {v5, v12, v13, v12, v12}, Lhd/q0;->w(FFFF)V

    .line 205
    invoke-virtual {v5, v8}, Lhd/q0;->q(F)V

    const/high16 v53, 0x41000000    # 8.0f

    const/high16 v54, 0x41000000    # 8.0f

    const/16 v49, 0x0

    const v50, 0x408d70a4    # 4.42f

    const v51, 0x40651eb8    # 3.58f

    const/high16 v52, 0x41000000    # 8.0f

    .line 206
    invoke-virtual/range {v48 .. v54}, Lhd/q0;->n(FFFFFF)V

    const/high16 v6, 0x41000000    # 8.0f

    const/high16 v7, -0x3f000000    # -8.0f

    const v8, -0x3f9ae148    # -3.58f

    .line 207
    invoke-virtual {v5, v6, v8, v6, v7}, Lhd/q0;->w(FFFF)V

    const v6, 0x41835c29    # 16.42f

    const/high16 v13, 0x40a00000    # 5.0f

    .line 208
    invoke-virtual {v5, v6, v13, v3, v13}, Lhd/q0;->v(FFFF)V

    .line 209
    invoke-virtual {v5}, Lhd/q0;->l()V

    .line 210
    iget-object v3, v5, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 211
    invoke-static {v2, v3, v11, v4}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 212
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v9, v10}, Lq1/n0;-><init>(J)V

    .line 213
    new-instance v4, Lhd/q0;

    const/4 v5, 0x6

    invoke-direct {v4, v11, v5}, Lhd/q0;-><init>(BI)V

    const v5, 0x4157d70a    # 13.49f

    const v6, 0x4118f5c3    # 9.56f

    .line 214
    invoke-virtual {v4, v6, v5}, Lhd/q0;->u(FF)V

    const v5, 0x3ee66666    # 0.45f

    .line 215
    invoke-virtual {v4, v5}, Lhd/q0;->r(F)V

    const v52, 0x3ef5c28f    # 0.48f

    const v53, -0x41dc28f6    # -0.16f

    const v48, 0x3e570a3d    # 0.21f

    const v50, 0x3ebd70a4    # 0.37f

    const v51, -0x42b33333    # -0.05f

    move-object/from16 v47, v4

    .line 216
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x4123d70a    # -0.43f

    const v6, 0x3e23d70a    # 0.16f

    const/high16 v7, -0x41800000    # -0.25f

    .line 217
    invoke-virtual {v4, v6, v7, v6, v5}, Lhd/q0;->w(FFFF)V

    const v52, -0x42dc28f6    # -0.04f

    const v53, -0x419eb852    # -0.22f

    const/16 v48, 0x0

    const v49, -0x425c28f6    # -0.08f

    const v50, -0x43dc28f6    # -0.01f

    const v51, -0x41e66666    # -0.15f

    .line 218
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x428a3d71    # -0.06f

    const v6, -0x421eb852    # -0.11f

    const v8, -0x41d1eb85    # -0.17f

    const v12, -0x420a3d71    # -0.12f

    .line 219
    invoke-virtual {v4, v5, v12, v6, v8}, Lhd/q0;->w(FFFF)V

    const v5, -0x4247ae14    # -0.09f

    .line 220
    invoke-virtual {v4, v6, v5, v14, v6}, Lhd/q0;->w(FFFF)V

    const v6, -0x41dc28f6    # -0.16f

    const v8, -0x42dc28f6    # -0.04f

    .line 221
    invoke-virtual {v4, v6, v8, v7, v8}, Lhd/q0;->w(FFFF)V

    const v52, -0x419eb852    # -0.22f

    const v53, 0x3cf5c28f    # 0.03f

    const v48, -0x425c28f6    # -0.08f

    const/16 v49, 0x0

    const v50, -0x41e66666    # -0.15f

    const v51, 0x3c23d70a    # 0.01f

    .line 222
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v6, 0x3dcccccd    # 0.1f

    const v7, -0x41fae148    # -0.13f

    const v8, 0x3d4ccccd    # 0.05f

    .line 223
    invoke-virtual {v4, v7, v8, v14, v6}, Lhd/q0;->w(FFFF)V

    const v6, 0x3db851ec    # 0.09f

    const v7, 0x3e19999a    # 0.15f

    .line 224
    invoke-virtual {v4, v5, v6, v12, v7}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e051eb8    # 0.13f

    const v6, -0x42b33333    # -0.05f

    const v7, 0x3e4ccccd    # 0.2f

    .line 225
    invoke-virtual {v4, v6, v5, v6, v7}, Lhd/q0;->w(FFFF)V

    const v5, 0x410a6666    # 8.65f

    .line 226
    invoke-virtual {v4, v5}, Lhd/q0;->q(F)V

    const v52, 0x3de147ae    # 0.11f

    const v53, -0x410a3d71    # -0.48f

    const/16 v48, 0x0

    const v49, -0x41c7ae14    # -0.18f

    const v50, 0x3d23d70a    # 0.04f

    const v51, -0x4151eb85    # -0.34f

    .line 227
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3e2e147b    # 0.17f

    const v6, -0x41428f5c    # -0.37f

    const v7, -0x4175c28f    # -0.27f

    const v8, 0x3e99999a    # 0.3f

    .line 228
    invoke-virtual {v4, v5, v7, v8, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x3ee147ae    # 0.44f

    const v6, 0x3e8a3d71    # 0.27f

    const v7, -0x41947ae1    # -0.23f

    .line 229
    invoke-virtual {v4, v6, v14, v5, v7}, Lhd/q0;->w(FFFF)V

    const v5, 0x3eb33333    # 0.35f

    const v6, 0x3f0a3d71    # 0.54f

    const v7, -0x425c28f6    # -0.08f

    .line 230
    invoke-virtual {v4, v5, v7, v6, v7}, Lhd/q0;->w(FFFF)V

    const v52, 0x3f170a3d    # 0.59f

    const v53, 0x3da3d70a    # 0.08f

    const v48, 0x3e570a3d    # 0.21f

    const/16 v49, 0x0

    const v50, 0x3ed1eb85    # 0.41f

    const v51, 0x3cf5c28f    # 0.03f

    .line 231
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3eeb851f    # 0.46f

    const v6, 0x3ea8f5c3    # 0.33f

    const v7, 0x3e051eb8    # 0.13f

    const v8, 0x3e6b851f    # 0.23f

    .line 232
    invoke-virtual {v4, v6, v7, v5, v8}, Lhd/q0;->w(FFFF)V

    const v5, 0x3ec28f5c    # 0.38f

    const v7, 0x3e99999a    # 0.3f

    .line 233
    invoke-virtual {v4, v8, v8, v7, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3f07ae14    # 0.53f

    const v7, 0x3de147ae    # 0.11f

    .line 234
    invoke-virtual {v4, v7, v6, v7, v5}, Lhd/q0;->w(FFFF)V

    const v52, -0x42dc28f6    # -0.04f

    const v53, 0x3e8a3d71    # 0.27f

    const/16 v48, 0x0

    const v49, 0x3db851ec    # 0.09f

    const v50, -0x43dc28f6    # -0.01f

    const v51, 0x3e3851ec    # 0.18f

    .line 235
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3e2e147b    # 0.17f

    const v6, -0x4270a3d7    # -0.07f

    const v7, -0x41fae148    # -0.13f

    const/high16 v8, 0x3e800000    # 0.25f

    .line 236
    invoke-virtual {v4, v6, v5, v7, v8}, Lhd/q0;->w(FFFF)V

    const v6, 0x3e6147ae    # 0.22f

    const v7, -0x41b33333    # -0.2f

    const v8, 0x3e19999a    # 0.15f

    const v12, -0x420a3d71    # -0.12f

    .line 237
    invoke-virtual {v4, v12, v8, v7, v6}, Lhd/q0;->w(FFFF)V

    const v6, -0x4170a3d7    # -0.28f

    const v7, 0x3df5c28f    # 0.12f

    const v8, -0x41d1eb85    # -0.17f

    .line 238
    invoke-virtual {v4, v8, v7, v6, v5}, Lhd/q0;->w(FFFF)V

    const v52, 0x3f0a3d71    # 0.54f

    const v53, 0x3ec7ae14    # 0.39f

    const v48, 0x3e75c28f    # 0.24f

    const v50, 0x3ed70a3d    # 0.42f

    const v51, 0x3e570a3d    # 0.21f

    .line 239
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3f1c28f6    # 0.61f

    const v6, 0x3ec28f5c    # 0.38f

    const v7, 0x3e3851ec    # 0.18f

    .line 240
    invoke-virtual {v4, v7, v6, v7, v5}, Lhd/q0;->w(FFFF)V

    const v52, -0x420a3d71    # -0.12f

    const v53, 0x3f07ae14    # 0.53f

    const/16 v48, 0x0

    const v49, 0x3e4ccccd    # 0.2f

    const v50, -0x42dc28f6    # -0.04f

    const v51, 0x3ec28f5c    # 0.38f

    .line 241
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3ec7ae14    # 0.39f

    const v6, -0x415c28f6    # -0.32f

    const v7, 0x3e947ae1    # 0.29f

    .line 242
    invoke-virtual {v4, v14, v7, v6, v5}, Lhd/q0;->w(FFFF)V

    const v5, -0x410a3d71    # -0.48f

    const v6, 0x3e75c28f    # 0.24f

    const v7, -0x416b851f    # -0.29f

    const v8, 0x3e428f5c    # 0.19f

    .line 243
    invoke-virtual {v4, v7, v8, v5, v6}, Lhd/q0;->w(FFFF)V

    const v5, -0x40e66666    # -0.6f

    const v6, -0x413d70a4    # -0.38f

    const v7, 0x3da3d70a    # 0.08f

    .line 244
    invoke-virtual {v4, v6, v7, v5, v7}, Lhd/q0;->w(FFFF)V

    const v52, -0x40f851ec    # -0.53f

    const v53, -0x4270a3d7    # -0.07f

    const v48, -0x41c7ae14    # -0.18f

    const/16 v49, 0x0

    const v50, -0x4147ae14    # -0.36f

    const v51, -0x435c28f6    # -0.02f

    .line 245
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x41570a3d    # -0.33f

    const v6, -0x41147ae1    # -0.46f

    const v7, -0x41947ae1    # -0.23f

    const v12, -0x420a3d71    # -0.12f

    .line 246
    invoke-virtual {v4, v5, v12, v6, v7}, Lhd/q0;->w(FFFF)V

    const v6, -0x413d70a4    # -0.38f

    const/high16 v8, -0x41800000    # -0.25f

    .line 247
    invoke-virtual {v4, v8, v7, v5, v6}, Lhd/q0;->w(FFFF)V

    const v5, -0x40f33333    # -0.55f

    const v6, -0x4151eb85    # -0.34f

    .line 248
    invoke-virtual {v4, v12, v6, v12, v5}, Lhd/q0;->w(FFFF)V

    const v7, 0x3f59999a    # 0.85f

    .line 249
    invoke-virtual {v4, v7}, Lhd/q0;->r(F)V

    const v52, 0x3d4ccccd    # 0.05f

    const v53, 0x3e6147ae    # 0.22f

    const/16 v48, 0x0

    const v49, 0x3da3d70a    # 0.08f

    const v50, 0x3ca3d70a    # 0.02f

    const v51, 0x3e19999a    # 0.15f

    .line 250
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3e2e147b    # 0.17f

    const v6, 0x3d8f5c29    # 0.07f

    const v7, 0x3e051eb8    # 0.13f

    const v8, 0x3df5c28f    # 0.12f

    .line 251
    invoke-virtual {v4, v6, v8, v7, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3de147ae    # 0.11f

    const v6, 0x3db851ec    # 0.09f

    const v12, 0x3e4ccccd    # 0.2f

    .line 252
    invoke-virtual {v4, v8, v6, v12, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3d23d70a    # 0.04f

    const v6, 0x3e23d70a    # 0.16f

    const/high16 v8, 0x3e800000    # 0.25f

    .line 253
    invoke-virtual {v4, v6, v5, v8, v5}, Lhd/q0;->w(FFFF)V

    const v52, 0x3e8a3d71    # 0.27f

    const v53, -0x42dc28f6    # -0.04f

    const v48, 0x3dcccccd    # 0.1f

    const/16 v49, 0x0

    const v50, 0x3e428f5c    # 0.19f

    const v51, -0x43dc28f6    # -0.01f

    .line 254
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v6, -0x4270a3d7    # -0.07f

    const v8, 0x3e19999a    # 0.15f

    const v13, -0x420a3d71    # -0.12f

    .line 255
    invoke-virtual {v4, v8, v6, v12, v13}, Lhd/q0;->w(FFFF)V

    const v6, 0x3dcccccd    # 0.1f

    const v8, -0x421eb852    # -0.11f

    .line 256
    invoke-virtual {v4, v6, v8, v7, v14}, Lhd/q0;->w(FFFF)V

    const v6, -0x418a3d71    # -0.24f

    const v7, -0x41e66666    # -0.15f

    .line 257
    invoke-virtual {v4, v5, v7, v5, v6}, Lhd/q0;->w(FFFF)V

    const v52, -0x42b33333    # -0.05f

    const v53, -0x416b851f    # -0.29f

    const/16 v48, 0x0

    const v49, -0x421eb852    # -0.11f

    const v50, -0x435c28f6    # -0.02f

    const v51, -0x41a8f5c3    # -0.21f

    .line 258
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x41b33333    # -0.2f

    const v6, -0x425c28f6    # -0.08f

    const v8, -0x41f0a3d7    # -0.14f

    .line 259
    invoke-virtual {v4, v6, v7, v8, v5}, Lhd/q0;->w(FFFF)V

    const v5, -0x419eb852    # -0.22f

    const v6, -0x421eb852    # -0.11f

    const v7, -0x4247ae14    # -0.09f

    const v8, -0x41fae148    # -0.13f

    .line 260
    invoke-virtual {v4, v8, v7, v5, v6}, Lhd/q0;->w(FFFF)V

    const v7, -0x416b851f    # -0.29f

    const v8, -0x42dc28f6    # -0.04f

    .line 261
    invoke-virtual {v4, v14, v8, v7, v8}, Lhd/q0;->w(FFFF)V

    const v5, 0x4118f5c3    # 9.56f

    .line 262
    invoke-virtual {v4, v5}, Lhd/q0;->q(F)V

    const v5, 0x4157d70a    # 13.49f

    .line 263
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    .line 264
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 265
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 266
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 267
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v9, v10}, Lq1/n0;-><init>(J)V

    const v4, 0x4174cccd    # 15.3f

    const v5, 0x4163d70a    # 14.24f

    .line 268
    invoke-static {v4, v5}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v47

    const v52, -0x42333333    # -0.1f

    const v53, 0x3f51eb85    # 0.82f

    const v49, 0x3ea3d70a    # 0.32f

    const v50, -0x430a3d71    # -0.03f

    const v51, 0x3f19999a    # 0.6f

    .line 269
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    move-object/from16 v4, v47

    const v5, 0x3ed70a3d    # 0.42f

    const v6, 0x3f11eb85    # 0.57f

    const v7, -0x416b851f    # -0.29f

    const v8, -0x41d1eb85    # -0.17f

    .line 270
    invoke-virtual {v4, v8, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e851eb8    # 0.26f

    const v6, 0x3ea8f5c3    # 0.33f

    const v7, -0x4119999a    # -0.45f

    const v8, -0x4170a3d7    # -0.28f

    .line 271
    invoke-virtual {v4, v8, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, -0x41428f5c    # -0.37f

    const v6, 0x3dcccccd    # 0.1f

    const v7, -0x40e8f5c3    # -0.59f

    .line 272
    invoke-virtual {v4, v5, v6, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, -0x412e147b    # -0.41f

    const v6, -0x430a3d71    # -0.03f

    const v8, -0x42333333    # -0.1f

    .line 273
    invoke-virtual {v4, v5, v6, v7, v8}, Lhd/q0;->w(FFFF)V

    const v5, -0x41570a3d    # -0.33f

    const v6, -0x41147ae1    # -0.46f

    .line 274
    invoke-virtual {v4, v5, v14, v6, v5}, Lhd/q0;->w(FFFF)V

    const v5, -0x41666666    # -0.3f

    const v6, -0x4151eb85    # -0.34f

    const v7, -0x41947ae1    # -0.23f

    const v8, -0x40ee147b    # -0.57f

    .line 275
    invoke-virtual {v4, v7, v6, v5, v8}, Lhd/q0;->w(FFFF)V

    const/high16 v5, -0x41000000    # -0.5f

    const v6, -0x40ae147b    # -0.82f

    const v8, -0x421eb852    # -0.11f

    .line 276
    invoke-virtual {v4, v8, v5, v8, v6}, Lhd/q0;->w(FFFF)V

    const/high16 v5, 0x41580000    # 13.5f

    .line 277
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    const v52, 0x3dcccccd    # 0.1f

    const v53, -0x40ae147b    # -0.82f

    const v49, -0x415c28f6    # -0.32f

    const v50, 0x3cf5c28f    # 0.03f

    const v51, -0x40e66666    # -0.6f

    .line 278
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x4128f5c3    # -0.42f

    const v6, 0x3e2e147b    # 0.17f

    const v7, 0x3e947ae1    # 0.29f

    const v8, -0x40ee147b    # -0.57f

    .line 279
    invoke-virtual {v4, v6, v5, v7, v8}, Lhd/q0;->w(FFFF)V

    const v5, -0x417ae148    # -0.26f

    const v6, 0x3e8f5c29    # 0.28f

    const v7, -0x41570a3d    # -0.33f

    const v8, 0x3ee66666    # 0.45f

    .line 280
    invoke-virtual {v4, v6, v5, v8, v7}, Lhd/q0;->w(FFFF)V

    const v5, 0x3ebd70a4    # 0.37f

    const v6, 0x3f170a3d    # 0.59f

    const v8, -0x42333333    # -0.1f

    .line 281
    invoke-virtual {v4, v5, v8, v6, v8}, Lhd/q0;->w(FFFF)V

    const v5, 0x3dcccccd    # 0.1f

    const v7, 0x3cf5c28f    # 0.03f

    const v8, 0x3ed1eb85    # 0.41f

    .line 282
    invoke-virtual {v4, v8, v7, v6, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3eeb851f    # 0.46f

    const v6, 0x3ea8f5c3    # 0.33f

    const v7, 0x3e3851ec    # 0.18f

    .line 283
    invoke-virtual {v4, v6, v7, v5, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x3eae147b    # 0.34f

    const v6, 0x3f11eb85    # 0.57f

    const v7, 0x3e99999a    # 0.3f

    const v8, 0x3e6b851f    # 0.23f

    .line 284
    invoke-virtual {v4, v8, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const/high16 v5, 0x3f000000    # 0.5f

    const v6, 0x3f51eb85    # 0.82f

    const v7, 0x3de147ae    # 0.11f

    .line 285
    invoke-virtual {v4, v7, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x4163d70a    # 14.24f

    .line 286
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    .line 287
    invoke-virtual {v4}, Lhd/q0;->l()V

    const v5, 0x41673333    # 14.45f

    const v6, 0x4156147b    # 13.38f

    .line 288
    invoke-virtual {v4, v5, v6}, Lhd/q0;->u(FF)V

    const v52, -0x42dc28f6    # -0.04f

    const v53, -0x410a3d71    # -0.48f

    const v49, -0x41bd70a4    # -0.19f

    const v50, -0x43dc28f6    # -0.01f

    const v51, -0x414ccccd    # -0.35f

    .line 289
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v52, -0x420a3d71    # -0.12f

    const v53, -0x416147ae    # -0.31f

    const v48, -0x430a3d71    # -0.03f

    const v49, -0x41fae148    # -0.13f

    const v50, -0x4270a3d7    # -0.07f

    const v51, -0x41947ae1    # -0.23f

    .line 290
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x41bd70a4    # -0.19f

    const v6, -0x421eb852    # -0.11f

    const v7, -0x41f0a3d7    # -0.14f

    const v8, -0x41d1eb85    # -0.17f

    .line 291
    invoke-virtual {v4, v6, v7, v5, v8}, Lhd/q0;->w(FFFF)V

    const v6, -0x41dc28f6    # -0.16f

    const v8, -0x42b33333    # -0.05f

    const/high16 v9, -0x41800000    # -0.25f

    .line 292
    invoke-virtual {v4, v6, v8, v9, v8}, Lhd/q0;->w(FFFF)V

    const v6, 0x3ca3d70a    # 0.02f

    const v8, 0x3d4ccccd    # 0.05f

    .line 293
    invoke-virtual {v4, v14, v6, v9, v8}, Lhd/q0;->w(FFFF)V

    const v6, 0x3e2e147b    # 0.17f

    const v8, 0x3db851ec    # 0.09f

    .line 294
    invoke-virtual {v4, v7, v8, v5, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e9eb852    # 0.31f

    const v6, 0x3e3851ec    # 0.18f

    const v7, -0x4247ae14    # -0.09f

    const v12, -0x420a3d71    # -0.12f

    .line 295
    invoke-virtual {v4, v7, v6, v12, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3ef5c28f    # 0.48f

    const v7, 0x3e947ae1    # 0.29f

    const v8, -0x42dc28f6    # -0.04f

    .line 296
    invoke-virtual {v4, v8, v7, v8, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3f7851ec    # 0.97f

    .line 297
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v52, 0x3d23d70a    # 0.04f

    const v53, 0x3ef5c28f    # 0.48f

    const/16 v48, 0x0

    const v49, 0x3e428f5c    # 0.19f

    const v50, 0x3c23d70a    # 0.01f

    const v51, 0x3eb33333    # 0.35f

    .line 298
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3ea3d70a    # 0.32f

    const v6, 0x3d8f5c29    # 0.07f

    const v7, 0x3e75c28f    # 0.24f

    const v8, 0x3df5c28f    # 0.12f

    .line 299
    invoke-virtual {v4, v6, v7, v8, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e2e147b    # 0.17f

    const v6, 0x3e0f5c29    # 0.14f

    const v7, 0x3de147ae    # 0.11f

    const v8, 0x3e428f5c    # 0.19f

    .line 300
    invoke-virtual {v4, v7, v6, v8, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e23d70a    # 0.16f

    const v9, 0x3d4ccccd    # 0.05f

    const/high16 v10, 0x3e800000    # 0.25f

    .line 301
    invoke-virtual {v4, v5, v9, v10, v9}, Lhd/q0;->w(FFFF)V

    const v5, -0x42b33333    # -0.05f

    const v9, -0x435c28f6    # -0.02f

    const v12, 0x3e3851ec    # 0.18f

    .line 302
    invoke-virtual {v4, v12, v9, v10, v5}, Lhd/q0;->w(FFFF)V

    const v5, -0x4247ae14    # -0.09f

    const v9, -0x41d1eb85    # -0.17f

    .line 303
    invoke-virtual {v4, v6, v5, v8, v9}, Lhd/q0;->w(FFFF)V

    const v5, -0x41bd70a4    # -0.19f

    const v6, 0x3db851ec    # 0.09f

    const v8, -0x415c28f6    # -0.32f

    .line 304
    invoke-virtual {v4, v6, v5, v7, v8}, Lhd/q0;->w(FFFF)V

    const v53, -0x410a3d71    # -0.48f

    const v48, 0x3cf5c28f    # 0.03f

    const v49, -0x41fae148    # -0.13f

    const v50, 0x3d23d70a    # 0.04f

    const v51, -0x416b851f    # -0.29f

    .line 305
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v6, 0x4156147b    # 13.38f

    .line 306
    invoke-virtual {v4, v6}, Lhd/q0;->y(F)V

    .line 307
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 308
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 309
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 310
    invoke-virtual {v2}, Lw1/e;->b()Lw1/f;

    move-result-object v2

    .line 311
    sput-object v2, Lnd/h;->i:Lw1/f;

    goto/16 :goto_5

    .line 312
    :cond_c
    sget-object v2, Ln7/b0;->i:Lw1/f;

    if-eqz v2, :cond_d

    goto/16 :goto_5

    .line 313
    :cond_d
    new-instance v56, Lw1/e;

    const/16 v64, 0x0

    const/16 v66, 0x60

    const-string v57, "Filled.Replay10"

    const/high16 v58, 0x41c00000    # 24.0f

    const/high16 v59, 0x41c00000    # 24.0f

    const/high16 v60, 0x41c00000    # 24.0f

    const/high16 v61, 0x41c00000    # 24.0f

    const-wide/16 v62, 0x0

    const/16 v65, 0x0

    invoke-direct/range {v56 .. v66}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v2, v56

    .line 314
    sget v3, Lw1/g0;->a:I

    .line 315
    new-instance v3, Lq1/n0;

    .line 316
    sget-wide v8, Lq1/q;->b:J

    .line 317
    invoke-direct {v3, v8, v9}, Lq1/n0;-><init>(J)V

    .line 318
    new-instance v4, Lhd/q0;

    const/4 v6, 0x6

    invoke-direct {v4, v11, v6}, Lhd/q0;-><init>(BI)V

    const v6, 0x413fd70a    # 11.99f

    const/high16 v10, 0x40a00000    # 5.0f

    .line 319
    invoke-virtual {v4, v6, v10}, Lhd/q0;->u(FF)V

    .line 320
    invoke-virtual {v4, v7}, Lhd/q0;->y(F)V

    const/high16 v7, -0x3f600000    # -5.0f

    .line 321
    invoke-virtual {v4, v7, v10}, Lhd/q0;->t(FF)V

    .line 322
    invoke-virtual {v4, v10, v10}, Lhd/q0;->t(FF)V

    .line 323
    invoke-virtual {v4, v15}, Lhd/q0;->y(F)V

    const/high16 v53, 0x40c00000    # 6.0f

    const/high16 v54, 0x40c00000    # 6.0f

    const v49, 0x4053d70a    # 3.31f

    const/16 v50, 0x0

    const/high16 v51, 0x40c00000    # 6.0f

    const v52, 0x402c28f6    # 2.69f

    move-object/from16 v48, v4

    .line 324
    invoke-virtual/range {v48 .. v54}, Lhd/q0;->n(FFFFFF)V

    const/high16 v7, 0x40c00000    # 6.0f

    .line 325
    invoke-virtual {v4, v13, v7, v12, v7}, Lhd/q0;->w(FFFF)V

    .line 326
    invoke-virtual {v4, v12, v13, v12, v12}, Lhd/q0;->w(FFFF)V

    const/high16 v7, -0x40000000    # -2.0f

    .line 327
    invoke-virtual {v4, v7}, Lhd/q0;->r(F)V

    const/high16 v53, 0x41000000    # 8.0f

    const/high16 v54, 0x41000000    # 8.0f

    const/16 v49, 0x0

    const v50, 0x408d70a4    # 4.42f

    const v51, 0x40651eb8    # 3.58f

    const/high16 v52, 0x41000000    # 8.0f

    .line 328
    invoke-virtual/range {v48 .. v54}, Lhd/q0;->n(FFFFFF)V

    const/high16 v5, 0x41000000    # 8.0f

    const/high16 v7, -0x3f000000    # -8.0f

    const v10, -0x3f9ae148    # -3.58f

    .line 329
    invoke-virtual {v4, v5, v10, v5, v7}, Lhd/q0;->w(FFFF)V

    const v5, 0x418347ae    # 16.41f

    const/high16 v13, 0x40a00000    # 5.0f

    .line 330
    invoke-virtual {v4, v5, v13, v6, v13}, Lhd/q0;->v(FFFF)V

    .line 331
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 332
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 333
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 334
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v8, v9}, Lq1/n0;-><init>(J)V

    .line 335
    new-instance v4, Lhd/q0;

    const/4 v5, 0x6

    invoke-direct {v4, v11, v5}, Lhd/q0;-><init>(BI)V

    const v5, 0x412e3d71    # 10.89f

    const/high16 v6, 0x41800000    # 16.0f

    .line 336
    invoke-virtual {v4, v5, v6}, Lhd/q0;->u(FF)V

    const v5, -0x40a66666    # -0.85f

    .line 337
    invoke-virtual {v4, v5}, Lhd/q0;->r(F)V

    const v5, -0x3faf5c29    # -3.26f

    .line 338
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v5, -0x407eb852    # -1.01f

    const v7, 0x3e9eb852    # 0.31f

    .line 339
    invoke-virtual {v4, v5, v7}, Lhd/q0;->t(FF)V

    const v5, -0x40cf5c29    # -0.69f

    .line 340
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v5, 0x3fe28f5c    # 1.77f

    const v7, -0x40deb852    # -0.63f

    .line 341
    invoke-virtual {v4, v5, v7}, Lhd/q0;->t(FF)V

    const v5, 0x3db851ec    # 0.09f

    .line 342
    invoke-virtual {v4, v5}, Lhd/q0;->r(F)V

    .line 343
    invoke-virtual {v4, v6}, Lhd/q0;->y(F)V

    .line 344
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 345
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 346
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 347
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v8, v9}, Lq1/n0;-><init>(J)V

    const v4, 0x4172b852    # 15.17f

    const v5, 0x4163d70a    # 14.24f

    .line 348
    invoke-static {v4, v5}, Lj2/h0;->h(FF)Lhd/q0;

    move-result-object v47

    const v52, -0x42333333    # -0.1f

    const v53, 0x3f51eb85    # 0.82f

    const/16 v48, 0x0

    const v49, 0x3ea3d70a    # 0.32f

    const v50, -0x430a3d71    # -0.03f

    const v51, 0x3f19999a    # 0.6f

    .line 349
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    move-object/from16 v4, v47

    const v5, 0x3ed70a3d    # 0.42f

    const v6, 0x3f11eb85    # 0.57f

    const v7, -0x416b851f    # -0.29f

    const v8, -0x41d1eb85    # -0.17f

    .line 350
    invoke-virtual {v4, v8, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e851eb8    # 0.26f

    const v6, 0x3ea8f5c3    # 0.33f

    const v7, -0x4119999a    # -0.45f

    const v8, -0x4170a3d7    # -0.28f

    .line 351
    invoke-virtual {v4, v8, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, -0x41428f5c    # -0.37f

    const v6, 0x3dcccccd    # 0.1f

    const v7, -0x40e8f5c3    # -0.59f

    .line 352
    invoke-virtual {v4, v5, v6, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, -0x412e147b    # -0.41f

    const v6, -0x430a3d71    # -0.03f

    const v8, -0x42333333    # -0.1f

    .line 353
    invoke-virtual {v4, v5, v6, v7, v8}, Lhd/q0;->w(FFFF)V

    const v5, -0x41570a3d    # -0.33f

    const v6, -0x41147ae1    # -0.46f

    .line 354
    invoke-virtual {v4, v5, v14, v6, v5}, Lhd/q0;->w(FFFF)V

    const v5, -0x41666666    # -0.3f

    const v6, -0x4151eb85    # -0.34f

    const v7, -0x41947ae1    # -0.23f

    const v8, -0x40ee147b    # -0.57f

    .line 355
    invoke-virtual {v4, v7, v6, v5, v8}, Lhd/q0;->w(FFFF)V

    const/high16 v5, -0x41000000    # -0.5f

    const v6, -0x40ae147b    # -0.82f

    const v8, -0x421eb852    # -0.11f

    .line 356
    invoke-virtual {v4, v8, v5, v8, v6}, Lhd/q0;->w(FFFF)V

    const/high16 v5, 0x41580000    # 13.5f

    .line 357
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    const v52, 0x3dcccccd    # 0.1f

    const v53, -0x40ae147b    # -0.82f

    const v49, -0x415c28f6    # -0.32f

    const v50, 0x3cf5c28f    # 0.03f

    const v51, -0x40e66666    # -0.6f

    .line 358
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x4128f5c3    # -0.42f

    const v6, 0x3e2e147b    # 0.17f

    const v7, 0x3e947ae1    # 0.29f

    const v8, -0x40ee147b    # -0.57f

    .line 359
    invoke-virtual {v4, v6, v5, v7, v8}, Lhd/q0;->w(FFFF)V

    const v5, -0x417ae148    # -0.26f

    const v6, 0x3e8f5c29    # 0.28f

    const v7, -0x41570a3d    # -0.33f

    const v8, 0x3ee66666    # 0.45f

    .line 360
    invoke-virtual {v4, v6, v5, v8, v7}, Lhd/q0;->w(FFFF)V

    const v5, 0x3ebd70a4    # 0.37f

    const v6, 0x3f170a3d    # 0.59f

    const v8, -0x42333333    # -0.1f

    .line 361
    invoke-virtual {v4, v5, v8, v6, v8}, Lhd/q0;->w(FFFF)V

    const v5, 0x3dcccccd    # 0.1f

    const v7, 0x3cf5c28f    # 0.03f

    const v8, 0x3ed1eb85    # 0.41f

    .line 362
    invoke-virtual {v4, v8, v7, v6, v5}, Lhd/q0;->w(FFFF)V

    const v52, 0x3eeb851f    # 0.46f

    const v53, 0x3ea8f5c3    # 0.33f

    const v48, 0x3e3851ec    # 0.18f

    const v49, 0x3d8f5c29    # 0.07f

    const v50, 0x3ea8f5c3    # 0.33f

    const v51, 0x3e3851ec    # 0.18f

    .line 363
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3eae147b    # 0.34f

    const v6, 0x3f11eb85    # 0.57f

    const v7, 0x3e99999a    # 0.3f

    const v8, 0x3e6b851f    # 0.23f

    .line 364
    invoke-virtual {v4, v8, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const/high16 v5, 0x3f000000    # 0.5f

    const v6, 0x3f51eb85    # 0.82f

    const v7, 0x3de147ae    # 0.11f

    .line 365
    invoke-virtual {v4, v7, v5, v7, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x4163d70a    # 14.24f

    .line 366
    invoke-virtual {v4, v5}, Lhd/q0;->y(F)V

    .line 367
    invoke-virtual {v4}, Lhd/q0;->l()V

    const v5, 0x41651eb8    # 14.32f

    const v6, 0x4156147b    # 13.38f

    .line 368
    invoke-virtual {v4, v5, v6}, Lhd/q0;->u(FF)V

    const v52, -0x42dc28f6    # -0.04f

    const v53, -0x410a3d71    # -0.48f

    const/16 v48, 0x0

    const v49, -0x41bd70a4    # -0.19f

    const v50, -0x43dc28f6    # -0.01f

    const v51, -0x414ccccd    # -0.35f

    .line 369
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, -0x416147ae    # -0.31f

    const v6, -0x4270a3d7    # -0.07f

    const v7, -0x41947ae1    # -0.23f

    const v12, -0x420a3d71    # -0.12f

    .line 370
    invoke-virtual {v4, v6, v7, v12, v5}, Lhd/q0;->w(FFFF)V

    const v5, -0x41bd70a4    # -0.19f

    const v6, -0x421eb852    # -0.11f

    const v7, -0x41f0a3d7    # -0.14f

    const v8, -0x41d1eb85    # -0.17f

    .line 371
    invoke-virtual {v4, v6, v7, v5, v8}, Lhd/q0;->w(FFFF)V

    const v6, -0x41dc28f6    # -0.16f

    const v8, -0x42b33333    # -0.05f

    const/high16 v9, -0x41800000    # -0.25f

    .line 372
    invoke-virtual {v4, v6, v8, v9, v8}, Lhd/q0;->w(FFFF)V

    const v6, 0x3ca3d70a    # 0.02f

    const v8, 0x3d4ccccd    # 0.05f

    .line 373
    invoke-virtual {v4, v14, v6, v9, v8}, Lhd/q0;->w(FFFF)V

    const v6, 0x3e2e147b    # 0.17f

    const v8, 0x3db851ec    # 0.09f

    .line 374
    invoke-virtual {v4, v7, v8, v5, v6}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e9eb852    # 0.31f

    const v6, 0x3e3851ec    # 0.18f

    const v7, -0x4247ae14    # -0.09f

    .line 375
    invoke-virtual {v4, v7, v6, v12, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3ef5c28f    # 0.48f

    const v7, 0x3e947ae1    # 0.29f

    const v8, -0x42dc28f6    # -0.04f

    .line 376
    invoke-virtual {v4, v8, v7, v8, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3f7851ec    # 0.97f

    .line 377
    invoke-virtual {v4, v5}, Lhd/q0;->z(F)V

    const v52, 0x3d23d70a    # 0.04f

    const v53, 0x3ef5c28f    # 0.48f

    const v49, 0x3e428f5c    # 0.19f

    const v50, 0x3c23d70a    # 0.01f

    const v51, 0x3eb33333    # 0.35f

    .line 378
    invoke-virtual/range {v47 .. v53}, Lhd/q0;->n(FFFFFF)V

    const v5, 0x3ea3d70a    # 0.32f

    const v6, 0x3d8f5c29    # 0.07f

    const v7, 0x3e75c28f    # 0.24f

    const v8, 0x3df5c28f    # 0.12f

    .line 379
    invoke-virtual {v4, v6, v7, v8, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e2e147b    # 0.17f

    const v6, 0x3e0f5c29    # 0.14f

    const v7, 0x3de147ae    # 0.11f

    const v8, 0x3e428f5c    # 0.19f

    .line 380
    invoke-virtual {v4, v7, v6, v8, v5}, Lhd/q0;->w(FFFF)V

    const v5, 0x3e23d70a    # 0.16f

    const v9, 0x3d4ccccd    # 0.05f

    const/high16 v10, 0x3e800000    # 0.25f

    .line 381
    invoke-virtual {v4, v5, v9, v10, v9}, Lhd/q0;->w(FFFF)V

    const v5, -0x42b33333    # -0.05f

    const v9, -0x435c28f6    # -0.02f

    const v12, 0x3e3851ec    # 0.18f

    .line 382
    invoke-virtual {v4, v12, v9, v10, v5}, Lhd/q0;->w(FFFF)V

    const v5, -0x4247ae14    # -0.09f

    const v9, -0x41d1eb85    # -0.17f

    .line 383
    invoke-virtual {v4, v6, v5, v8, v9}, Lhd/q0;->w(FFFF)V

    const v5, -0x41bd70a4    # -0.19f

    const v6, 0x3db851ec    # 0.09f

    const v8, -0x415c28f6    # -0.32f

    .line 384
    invoke-virtual {v4, v6, v5, v7, v8}, Lhd/q0;->w(FFFF)V

    const v5, -0x410a3d71    # -0.48f

    const v6, 0x3d23d70a    # 0.04f

    const v7, -0x416b851f    # -0.29f

    .line 385
    invoke-virtual {v4, v6, v7, v6, v5}, Lhd/q0;->w(FFFF)V

    const v6, 0x4156147b    # 13.38f

    .line 386
    invoke-virtual {v4, v6}, Lhd/q0;->y(F)V

    .line 387
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 388
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 389
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 390
    invoke-virtual {v2}, Lw1/e;->b()Lw1/f;

    move-result-object v2

    .line 391
    sput-object v2, Ln7/b0;->i:Lw1/f;

    goto/16 :goto_5

    .line 392
    :cond_e
    sget-object v2, Lnh/a;->j:Lw1/f;

    if-eqz v2, :cond_f

    goto/16 :goto_5

    .line 393
    :cond_f
    new-instance v36, Lw1/e;

    const/16 v44, 0x0

    const/16 v46, 0x60

    const-string v37, "Filled.Replay5"

    const/high16 v38, 0x41c00000    # 24.0f

    const/high16 v39, 0x41c00000    # 24.0f

    const/high16 v40, 0x41c00000    # 24.0f

    const/high16 v41, 0x41c00000    # 24.0f

    const-wide/16 v42, 0x0

    const/16 v45, 0x0

    invoke-direct/range {v36 .. v46}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v2, v36

    .line 394
    sget v4, Lw1/g0;->a:I

    .line 395
    new-instance v4, Lq1/n0;

    .line 396
    sget-wide v9, Lq1/q;->b:J

    .line 397
    invoke-direct {v4, v9, v10}, Lq1/n0;-><init>(J)V

    .line 398
    new-instance v6, Lhd/q0;

    const/4 v14, 0x6

    invoke-direct {v6, v11, v14}, Lhd/q0;-><init>(BI)V

    const/high16 v14, 0x40a00000    # 5.0f

    .line 399
    invoke-virtual {v6, v3, v14}, Lhd/q0;->u(FF)V

    .line 400
    invoke-virtual {v6, v7}, Lhd/q0;->y(F)V

    const/high16 v7, 0x40c00000    # 6.0f

    .line 401
    invoke-virtual {v6, v15, v7}, Lhd/q0;->s(FF)V

    .line 402
    invoke-virtual {v6, v14, v14}, Lhd/q0;->t(FF)V

    .line 403
    invoke-virtual {v6, v15}, Lhd/q0;->y(F)V

    const/high16 v41, 0x40c00000    # 6.0f

    const/high16 v42, 0x40c00000    # 6.0f

    const v37, 0x4053d70a    # 3.31f

    const/16 v38, 0x0

    const/high16 v39, 0x40c00000    # 6.0f

    const v40, 0x402c28f6    # 2.69f

    move-object/from16 v36, v6

    .line 404
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    .line 405
    invoke-virtual {v6, v13, v7, v12, v7}, Lhd/q0;->w(FFFF)V

    .line 406
    invoke-virtual {v6, v12, v13, v12, v12}, Lhd/q0;->w(FFFF)V

    .line 407
    invoke-virtual {v6, v8}, Lhd/q0;->q(F)V

    const/high16 v41, 0x41000000    # 8.0f

    const/high16 v42, 0x41000000    # 8.0f

    const/16 v37, 0x0

    const v38, 0x408d70a4    # 4.42f

    const v39, 0x40651eb8    # 3.58f

    const/high16 v40, 0x41000000    # 8.0f

    .line 408
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const/high16 v5, 0x41000000    # 8.0f

    const/high16 v7, -0x3f000000    # -8.0f

    const v8, -0x3f9ae148    # -3.58f

    .line 409
    invoke-virtual {v6, v5, v8, v5, v7}, Lhd/q0;->w(FFFF)V

    const v5, 0x41835c29    # 16.42f

    const/high16 v13, 0x40a00000    # 5.0f

    .line 410
    invoke-virtual {v6, v5, v13, v3, v13}, Lhd/q0;->v(FFFF)V

    .line 411
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 412
    iget-object v3, v6, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 413
    invoke-static {v2, v3, v11, v4}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 414
    new-instance v3, Lq1/n0;

    invoke-direct {v3, v9, v10}, Lq1/n0;-><init>(J)V

    .line 415
    new-instance v4, Lhd/q0;

    const/4 v5, 0x6

    invoke-direct {v4, v11, v5}, Lhd/q0;-><init>(BI)V

    const v5, 0x412b0a3d    # 10.69f

    const v6, 0x415e6666    # 13.9f

    .line 416
    invoke-virtual {v4, v5, v6}, Lhd/q0;->u(FF)V

    const v7, -0x3ff51eb8    # -2.17f

    const/high16 v8, 0x3e800000    # 0.25f

    .line 417
    invoke-virtual {v4, v8, v7}, Lhd/q0;->t(FF)V

    const v7, 0x4018f5c3    # 2.39f

    .line 418
    invoke-virtual {v4, v7}, Lhd/q0;->r(F)V

    const v7, 0x3f35c28f    # 0.71f

    .line 419
    invoke-virtual {v4, v7}, Lhd/q0;->z(F)V

    const v7, -0x40266666    # -1.7f

    .line 420
    invoke-virtual {v4, v7}, Lhd/q0;->r(F)V

    const v7, 0x3f6b851f    # 0.92f

    const v8, -0x421eb852    # -0.11f

    .line 421
    invoke-virtual {v4, v8, v7}, Lhd/q0;->t(FF)V

    const v41, 0x3de147ae    # 0.11f

    const v42, -0x42b33333    # -0.05f

    const v37, 0x3cf5c28f    # 0.03f

    const v38, -0x435c28f6    # -0.02f

    const v39, 0x3d8f5c29    # 0.07f

    const v40, -0x430a3d71    # -0.03f

    move-object/from16 v36, v4

    .line 422
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const v7, 0x3db851ec    # 0.09f

    const v8, -0x42b33333    # -0.05f

    const v9, 0x3e19999a    # 0.15f

    const v10, -0x42dc28f6    # -0.04f

    .line 423
    invoke-virtual {v4, v7, v10, v9, v8}, Lhd/q0;->w(FFFF)V

    const v7, -0x430a3d71    # -0.03f

    const v8, 0x3df5c28f    # 0.12f

    const v12, 0x3e3851ec    # 0.18f

    .line 424
    invoke-virtual {v4, v8, v7, v12, v10}, Lhd/q0;->w(FFFF)V

    const v7, 0x3e051eb8    # 0.13f

    const v9, -0x435c28f6    # -0.02f

    const v12, 0x3e4ccccd    # 0.2f

    .line 425
    invoke-virtual {v4, v7, v9, v12, v9}, Lhd/q0;->w(FFFF)V

    const v41, 0x3f0ccccd    # 0.55f

    const v42, 0x3dcccccd    # 0.1f

    const v37, 0x3e570a3d    # 0.21f

    const/16 v38, 0x0

    const v39, 0x3ec7ae14    # 0.39f

    const v40, 0x3cf5c28f    # 0.03f

    .line 426
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const v7, 0x3e8f5c29    # 0.28f

    const v8, 0x3ed1eb85    # 0.41f

    const v9, 0x3e23d70a    # 0.16f

    const v10, 0x3e99999a    # 0.3f

    .line 427
    invoke-virtual {v4, v10, v9, v8, v7}, Lhd/q0;->w(FFFF)V

    const v7, 0x3e8a3d71    # 0.27f

    const v8, 0x3ee66666    # 0.45f

    const/high16 v10, 0x3e800000    # 0.25f

    .line 428
    invoke-virtual {v4, v12, v7, v10, v8}, Lhd/q0;->w(FFFF)V

    const v7, 0x3f19999a    # 0.6f

    const v9, 0x3ec28f5c    # 0.38f

    const v10, 0x3db851ec    # 0.09f

    .line 429
    invoke-virtual {v4, v10, v9, v10, v7}, Lhd/q0;->w(FFFF)V

    const v41, -0x4247ae14    # -0.09f

    const v42, 0x3f0a3d71    # 0.54f

    const/16 v37, 0x0

    const v38, 0x3e428f5c    # 0.19f

    const v39, -0x430a3d71    # -0.03f

    const v40, 0x3ebd70a4    # 0.37f

    .line 430
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const v7, 0x3ea3d70a    # 0.32f

    const v9, -0x41e66666    # -0.15f

    const v10, -0x4175c28f    # -0.27f

    .line 431
    invoke-virtual {v4, v9, v7, v10, v8}, Lhd/q0;->w(FFFF)V

    const v7, 0x3e9eb852    # 0.31f

    const v8, -0x4119999a    # -0.45f

    const v9, 0x3e75c28f    # 0.24f

    .line 432
    invoke-virtual {v4, v10, v9, v8, v7}, Lhd/q0;->w(FFFF)V

    const v7, -0x413851ec    # -0.39f

    const v8, -0x40dc28f6    # -0.64f

    const v9, 0x3df5c28f    # 0.12f

    .line 433
    invoke-virtual {v4, v7, v9, v8, v9}, Lhd/q0;->w(FFFF)V

    const v41, -0x40f851ec    # -0.53f

    const v42, -0x425c28f6    # -0.08f

    const v37, -0x41c7ae14    # -0.18f

    const/16 v38, 0x0

    const v39, -0x4147ae14    # -0.36f

    const v40, -0x430a3d71    # -0.03f

    .line 434
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const v7, -0x418a3d71    # -0.24f

    const v8, -0x41147ae1    # -0.46f

    const v9, -0x415c28f6    # -0.32f

    const v10, -0x41f0a3d7    # -0.14f

    .line 435
    invoke-virtual {v4, v9, v10, v8, v7}, Lhd/q0;->w(FFFF)V

    const v8, -0x413851ec    # -0.39f

    .line 436
    invoke-virtual {v4, v7, v7, v9, v8}, Lhd/q0;->w(FFFF)V

    const v8, -0x40f851ec    # -0.53f

    const v9, -0x41570a3d    # -0.33f

    const v10, -0x41fae148    # -0.13f

    .line 437
    invoke-virtual {v4, v10, v9, v10, v8}, Lhd/q0;->w(FFFF)V

    const v8, 0x3f570a3d    # 0.84f

    .line 438
    invoke-virtual {v4, v8}, Lhd/q0;->r(F)V

    const v41, 0x3e428f5c    # 0.19f

    const v42, 0x3ed1eb85    # 0.41f

    const v37, 0x3ca3d70a    # 0.02f

    const v38, 0x3e3851ec    # 0.18f

    const v39, 0x3da3d70a    # 0.08f

    const v40, 0x3ea3d70a    # 0.32f

    .line 439
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const v8, 0x3ed70a3d    # 0.42f

    const v9, 0x3e19999a    # 0.15f

    const/high16 v10, 0x3e800000    # 0.25f

    .line 440
    invoke-virtual {v4, v10, v9, v8, v9}, Lhd/q0;->w(FFFF)V

    const v41, 0x3e8a3d71    # 0.27f

    const v42, -0x428a3d71    # -0.06f

    const v37, 0x3de147ae    # 0.11f

    const/16 v38, 0x0

    const v39, 0x3e4ccccd    # 0.2f

    const v40, -0x435c28f6    # -0.02f

    .line 441
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const v8, -0x41d1eb85    # -0.17f

    const v9, 0x3e0f5c29    # 0.14f

    const v10, -0x42333333    # -0.1f

    const v12, 0x3e3851ec    # 0.18f

    .line 442
    invoke-virtual {v4, v9, v10, v12, v8}, Lhd/q0;->w(FFFF)V

    const v9, -0x41e66666    # -0.15f

    const v10, 0x3da3d70a    # 0.08f

    const v12, 0x3de147ae    # 0.11f

    const/high16 v13, -0x41800000    # -0.25f

    .line 443
    invoke-virtual {v4, v10, v9, v12, v13}, Lhd/q0;->w(FFFF)V

    const v10, -0x416147ae    # -0.31f

    const v12, 0x3cf5c28f    # 0.03f

    const v13, -0x41b33333    # -0.2f

    .line 444
    invoke-virtual {v4, v12, v13, v12, v10}, Lhd/q0;->w(FFFF)V

    const v12, -0x43dc28f6    # -0.01f

    const v13, -0x41a8f5c3    # -0.21f

    const v14, -0x42dc28f6    # -0.04f

    .line 445
    invoke-virtual {v4, v12, v13, v14, v10}, Lhd/q0;->w(FFFF)V

    const v10, -0x41fae148    # -0.13f

    const v12, -0x4270a3d7    # -0.07f

    .line 446
    invoke-virtual {v4, v12, v8, v10, v7}, Lhd/q0;->w(FFFF)V

    const v7, -0x41a8f5c3    # -0.21f

    const v12, -0x420a3d71    # -0.12f

    .line 447
    invoke-virtual {v4, v10, v12, v7, v9}, Lhd/q0;->w(FFFF)V

    const v7, -0x41666666    # -0.3f

    const v8, -0x42b33333    # -0.05f

    const v10, -0x41bd70a4    # -0.19f

    .line 448
    invoke-virtual {v4, v10, v8, v7, v8}, Lhd/q0;->w(FFFF)V

    const v41, -0x41b33333    # -0.2f

    const v42, 0x3ca3d70a    # 0.02f

    const v37, -0x425c28f6    # -0.08f

    const v39, -0x41e66666    # -0.15f

    const v40, 0x3c23d70a    # 0.01f

    .line 449
    invoke-virtual/range {v36 .. v42}, Lhd/q0;->n(FFFFFF)V

    const v7, 0x3cf5c28f    # 0.03f

    const v8, -0x421eb852    # -0.11f

    const v10, 0x3d4ccccd    # 0.05f

    .line 450
    invoke-virtual {v4, v8, v7, v9, v10}, Lhd/q0;->w(FFFF)V

    const v7, 0x3d8f5c29    # 0.07f

    const v8, -0x425c28f6    # -0.08f

    .line 451
    invoke-virtual {v4, v8, v10, v12, v7}, Lhd/q0;->w(FFFF)V

    const v7, 0x3d75c28f    # 0.06f

    const v8, 0x3db851ec    # 0.09f

    const v10, -0x42333333    # -0.1f

    const v12, -0x4270a3d7    # -0.07f

    .line 452
    invoke-virtual {v4, v12, v7, v10, v8}, Lhd/q0;->w(FFFF)V

    .line 453
    invoke-virtual {v4, v5, v6}, Lhd/q0;->s(FF)V

    .line 454
    invoke-virtual {v4}, Lhd/q0;->l()V

    .line 455
    iget-object v4, v4, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 456
    invoke-static {v2, v4, v11, v3}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 457
    invoke-virtual {v2}, Lw1/e;->b()Lw1/f;

    move-result-object v2

    .line 458
    sput-object v2, Lnh/a;->j:Lw1/f;

    .line 459
    :goto_5
    sget-object v3, Lm0/c1;->a:Lx0/o2;

    .line 460
    invoke-virtual {v1, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v3

    .line 461
    check-cast v3, Lm0/b1;

    .line 462
    invoke-virtual {v3}, Lm0/b1;->c()J

    move-result-wide v5

    const/16 v8, 0x30

    const/4 v9, 0x4

    .line 463
    const-string v3, "musicReplay"

    const/4 v4, 0x0

    move-object v7, v1

    invoke-static/range {v2 .. v9}, Lm0/r3;->b(Lw1/f;Ljava/lang/String;Lj1/q;JLx0/o;II)V

    goto :goto_6

    :cond_10
    move-object v7, v1

    .line 464
    invoke-virtual {v7}, Lx0/o;->Q()V

    .line 465
    :goto_6
    sget-object v1, Lub/a0;->a:Lub/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
