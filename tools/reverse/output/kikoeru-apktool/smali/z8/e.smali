.class public abstract Lz8/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic a:[Lpc/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljc/n;

    .line 2
    .line 3
    const-string v1, "realStore"

    .line 4
    .line 5
    const-string v2, "<v#1>"

    .line 6
    .line 7
    const-class v3, Lz8/e;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Ljc/n;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljc/a0;->d(Ljc/n;)Lpc/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    new-array v1, v1, [Lpc/u;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v0, v1, v2

    .line 23
    .line 24
    sput-object v1, Lz8/e;->a:[Lpc/u;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Lj1/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;Lic/k;JJZZZLx0/o;II)V
    .locals 36

    move-object/from16 v11, p15

    move/from16 v15, p17

    const v0, -0x8064376

    .line 1
    invoke-virtual {v11, v0}, Lx0/o;->Y(I)Lx0/o;

    and-int/lit8 v0, p16, 0x30

    const/16 v2, 0x10

    if-nez v0, :cond_1

    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x20

    goto :goto_0

    :cond_0
    const/16 v3, 0x10

    :goto_0
    or-int v3, p16, v3

    goto :goto_1

    :cond_1
    move-object/from16 v0, p1

    move/from16 v3, p16

    :goto_1
    const v4, 0x182d80

    or-int/2addr v4, v3

    and-int/lit16 v5, v15, 0x80

    if-eqz v5, :cond_3

    const v4, 0xd82d80

    or-int/2addr v4, v3

    :cond_2
    move-object/from16 v3, p6

    goto :goto_3

    :cond_3
    const/high16 v3, 0xc00000

    and-int v3, p16, v3

    if-nez v3, :cond_2

    move-object/from16 v3, p6

    invoke-virtual {v11, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/high16 v6, 0x800000

    goto :goto_2

    :cond_4
    const/high16 v6, 0x400000

    :goto_2
    or-int/2addr v4, v6

    :goto_3
    const/high16 v6, 0x16000000

    or-int/2addr v4, v6

    and-int/lit16 v6, v15, 0x800

    if-eqz v6, :cond_5

    const/16 v2, 0x32

    move/from16 v7, p12

    goto :goto_4

    :cond_5
    move/from16 v7, p12

    invoke-virtual {v11, v7}, Lx0/o;->g(Z)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v2, 0x20

    :cond_6
    const/4 v8, 0x2

    or-int/2addr v2, v8

    :goto_4
    or-int/lit16 v2, v2, 0xd80

    const v8, 0x12492493

    and-int/2addr v8, v4

    const v9, 0x12492492

    const/4 v14, 0x0

    if-ne v8, v9, :cond_8

    and-int/lit16 v8, v2, 0x493

    const/16 v9, 0x492

    if-eq v8, v9, :cond_7

    goto :goto_5

    :cond_7
    const/4 v8, 0x0

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v8, 0x1

    :goto_6
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v11, v9, v8}, Lx0/o;->N(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v11}, Lx0/o;->S()V

    and-int/lit8 v8, p16, 0x1

    const v9, -0x7000e001

    sget-object v12, Lx0/k;->a:Lx0/r0;

    if-eqz v8, :cond_a

    invoke-virtual {v11}, Lx0/o;->x()Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_7

    .line 2
    :cond_9
    invoke-virtual {v11}, Lx0/o;->Q()V

    and-int/2addr v4, v9

    and-int/lit8 v2, v2, -0xf

    move-object/from16 v6, p2

    move-object/from16 v13, p5

    move-object/from16 v5, p7

    move-wide/from16 v16, p8

    move-wide/from16 v8, p10

    move/from16 v18, p13

    move/from16 v19, v2

    move/from16 v20, v4

    move-object/from16 v2, p3

    move/from16 v4, p14

    goto :goto_8

    :cond_a
    :goto_7
    if-eqz v5, :cond_c

    .line 3
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_b

    .line 4
    new-instance v3, Ly9/c;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Ly9/c;-><init>(I)V

    .line 5
    invoke-virtual {v11, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 6
    :cond_b
    check-cast v3, Lic/k;

    .line 7
    :cond_c
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_d

    .line 8
    new-instance v5, Ly9/c;

    const/4 v8, 0x2

    invoke-direct {v5, v8}, Ly9/c;-><init>(I)V

    .line 9
    invoke-virtual {v11, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 10
    :cond_d
    check-cast v5, Lic/k;

    .line 11
    sget-object v8, Lm0/c1;->a:Lx0/o2;

    .line 12
    invoke-virtual {v11, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v13

    .line 13
    check-cast v13, Lm0/b1;

    .line 14
    invoke-virtual {v13}, Lm0/b1;->a()J

    move-result-wide v16

    and-int/2addr v4, v9

    .line 15
    invoke-virtual {v11, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v8

    .line 16
    check-cast v8, Lm0/b1;

    .line 17
    invoke-virtual {v8}, Lm0/b1;->c()J

    move-result-wide v8

    and-int/lit8 v2, v2, -0xf

    if-eqz v6, :cond_e

    const/4 v7, 0x1

    .line 18
    :cond_e
    sget-object v6, Lj1/n;->a:Lj1/n;

    const-string v13, ""

    move/from16 v19, v2

    move/from16 v20, v4

    const/4 v4, 0x1

    const/16 v18, 0x1

    move-object v2, v0

    .line 19
    :goto_8
    invoke-virtual {v11}, Lx0/o;->q()V

    new-array v10, v14, [Ljava/lang/Object;

    const/16 v22, 0x0

    .line 20
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v12, :cond_f

    .line 21
    new-instance v14, Lq9/j0;

    const/16 v1, 0x1b

    invoke-direct {v14, v1}, Lq9/j0;-><init>(I)V

    .line 22
    invoke-virtual {v11, v14}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 23
    :cond_f
    check-cast v14, Lic/a;

    invoke-static {v10, v14, v11}, Lg1/l;->e([Ljava/lang/Object;Lic/a;Lx0/o;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lx0/w0;

    .line 24
    invoke-static {}, Ly8/c;->e()Lx0/m1;

    move-result-object v1

    .line 25
    invoke-virtual {v11, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v1

    .line 26
    check-cast v1, Lhg/a;

    .line 27
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v12, :cond_10

    .line 28
    const-class v10, Ljava/lang/String;

    invoke-static {v10}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    move-result-object v10

    move-object/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 v3, p0

    move-object/from16 v4, p4

    invoke-static {v1, v3, v4, v10}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    move-result-object v10

    .line 29
    invoke-virtual {v11, v10}, Lx0/o;->h0(Ljava/lang/Object;)V

    goto :goto_9

    :cond_10
    move-object/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 v3, p0

    move-object/from16 v4, p4

    .line 30
    :goto_9
    move-object v1, v10

    check-cast v1, Lhg/b;

    .line 31
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v12, :cond_11

    .line 32
    sget-object v10, Lz8/e;->a:[Lpc/u;

    aget-object v10, v10, v22

    invoke-static {v1, v10}, Lpc/f0;->G(Lhg/b;Lpc/u;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 33
    invoke-static {v10}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    move-result-object v10

    .line 34
    invoke-virtual {v11, v10}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 35
    :cond_11
    check-cast v10, Lx0/w0;

    const/16 v24, 0x0

    if-eqz v18, :cond_12

    .line 36
    invoke-interface {v10}, Lx0/n2;->getValue()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Ljava/lang/String;

    goto :goto_a

    :cond_12
    move-object/from16 v25, v24

    :goto_a
    and-int/lit8 v0, v19, 0x70

    move-object/from16 p5, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_13

    const/16 v21, 0x1

    goto :goto_b

    :cond_13
    const/16 v21, 0x0

    .line 37
    :goto_b
    invoke-virtual {v11, v14}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v0

    or-int v0, v21, v0

    .line 38
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_14

    if-ne v1, v12, :cond_15

    .line 39
    :cond_14
    new-instance v1, Lba/s;

    const/4 v0, 0x5

    invoke-direct {v1, v7, v14, v0}, Lba/s;-><init>(ZLjava/lang/Object;I)V

    .line 40
    invoke-virtual {v11, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 41
    :cond_15
    check-cast v1, Lic/a;

    shr-int/lit8 v0, v20, 0x3

    and-int/lit8 v0, v0, 0x7e

    shl-int/lit8 v19, v19, 0x12

    const/high16 v20, 0x1c00000

    and-int v19, v19, v20

    or-int v0, v0, v19

    move-object/from16 v19, v13

    const/16 v13, 0x318

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v20, v5

    move-object v5, v1

    move-object v1, v6

    move-wide/from16 v34, v8

    move v8, v7

    move-wide/from16 v6, v34

    const/4 v9, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v27, p2

    move/from16 v29, p3

    move-object/from16 v30, p5

    move-object v15, v2

    move-object/from16 v32, v12

    move-object/from16 v26, v19

    move-object/from16 v28, v20

    move-object/from16 v31, v21

    move-object/from16 v2, v25

    move v12, v0

    move-object/from16 v0, p1

    .line 42
    invoke-static/range {v0 .. v13}, Lz8/a;->a(Ljava/lang/String;Lj1/q;Ljava/lang/String;ZZLic/a;JZLic/n;Lic/n;Lx0/o;II)V

    move-object/from16 v19, v1

    move-wide/from16 v20, v6

    move/from16 v23, v8

    .line 43
    invoke-interface {v14}, Lx0/n2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_19

    const v0, 0x2f2bdc94

    .line 44
    invoke-virtual {v11, v0}, Lx0/o;->W(I)V

    if-eqz v15, :cond_16

    const v0, 0x2f2d0dbc

    .line 45
    invoke-virtual {v11, v0}, Lx0/o;->W(I)V

    .line 46
    new-instance v0, Lba/p;

    const/16 v1, 0xf

    invoke-direct {v0, v1, v15}, Lba/p;-><init>(ILjava/lang/String;)V

    const v1, 0x7eb331bd

    invoke-static {v1, v0, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    move-result-object v24

    const/4 v0, 0x0

    .line 47
    invoke-virtual {v11, v0}, Lx0/o;->p(Z)V

    :goto_c
    move-object/from16 v4, v24

    goto :goto_d

    :cond_16
    const/4 v0, 0x0

    const v1, 0x2f2e06b3

    .line 48
    invoke-virtual {v11, v1}, Lx0/o;->W(I)V

    .line 49
    invoke-virtual {v11, v0}, Lx0/o;->p(Z)V

    goto :goto_c

    .line 50
    :goto_d
    invoke-virtual {v11, v14}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v1

    .line 51
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_17

    move-object/from16 v1, v32

    if-ne v2, v1, :cond_18

    .line 52
    :cond_17
    new-instance v2, Lw9/d;

    const/4 v1, 0x4

    invoke-direct {v2, v14, v1}, Lw9/d;-><init>(Lx0/w0;I)V

    .line 53
    invoke-virtual {v11, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 54
    :cond_18
    check-cast v2, Lic/a;

    .line 55
    new-instance v1, Lha/c;

    move-object/from16 v3, v27

    move-object/from16 v10, v30

    move-object/from16 v5, v31

    invoke-direct {v1, v10, v3, v14, v5}, Lha/c;-><init>(Lhg/b;Lic/k;Lx0/w0;Lx0/w0;)V

    const v6, 0x740d7e17

    invoke-static {v6, v1, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    move-result-object v1

    .line 56
    new-instance v6, Laa/g;

    const/16 v7, 0x18

    invoke-direct {v6, v14, v7}, Laa/g;-><init>(Lx0/w0;I)V

    const v7, 0xafae819

    invoke-static {v7, v6, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    move-result-object v6

    .line 57
    new-instance v7, Lba/b;

    move-object/from16 v8, v26

    move-object/from16 v9, v28

    move/from16 v10, v29

    invoke-direct {v7, v9, v10, v5, v8}, Lba/b;-><init>(Lic/k;ZLx0/w0;Ljava/lang/String;)V

    const v5, -0x5e17ade5

    invoke-static {v5, v7, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    move-result-object v5

    const v13, 0x30c30

    const/16 v14, 0x344

    move-object v0, v2

    const/16 v22, 0x0

    const/4 v2, 0x0

    move-object v3, v6

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, p15

    move-object/from16 p2, v15

    move-wide/from16 v7, v16

    const/4 v15, 0x0

    .line 58
    invoke-static/range {v0 .. v14}, La2/c;->b(Lic/a;Lf1/f;Lj1/q;Lic/n;Lic/n;Lic/n;Lq1/l0;JJLj3/q;Lx0/o;II)V

    move-object v11, v12

    .line 59
    :goto_e
    invoke-virtual {v11, v15}, Lx0/o;->p(Z)V

    goto :goto_f

    :cond_19
    move-object/from16 p2, v15

    move-wide/from16 v7, v16

    const/4 v15, 0x0

    const v0, 0x2efebcb8

    .line 60
    invoke-virtual {v11, v0}, Lx0/o;->W(I)V

    goto :goto_e

    :goto_f
    move-object/from16 v4, p2

    move-wide v9, v7

    move/from16 v14, v18

    move-object/from16 v3, v19

    move-wide/from16 v11, v20

    move/from16 v13, v23

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move/from16 v15, v29

    goto :goto_10

    .line 61
    :cond_1a
    invoke-virtual {v11}, Lx0/o;->Q()V

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move/from16 v14, p13

    move/from16 v15, p14

    move v13, v7

    move-object v7, v3

    move-object/from16 v3, p2

    .line 62
    :goto_10
    invoke-virtual/range {p15 .. p15}, Lx0/o;->r()Lx0/p1;

    move-result-object v0

    if-eqz v0, :cond_1b

    move-object v1, v0

    new-instance v0, Lz8/d;

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v33, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v17}, Lz8/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lj1/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;Lic/k;JJZZZII)V

    move-object/from16 v1, v33

    .line 63
    iput-object v0, v1, Lx0/p1;->d:Lic/n;

    :cond_1b
    return-void
.end method
