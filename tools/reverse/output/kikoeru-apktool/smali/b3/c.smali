.class public final Lb3/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lt2/r;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lt2/l0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lx2/d;

.field public final f:Lf3/c;

.field public final g:Lb3/d;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Lu2/f;

.field public j:Lc7/e1;

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt2/l0;Ljava/util/List;Ljava/util/List;Lx2/d;Lf3/c;)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, Lb3/c;->a:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Lb3/c;->b:Lt2/l0;

    .line 4
    iput-object v2, v0, Lb3/c;->c:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v0, Lb3/c;->d:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v0, Lb3/c;->e:Lx2/d;

    .line 7
    iput-object v3, v0, Lb3/c;->f:Lf3/c;

    .line 8
    new-instance v4, Lb3/d;

    invoke-interface {v3}, Lf3/c;->a()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, Le3/l;->b:Le3/l;

    iput-object v5, v4, Lb3/d;->b:Le3/l;

    const/4 v5, 0x3

    .line 12
    iput v5, v4, Lb3/d;->c:I

    .line 13
    sget-object v7, Lq1/k0;->d:Lq1/k0;

    .line 14
    iput-object v7, v4, Lb3/d;->d:Lq1/k0;

    .line 15
    iput-object v4, v0, Lb3/c;->g:Lb3/d;

    .line 16
    iget-object v7, v1, Lt2/l0;->c:Lt2/w;

    .line 17
    sget-object v7, Lb3/h;->a:Lb0/c1;

    .line 18
    sget-object v7, Lb3/h;->a:Lb0/c1;

    .line 19
    iget-object v8, v7, Lb0/c1;->b:Ljava/lang/Object;

    check-cast v8, Lx0/n2;

    if-eqz v8, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Lc4/k;->d()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 21
    invoke-virtual {v7}, Lb0/c1;->n()Lx0/n2;

    move-result-object v8

    iput-object v8, v7, Lb0/c1;->b:Ljava/lang/Object;

    goto :goto_0

    .line 22
    :cond_1
    sget-object v8, Lb3/i;->a:Lb3/j;

    .line 23
    :goto_0
    invoke-interface {v8}, Lx0/n2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 24
    iput-boolean v7, v0, Lb3/c;->k:Z

    .line 25
    iget-object v7, v1, Lt2/l0;->b:Lt2/s;

    .line 26
    iget v7, v7, Lt2/s;->b:I

    .line 27
    iget-object v8, v1, Lt2/l0;->a:Lt2/d0;

    .line 28
    iget-object v8, v8, Lt2/d0;->k:La3/c;

    const/4 v9, 0x4

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-ne v7, v9, :cond_3

    :cond_2
    :goto_1
    const/4 v7, 0x2

    goto :goto_3

    :cond_3
    const/4 v9, 0x5

    if-ne v7, v9, :cond_5

    :cond_4
    const/4 v7, 0x3

    goto :goto_3

    :cond_5
    if-ne v7, v6, :cond_6

    const/4 v7, 0x0

    goto :goto_3

    :cond_6
    if-ne v7, v10, :cond_7

    const/4 v7, 0x1

    goto :goto_3

    :cond_7
    if-ne v7, v5, :cond_8

    goto :goto_2

    :cond_8
    const/high16 v9, -0x80000000

    if-ne v7, v9, :cond_8c

    :goto_2
    if-eqz v8, :cond_9

    .line 29
    invoke-virtual {v8}, La3/c;->a()La3/b;

    move-result-object v7

    .line 30
    iget-object v7, v7, La3/b;->a:Ljava/util/Locale;

    if-nez v7, :cond_a

    .line 31
    :cond_9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 32
    :cond_a
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_2

    if-eq v7, v6, :cond_4

    goto :goto_1

    .line 33
    :goto_3
    iput v7, v0, Lb3/c;->l:I

    .line 34
    new-instance v7, La9/o;

    invoke-direct {v7, v6, v0}, La9/o;-><init>(ILjava/lang/Object;)V

    .line 35
    iget-object v8, v1, Lt2/l0;->b:Lt2/s;

    .line 36
    iget-object v8, v8, Lt2/s;->i:Le3/s;

    if-nez v8, :cond_b

    .line 37
    sget-object v8, Le3/s;->c:Le3/s;

    .line 38
    :cond_b
    iget-boolean v9, v8, Le3/s;->b:Z

    if-eqz v9, :cond_c

    .line 39
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    or-int/lit16 v9, v9, 0x80

    goto :goto_4

    .line 40
    :cond_c
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v9

    and-int/lit16 v9, v9, -0x81

    .line 41
    :goto_4
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setFlags(I)V

    .line 42
    iget v8, v8, Le3/s;->a:I

    if-ne v8, v6, :cond_d

    .line 43
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v5

    or-int/lit8 v5, v5, 0x40

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFlags(I)V

    .line 44
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    :cond_d
    if-ne v8, v10, :cond_e

    .line 45
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 46
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    :cond_e
    if-ne v8, v5, :cond_f

    .line 47
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 48
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_5

    .line 49
    :cond_f
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 50
    :goto_5
    iget-object v1, v1, Lt2/l0;->a:Lt2/d0;

    .line 51
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v5, :cond_11

    .line 52
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 53
    move-object v12, v10

    check-cast v12, Lt2/e;

    .line 54
    iget-object v12, v12, Lt2/e;->a:Ljava/lang/Object;

    .line 55
    instance-of v12, v12, Lt2/d0;

    if-eqz v12, :cond_10

    goto :goto_7

    :cond_10
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_11
    const/4 v10, 0x0

    :goto_7
    if-eqz v10, :cond_12

    const/4 v2, 0x1

    goto :goto_8

    :cond_12
    const/4 v2, 0x0

    .line 56
    :goto_8
    iget-wide v12, v1, Lt2/d0;->b:J

    iget-object v5, v1, Lt2/d0;->g:Ljava/lang/String;

    iget-object v8, v1, Lt2/d0;->a:Le3/o;

    iget-object v10, v1, Lt2/d0;->j:Le3/p;

    iget-object v14, v1, Lt2/d0;->k:La3/c;

    move-object/from16 p2, v10

    const/16 p1, 0x0

    iget-wide v9, v1, Lt2/d0;->h:J

    move-object/from16 p5, v7

    const/16 p4, 0x1

    .line 57
    invoke-static {v12, v13}, Lf3/o;->b(J)J

    move-result-wide v6

    move-wide/from16 v16, v12

    const-wide v11, 0x100000000L

    .line 58
    invoke-static {v6, v7, v11, v12}, Lf3/p;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_13

    move-wide/from16 v11, v16

    invoke-interface {v3, v11, v12}, Lf3/c;->i0(J)F

    move-result v6

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_9

    :cond_13
    const-wide v11, 0x200000000L

    .line 59
    invoke-static {v6, v7, v11, v12}, Lf3/p;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 60
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v6

    invoke-static/range {v16 .. v17}, Lf3/o;->c(J)F

    move-result v7

    mul-float v7, v7, v6

    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 61
    :cond_14
    :goto_9
    iget-object v6, v1, Lt2/d0;->f:Lx2/n;

    if-nez v6, :cond_16

    .line 62
    iget-object v7, v1, Lt2/d0;->d:Lx2/i;

    if-nez v7, :cond_16

    .line 63
    iget-object v7, v1, Lt2/d0;->c:Lx2/k;

    if-eqz v7, :cond_15

    goto :goto_a

    :cond_15
    move-object/from16 v13, p5

    move/from16 p5, v2

    goto :goto_f

    .line 64
    :cond_16
    :goto_a
    iget-object v7, v1, Lt2/d0;->c:Lx2/k;

    if-nez v7, :cond_17

    .line 65
    sget-object v7, Lx2/k;->d:Lx2/k;

    .line 66
    :cond_17
    iget-object v11, v1, Lt2/d0;->d:Lx2/i;

    if-eqz v11, :cond_18

    .line 67
    iget v11, v11, Lx2/i;->a:I

    goto :goto_b

    :cond_18
    const/4 v11, 0x0

    .line 68
    :goto_b
    iget-object v12, v1, Lt2/d0;->e:Lx2/j;

    if-eqz v12, :cond_19

    .line 69
    iget v12, v12, Lx2/j;->a:I

    :goto_c
    move-object/from16 v13, p5

    goto :goto_d

    :cond_19
    const v12, 0xffff

    goto :goto_c

    .line 70
    :goto_d
    iget-object v15, v13, La9/o;->b:Ljava/lang/Object;

    check-cast v15, Lb3/c;

    move/from16 p5, v2

    .line 71
    iget-object v2, v15, Lb3/c;->e:Lx2/d;

    check-cast v2, Lx2/e;

    invoke-virtual {v2, v6, v7, v11, v12}, Lx2/e;->b(Lx2/n;Lx2/k;II)Lx2/p;

    move-result-object v2

    .line 72
    instance-of v6, v2, Lx2/p;

    const-string v7, "null cannot be cast to non-null type android.graphics.Typeface"

    if-nez v6, :cond_1a

    .line 73
    new-instance v6, Lc7/e1;

    iget-object v11, v15, Lb3/c;->j:Lc7/e1;

    invoke-direct {v6, v2, v11}, Lc7/e1;-><init>(Lx2/p;Lc7/e1;)V

    .line 74
    iput-object v6, v15, Lb3/c;->j:Lc7/e1;

    .line 75
    iget-object v2, v6, Lc7/e1;->d:Ljava/lang/Object;

    invoke-static {v2, v7}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Typeface;

    goto :goto_e

    .line 76
    :cond_1a
    iget-object v2, v2, Lx2/p;->a:Ljava/lang/Object;

    .line 77
    invoke-static {v2, v7}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/graphics/Typeface;

    .line 78
    :goto_e
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_f
    const/16 v2, 0xa

    if-eqz v14, :cond_1e

    .line 79
    sget-object v6, La3/c;->c:La3/c;

    .line 80
    sget-object v6, La3/e;->a:La3/d;

    .line 81
    invoke-interface {v6}, La3/d;->r()La3/c;

    move-result-object v7

    .line 82
    invoke-virtual {v14, v7}, La3/c;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    .line 83
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x18

    if-lt v7, v11, :cond_1c

    .line 84
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v14, v2}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    iget-object v7, v14, La3/c;->a:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 86
    :goto_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 87
    check-cast v11, La3/b;

    .line 88
    iget-object v11, v11, La3/b;->a:Ljava/util/Locale;

    .line 89
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_1b
    const/4 v15, 0x0

    .line 90
    new-array v7, v15, [Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    .line 91
    check-cast v6, [Ljava/util/Locale;

    array-length v7, v6

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/util/Locale;

    invoke-static {v6}, La3/a;->e([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object v6

    .line 92
    invoke-static {v4, v6}, La3/a;->u(Lb3/d;Landroid/os/LocaleList;)V

    goto :goto_12

    .line 93
    :cond_1c
    iget-object v7, v14, La3/c;->a:Ljava/util/List;

    .line 94
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1d

    .line 95
    invoke-interface {v6}, La3/d;->r()La3/c;

    move-result-object v6

    invoke-virtual {v6}, La3/c;->a()La3/b;

    move-result-object v6

    goto :goto_11

    .line 96
    :cond_1d
    invoke-virtual {v14}, La3/c;->a()La3/b;

    move-result-object v6

    .line 97
    :goto_11
    iget-object v6, v6, La3/b;->a:Ljava/util/Locale;

    .line 98
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextLocale(Ljava/util/Locale;)V

    :cond_1e
    :goto_12
    if-eqz v5, :cond_1f

    .line 99
    const-string v6, ""

    .line 100
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    .line 101
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1f
    if-eqz p2, :cond_20

    .line 102
    sget-object v5, Le3/p;->c:Le3/p;

    move-object/from16 v6, p2

    .line 103
    invoke-virtual {v6, v5}, Le3/p;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    .line 104
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v5

    .line 105
    iget v7, v6, Le3/p;->a:F

    mul-float v5, v5, v7

    .line 106
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 107
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v5

    .line 108
    iget v6, v6, Le3/p;->b:F

    add-float/2addr v5, v6

    .line 109
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 110
    :cond_20
    invoke-interface {v8}, Le3/o;->b()J

    move-result-wide v5

    .line 111
    invoke-virtual {v4, v5, v6}, Lb3/d;->d(J)V

    .line 112
    invoke-interface {v8}, Le3/o;->e()Lq1/m;

    move-result-object v5

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 113
    invoke-interface {v8}, Le3/o;->a()F

    move-result v8

    .line 114
    invoke-virtual {v4, v8, v6, v7, v5}, Lb3/d;->c(FJLq1/m;)V

    .line 115
    iget-object v5, v1, Lt2/d0;->n:Lq1/k0;

    .line 116
    invoke-virtual {v4, v5}, Lb3/d;->f(Lq1/k0;)V

    .line 117
    iget-object v5, v1, Lt2/d0;->m:Le3/l;

    .line 118
    invoke-virtual {v4, v5}, Lb3/d;->g(Le3/l;)V

    .line 119
    iget-object v5, v1, Lt2/d0;->p:Ls1/e;

    .line 120
    invoke-virtual {v4, v5}, Lb3/d;->e(Ls1/e;)V

    .line 121
    invoke-static {v9, v10}, Lf3/o;->b(J)J

    move-result-wide v5

    const-wide v7, 0x100000000L

    invoke-static {v5, v6, v7, v8}, Lf3/p;->a(JJ)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_23

    invoke-static {v9, v10}, Lf3/o;->c(J)F

    move-result v5

    cmpg-float v5, v5, v6

    if-nez v5, :cond_21

    goto :goto_13

    .line 122
    :cond_21
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v7

    mul-float v7, v7, v5

    .line 123
    invoke-interface {v3, v9, v10}, Lf3/c;->i0(J)F

    move-result v3

    cmpg-float v5, v7, v6

    if-nez v5, :cond_22

    goto :goto_14

    :cond_22
    div-float/2addr v3, v7

    .line 124
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_14

    .line 125
    :cond_23
    :goto_13
    invoke-static {v9, v10}, Lf3/o;->b(J)J

    move-result-wide v7

    const-wide v11, 0x200000000L

    invoke-static {v7, v8, v11, v12}, Lf3/p;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 126
    invoke-static {v9, v10}, Lf3/o;->c(J)F

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 127
    :cond_24
    :goto_14
    iget-wide v3, v1, Lt2/d0;->l:J

    .line 128
    iget-object v1, v1, Lt2/d0;->i:Le3/a;

    if-eqz p5, :cond_26

    .line 129
    invoke-static {v9, v10}, Lf3/o;->b(J)J

    move-result-wide v7

    const-wide v11, 0x100000000L

    invoke-static {v7, v8, v11, v12}, Lf3/p;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-static {v9, v10}, Lf3/o;->c(J)F

    move-result v5

    cmpg-float v5, v5, v6

    if-nez v5, :cond_25

    goto :goto_15

    :cond_25
    const/4 v5, 0x1

    goto :goto_16

    :cond_26
    :goto_15
    const/4 v5, 0x0

    .line 130
    :goto_16
    sget-wide v7, Lq1/q;->h:J

    .line 131
    invoke-static {v3, v4, v7, v8}, Lq1/q;->c(JJ)Z

    move-result v11

    if-nez v11, :cond_27

    .line 132
    sget-wide v11, Lq1/q;->g:J

    .line 133
    invoke-static {v3, v4, v11, v12}, Lq1/q;->c(JJ)Z

    move-result v11

    if-nez v11, :cond_27

    const/4 v11, 0x1

    goto :goto_17

    :cond_27
    const/4 v11, 0x0

    :goto_17
    if-eqz v1, :cond_29

    .line 134
    iget v12, v1, Le3/a;->a:F

    .line 135
    invoke-static {v12, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-nez v12, :cond_28

    goto :goto_18

    :cond_28
    const/4 v12, 0x1

    goto :goto_19

    :cond_29
    :goto_18
    const/4 v12, 0x0

    :goto_19
    if-nez v5, :cond_2a

    if-nez v11, :cond_2a

    if-nez v12, :cond_2a

    move-object/from16 v1, p1

    goto :goto_1e

    :cond_2a
    if-eqz v5, :cond_2b

    :goto_1a
    move-wide/from16 v28, v9

    goto :goto_1b

    .line 136
    :cond_2b
    sget-wide v9, Lf3/o;->c:J

    goto :goto_1a

    :goto_1b
    if-eqz v11, :cond_2c

    move-wide/from16 v33, v3

    goto :goto_1c

    :cond_2c
    move-wide/from16 v33, v7

    :goto_1c
    if-eqz v12, :cond_2d

    move-object/from16 v30, v1

    goto :goto_1d

    :cond_2d
    move-object/from16 v30, p1

    .line 137
    :goto_1d
    new-instance v18, Lt2/d0;

    const/16 v36, 0x0

    const v37, 0xf67f

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v18 .. v37}, Lt2/d0;-><init>(JJLx2/k;Lx2/i;Lx2/j;Lx2/n;Ljava/lang/String;JLe3/a;Le3/p;La3/c;JLe3/l;Lq1/k0;I)V

    move-object/from16 v1, v18

    :goto_1e
    if-eqz v1, :cond_2f

    .line 138
    iget-object v3, v0, Lb3/c;->c:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_1f
    if-ge v5, v3, :cond_30

    if-nez v5, :cond_2e

    .line 139
    new-instance v7, Lt2/e;

    .line 140
    iget-object v8, v0, Lb3/c;->a:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v15, 0x0

    .line 141
    invoke-direct {v7, v15, v8, v1}, Lt2/e;-><init>(IILjava/lang/Object;)V

    goto :goto_20

    .line 142
    :cond_2e
    iget-object v7, v0, Lb3/c;->c:Ljava/util/List;

    add-int/lit8 v8, v5, -0x1

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt2/e;

    .line 143
    :goto_20
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1f

    .line 144
    :cond_2f
    iget-object v4, v0, Lb3/c;->c:Ljava/util/List;

    .line 145
    :cond_30
    iget-object v1, v0, Lb3/c;->a:Ljava/lang/String;

    .line 146
    iget-object v3, v0, Lb3/c;->g:Lb3/d;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    .line 147
    iget-object v5, v0, Lb3/c;->b:Lt2/l0;

    .line 148
    iget-object v7, v0, Lb3/c;->d:Ljava/util/List;

    .line 149
    iget-object v8, v0, Lb3/c;->f:Lf3/c;

    .line 150
    iget-boolean v9, v0, Lb3/c;->k:Z

    .line 151
    sget-object v10, Lb3/b;->a:Lb3/a;

    .line 152
    const-class v10, Lc4/x;

    if-eqz v9, :cond_45

    invoke-static {}, Lc4/k;->d()Z

    move-result v9

    if-eqz v9, :cond_45

    .line 153
    iget-object v9, v5, Lt2/l0;->c:Lt2/w;

    if-eqz v9, :cond_31

    .line 154
    iget-object v9, v9, Lt2/w;->b:Lt2/u;

    .line 155
    :cond_31
    invoke-static {}, Lc4/k;->a()Lc4/k;

    move-result-object v9

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v11

    .line 156
    invoke-virtual {v9}, Lc4/k;->c()I

    move-result v12

    const/4 v14, 0x1

    if-ne v12, v14, :cond_32

    const/4 v12, 0x1

    goto :goto_21

    :cond_32
    const/4 v12, 0x0

    :goto_21
    if-eqz v12, :cond_44

    if-ltz v11, :cond_43

    if-ltz v11, :cond_33

    const/4 v12, 0x1

    goto :goto_22

    :cond_33
    const/4 v12, 0x0

    :goto_22
    if-eqz v12, :cond_42

    .line 157
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v12

    if-ltz v12, :cond_34

    const/4 v12, 0x1

    goto :goto_23

    :cond_34
    const/4 v12, 0x0

    :goto_23
    if-eqz v12, :cond_41

    .line 158
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v12

    if-gt v11, v12, :cond_35

    const/4 v12, 0x1

    goto :goto_24

    :cond_35
    const/4 v12, 0x0

    :goto_24
    if-eqz v12, :cond_40

    .line 159
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v12

    if-eqz v12, :cond_36

    if-nez v11, :cond_37

    :cond_36
    move-object/from16 v19, v1

    const/16 p2, 0x0

    goto/16 :goto_2a

    .line 160
    :cond_37
    iget-object v9, v9, Lc4/k;->e:Lc4/f;

    .line 161
    iget-object v9, v9, Lc4/f;->b:Lc7/e1;

    .line 162
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    instance-of v12, v1, Landroid/text/Spannable;

    if-eqz v12, :cond_38

    .line 164
    new-instance v12, Lc4/z;

    move-object v14, v1

    check-cast v14, Landroid/text/Spannable;

    invoke-direct {v12, v14}, Lc4/z;-><init>(Landroid/text/Spannable;)V

    const/16 p2, 0x0

    const/4 v15, 0x0

    goto :goto_27

    .line 165
    :cond_38
    instance-of v12, v1, Landroid/text/Spanned;

    if-eqz v12, :cond_3a

    .line 166
    move-object v12, v1

    check-cast v12, Landroid/text/Spanned;

    add-int/lit8 v14, v11, 0x1

    const/16 p2, 0x0

    const/4 v6, -0x1

    invoke-interface {v12, v6, v14, v10}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v6

    if-gt v6, v11, :cond_39

    .line 167
    new-instance v12, Lc4/z;

    .line 168
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    const/4 v15, 0x0

    .line 169
    iput-boolean v15, v12, Lc4/z;->a:Z

    .line 170
    new-instance v6, Landroid/text/SpannableString;

    invoke-direct {v6, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v6, v12, Lc4/z;->b:Landroid/text/Spannable;

    goto :goto_27

    :cond_39
    :goto_25
    const/4 v15, 0x0

    goto :goto_26

    :cond_3a
    const/16 p2, 0x0

    goto :goto_25

    :goto_26
    move-object/from16 v12, p1

    :goto_27
    if-eqz v12, :cond_3d

    .line 171
    iget-object v6, v12, Lc4/z;->b:Landroid/text/Spannable;

    invoke-interface {v6, v15, v11, v10}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v6

    .line 172
    check-cast v6, [Lc4/x;

    if-eqz v6, :cond_3d

    .line 173
    array-length v14, v6

    if-lez v14, :cond_3d

    .line 174
    array-length v14, v6

    const/4 v2, 0x0

    const/4 v15, 0x0

    :goto_28
    move-object/from16 v19, v1

    if-ge v15, v14, :cond_3c

    .line 175
    aget-object v1, v6, v15

    move-object/from16 p6, v6

    .line 176
    iget-object v6, v12, Lc4/z;->b:Landroid/text/Spannable;

    invoke-interface {v6, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    move/from16 v16, v14

    .line 177
    iget-object v14, v12, Lc4/z;->b:Landroid/text/Spannable;

    invoke-interface {v14, v1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v14

    if-eq v6, v11, :cond_3b

    .line 178
    invoke-virtual {v12, v1}, Lc4/z;->removeSpan(Ljava/lang/Object;)V

    .line 179
    :cond_3b
    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 180
    invoke-static {v14, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v6, p6

    move/from16 v14, v16

    move-object/from16 v1, v19

    goto :goto_28

    :cond_3c
    move v15, v2

    goto :goto_29

    :cond_3d
    move-object/from16 v19, v1

    const/4 v15, 0x0

    :goto_29
    if-eq v15, v11, :cond_3f

    .line 181
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v15, v1, :cond_3e

    goto :goto_2a

    .line 182
    :cond_3e
    new-instance v1, Landroidx/media3/exoplayer/offline/u;

    iget-object v2, v9, Lc7/e1;->b:Ljava/lang/Object;

    check-cast v2, Lpe/d;

    const/16 v6, 0x8

    invoke-direct {v1, v6, v12, v2}, Landroidx/media3/exoplayer/offline/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v22, 0x7fffffff

    const/16 v23, 0x0

    move-object/from16 v24, v1

    move-object/from16 v18, v9

    move/from16 v21, v11

    move/from16 v20, v15

    invoke-virtual/range {v18 .. v24}, Lc7/e1;->O(Ljava/lang/CharSequence;IIIZLc4/q;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/z;

    if-eqz v1, :cond_3f

    .line 183
    iget-object v1, v1, Lc4/z;->b:Landroid/text/Spannable;

    goto :goto_2b

    :cond_3f
    :goto_2a
    move-object/from16 v1, v19

    .line 184
    :goto_2b
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    goto :goto_2c

    .line 185
    :cond_40
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "end should be < than charSequence length"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 186
    :cond_41
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "start should be < than charSequence length"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 187
    :cond_42
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "start should be <= than end"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 188
    :cond_43
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "end cannot be negative"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 189
    :cond_44
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Not initialized yet"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_45
    move-object/from16 v19, v1

    const/16 p2, 0x0

    move-object/from16 v1, v19

    .line 190
    :goto_2c
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-wide/16 v11, 0x0

    const-wide v16, 0xff00000000L

    if-eqz v2, :cond_46

    .line 191
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_46

    .line 192
    iget-object v2, v5, Lt2/l0;->b:Lt2/s;

    .line 193
    iget-object v2, v2, Lt2/s;->d:Le3/q;

    .line 194
    sget-object v6, Le3/q;->c:Le3/q;

    .line 195
    invoke-static {v2, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_46

    .line 196
    iget-object v2, v5, Lt2/l0;->b:Lt2/s;

    .line 197
    iget-wide v14, v2, Lt2/s;->c:J

    and-long v14, v14, v16

    cmp-long v2, v14, v11

    if-nez v2, :cond_46

    goto/16 :goto_55

    .line 198
    :cond_46
    instance-of v2, v1, Landroid/text/Spannable;

    if-eqz v2, :cond_47

    .line 199
    check-cast v1, Landroid/text/Spannable;

    goto :goto_2d

    .line 200
    :cond_47
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v1, v2

    .line 201
    :goto_2d
    iget-object v2, v5, Lt2/l0;->a:Lt2/d0;

    .line 202
    iget-object v2, v2, Lt2/d0;->m:Le3/l;

    .line 203
    sget-object v6, Le3/l;->c:Le3/l;

    invoke-static {v2, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v6, 0x21

    if-eqz v2, :cond_48

    .line 204
    sget-object v2, Lb3/b;->a:Lb3/a;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v15, 0x0

    .line 205
    invoke-interface {v1, v2, v15, v9, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 206
    :cond_48
    iget-object v2, v5, Lt2/l0;->c:Lt2/w;

    if-eqz v2, :cond_49

    .line 207
    iget-object v2, v2, Lt2/w;->b:Lt2/u;

    if-eqz v2, :cond_49

    .line 208
    iget-boolean v2, v2, Lt2/u;->a:Z

    goto :goto_2e

    :cond_49
    const/4 v2, 0x0

    :goto_2e
    if-eqz v2, :cond_4b

    .line 209
    iget-object v2, v5, Lt2/l0;->b:Lt2/s;

    .line 210
    iget-object v9, v2, Lt2/s;->f:Le3/i;

    if-nez v9, :cond_4b

    move-wide/from16 v18, v11

    .line 211
    iget-wide v11, v2, Lt2/s;->c:J

    .line 212
    invoke-static {v11, v12, v3, v8}, La/a;->N(JFLf3/c;)F

    move-result v2

    .line 213
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_4a

    .line 214
    new-instance v9, Lw2/g;

    invoke-direct {v9, v2}, Lw2/g;-><init>(F)V

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v15, 0x0

    .line 215
    invoke-interface {v1, v9, v15, v2, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_4a
    const/4 v15, 0x0

    goto :goto_34

    :cond_4b
    move-wide/from16 v18, v11

    .line 216
    iget-object v2, v5, Lt2/l0;->b:Lt2/s;

    .line 217
    iget-object v9, v2, Lt2/s;->f:Le3/i;

    if-nez v9, :cond_4c

    .line 218
    sget-object v9, Le3/i;->c:Le3/i;

    .line 219
    :cond_4c
    iget-wide v11, v2, Lt2/s;->c:J

    .line 220
    invoke-static {v11, v12, v3, v8}, La/a;->N(JFLf3/c;)F

    move-result v21

    .line 221
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_4a

    .line 222
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_4d

    goto :goto_2f

    :cond_4d
    invoke-static {v1}, Lef/n;->z0(Ljava/lang/CharSequence;)C

    move-result v2

    const/16 v11, 0xa

    if-ne v2, v11, :cond_4e

    :goto_2f
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v14, 0x1

    add-int/2addr v2, v14

    :goto_30
    move/from16 v22, v2

    goto :goto_31

    :cond_4e
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    goto :goto_30

    .line 223
    :goto_31
    new-instance v20, Lw2/h;

    .line 224
    iget v2, v9, Le3/i;->b:I

    and-int/lit8 v11, v2, 0x1

    if-lez v11, :cond_4f

    const/16 v23, 0x1

    goto :goto_32

    :cond_4f
    const/16 v23, 0x0

    :goto_32
    and-int/lit8 v2, v2, 0x10

    if-lez v2, :cond_50

    const/16 v24, 0x1

    goto :goto_33

    :cond_50
    const/16 v24, 0x0

    .line 225
    :goto_33
    iget v2, v9, Le3/i;->a:F

    const/16 v26, 0x0

    move/from16 v25, v2

    .line 226
    invoke-direct/range {v20 .. v26}, Lw2/h;-><init>(FIZZFZ)V

    move-object/from16 v2, v20

    .line 227
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v9

    const/4 v15, 0x0

    .line 228
    invoke-interface {v1, v2, v15, v9, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 229
    :goto_34
    iget-object v2, v5, Lt2/l0;->b:Lt2/s;

    .line 230
    iget-object v2, v2, Lt2/s;->d:Le3/q;

    if-eqz v2, :cond_58

    .line 231
    iget-wide v11, v2, Le3/q;->a:J

    move-object v9, v7

    iget-wide v6, v2, Le3/q;->b:J

    move/from16 p5, v3

    .line 232
    invoke-static {v15}, Llc/b;->C(I)J

    move-result-wide v2

    invoke-static {v11, v12, v2, v3}, Lf3/o;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_51

    invoke-static {v15}, Llc/b;->C(I)J

    move-result-wide v2

    invoke-static {v6, v7, v2, v3}, Lf3/o;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_59

    :cond_51
    and-long v2, v11, v16

    cmp-long v14, v2, v18

    if-nez v14, :cond_52

    goto/16 :goto_37

    :cond_52
    and-long v2, v6, v16

    cmp-long v14, v2, v18

    if-nez v14, :cond_53

    goto/16 :goto_37

    .line 233
    :cond_53
    invoke-static {v11, v12}, Lf3/o;->b(J)J

    move-result-wide v2

    const-wide v14, 0x100000000L

    .line 234
    invoke-static {v2, v3, v14, v15}, Lf3/p;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_54

    invoke-interface {v8, v11, v12}, Lf3/c;->i0(J)F

    move-result v2

    const-wide v14, 0x200000000L

    goto :goto_35

    :cond_54
    const-wide v14, 0x200000000L

    .line 235
    invoke-static {v2, v3, v14, v15}, Lf3/p;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_55

    invoke-static {v11, v12}, Lf3/o;->c(J)F

    move-result v2

    mul-float v2, v2, p5

    goto :goto_35

    :cond_55
    const/4 v2, 0x0

    .line 236
    :goto_35
    invoke-static {v6, v7}, Lf3/o;->b(J)J

    move-result-wide v11

    const-wide v14, 0x100000000L

    .line 237
    invoke-static {v11, v12, v14, v15}, Lf3/p;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_56

    invoke-interface {v8, v6, v7}, Lf3/c;->i0(J)F

    move-result v3

    goto :goto_36

    :cond_56
    const-wide v14, 0x200000000L

    .line 238
    invoke-static {v11, v12, v14, v15}, Lf3/p;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_57

    invoke-static {v6, v7}, Lf3/o;->c(J)F

    move-result v3

    mul-float v3, v3, p5

    goto :goto_36

    :cond_57
    const/4 v3, 0x0

    .line 239
    :goto_36
    new-instance v6, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v11, v2

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-float v2, v11

    float-to-int v2, v2

    float-to-double v11, v3

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-float v3, v11

    float-to-int v3, v3

    invoke-direct {v6, v2, v3}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 240
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/16 v3, 0x21

    const/4 v15, 0x0

    .line 241
    invoke-interface {v1, v6, v15, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_37

    :cond_58
    move-object v9, v7

    .line 242
    :cond_59
    :goto_37
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    move-object v3, v4

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_38
    if-ge v7, v6, :cond_5e

    .line 244
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 245
    check-cast v11, Lt2/e;

    .line 246
    iget-object v12, v11, Lt2/e;->a:Ljava/lang/Object;

    .line 247
    instance-of v14, v12, Lt2/d0;

    if-eqz v14, :cond_5d

    move-object v14, v12

    check-cast v14, Lt2/d0;

    .line 248
    iget-object v15, v14, Lt2/d0;->f:Lx2/n;

    if-nez v15, :cond_5b

    .line 249
    iget-object v15, v14, Lt2/d0;->d:Lx2/i;

    if-nez v15, :cond_5b

    .line 250
    iget-object v14, v14, Lt2/d0;->c:Lx2/k;

    if-eqz v14, :cond_5a

    goto :goto_39

    :cond_5a
    const/4 v14, 0x0

    goto :goto_3a

    :cond_5b
    :goto_39
    const/4 v14, 0x1

    :goto_3a
    if-nez v14, :cond_5c

    .line 251
    check-cast v12, Lt2/d0;

    .line 252
    iget-object v12, v12, Lt2/d0;->e:Lx2/j;

    if-eqz v12, :cond_5d

    .line 253
    :cond_5c
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5d
    add-int/lit8 v7, v7, 0x1

    goto :goto_38

    .line 254
    :cond_5e
    iget-object v6, v5, Lt2/l0;->a:Lt2/d0;

    .line 255
    iget-object v7, v6, Lt2/d0;->f:Lx2/n;

    if-nez v7, :cond_60

    .line 256
    iget-object v11, v6, Lt2/d0;->d:Lx2/i;

    if-nez v11, :cond_60

    .line 257
    iget-object v11, v6, Lt2/d0;->c:Lx2/k;

    if-eqz v11, :cond_5f

    goto :goto_3b

    :cond_5f
    const/4 v11, 0x0

    goto :goto_3c

    :cond_60
    :goto_3b
    const/4 v11, 0x1

    :goto_3c
    if-nez v11, :cond_62

    .line 258
    iget-object v11, v6, Lt2/d0;->e:Lx2/j;

    if-eqz v11, :cond_61

    goto :goto_3d

    :cond_61
    move-object/from16 v6, p1

    goto :goto_3e

    .line 259
    :cond_62
    :goto_3d
    iget-object v11, v6, Lt2/d0;->c:Lx2/k;

    .line 260
    iget-object v12, v6, Lt2/d0;->d:Lx2/i;

    .line 261
    iget-object v6, v6, Lt2/d0;->e:Lx2/j;

    .line 262
    new-instance v18, Lt2/d0;

    const/16 v36, 0x0

    const v37, 0xffc3

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    invoke-direct/range {v18 .. v37}, Lt2/d0;-><init>(JJLx2/k;Lx2/i;Lx2/j;Lx2/n;Ljava/lang/String;JLe3/a;Le3/p;La3/c;JLe3/l;Lq1/k0;I)V

    move-object/from16 v6, v18

    .line 263
    :goto_3e
    new-instance v7, Lba/k;

    const/4 v14, 0x1

    invoke-direct {v7, v14, v1, v13}, Lba/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 264
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-gt v11, v14, :cond_66

    .line 265
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_64

    const/4 v15, 0x0

    .line 266
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lt2/e;

    .line 267
    iget-object v11, v11, Lt2/e;->a:Ljava/lang/Object;

    .line 268
    check-cast v11, Lt2/d0;

    if-nez v6, :cond_63

    goto :goto_3f

    .line 269
    :cond_63
    invoke-virtual {v6, v11}, Lt2/d0;->c(Lt2/d0;)Lt2/d0;

    move-result-object v11

    .line 270
    :goto_3f
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt2/e;

    .line 271
    iget v6, v6, Lt2/e;->b:I

    .line 272
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 273
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt2/e;

    .line 274
    iget v2, v2, Lt2/e;->c:I

    .line 275
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 276
    invoke-virtual {v7, v11, v6, v2}, Lba/k;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_64
    move-object/from16 p5, v3

    :cond_65
    move-object/from16 v21, v8

    move-object/from16 v24, v9

    goto/16 :goto_46

    .line 277
    :cond_66
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    mul-int/lit8 v12, v11, 0x2

    .line 278
    new-array v13, v12, [I

    .line 279
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_40
    if-ge v15, v14, :cond_67

    .line 280
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p5, v3

    .line 281
    move-object/from16 v3, v16

    check-cast v3, Lt2/e;

    move-object/from16 v16, v6

    .line 282
    iget v6, v3, Lt2/e;->b:I

    .line 283
    aput v6, v13, v15

    add-int v6, v15, v11

    .line 284
    iget v3, v3, Lt2/e;->c:I

    .line 285
    aput v3, v13, v6

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v3, p5

    move-object/from16 v6, v16

    goto :goto_40

    :cond_67
    move-object/from16 p5, v3

    move-object/from16 v16, v6

    const/4 v3, 0x1

    if-le v12, v3, :cond_68

    .line 286
    invoke-static {v13}, Ljava/util/Arrays;->sort([I)V

    :cond_68
    if-eqz v12, :cond_8b

    const/4 v15, 0x0

    .line 287
    aget v3, v13, v15

    const/4 v6, 0x0

    :goto_41
    if-ge v6, v12, :cond_65

    .line 288
    aget v11, v13, v6

    if-ne v11, v3, :cond_69

    move-object/from16 v19, v2

    move/from16 v17, v6

    move-object/from16 v21, v8

    move-object/from16 v24, v9

    goto :goto_45

    .line 289
    :cond_69
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v14

    move/from16 v17, v6

    move-object/from16 v6, v16

    const/4 v15, 0x0

    :goto_42
    if-ge v15, v14, :cond_6c

    .line 290
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v2

    .line 291
    move-object/from16 v2, v18

    check-cast v2, Lt2/e;

    move-object/from16 v21, v8

    .line 292
    iget v8, v2, Lt2/e;->b:I

    move-object/from16 v24, v9

    .line 293
    iget v9, v2, Lt2/e;->c:I

    if-eq v8, v9, :cond_6b

    .line 294
    invoke-static {v3, v11, v8, v9}, Lt2/h;->b(IIII)Z

    move-result v8

    if-eqz v8, :cond_6b

    .line 295
    iget-object v2, v2, Lt2/e;->a:Ljava/lang/Object;

    .line 296
    check-cast v2, Lt2/d0;

    if-nez v6, :cond_6a

    :goto_43
    move-object v6, v2

    goto :goto_44

    .line 297
    :cond_6a
    invoke-virtual {v6, v2}, Lt2/d0;->c(Lt2/d0;)Lt2/d0;

    move-result-object v2

    goto :goto_43

    :cond_6b
    :goto_44
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, v19

    move-object/from16 v8, v21

    move-object/from16 v9, v24

    goto :goto_42

    :cond_6c
    move-object/from16 v19, v2

    move-object/from16 v21, v8

    move-object/from16 v24, v9

    if-eqz v6, :cond_6d

    .line 298
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v7, v6, v2, v3}, Lba/k;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6d
    move v3, v11

    :goto_45
    add-int/lit8 v6, v17, 0x1

    move-object/from16 v2, v19

    move-object/from16 v8, v21

    move-object/from16 v9, v24

    goto :goto_41

    .line 299
    :goto_46
    invoke-interface/range {p5 .. p5}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v6, 0x0

    :goto_47
    if-ge v3, v2, :cond_7e

    .line 300
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt2/e;

    .line 301
    iget-object v8, v7, Lt2/e;->a:Ljava/lang/Object;

    .line 302
    instance-of v9, v8, Lt2/d0;

    if-eqz v9, :cond_6e

    .line 303
    iget v9, v7, Lt2/e;->b:I

    .line 304
    iget v7, v7, Lt2/e;->c:I

    if-ltz v9, :cond_6e

    .line 305
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v9, v11, :cond_6e

    if-le v7, v9, :cond_6e

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-le v7, v11, :cond_6f

    :cond_6e
    move/from16 v16, v2

    move/from16 v17, v3

    move-object/from16 v7, v21

    goto/16 :goto_4e

    .line 306
    :cond_6f
    check-cast v8, Lt2/d0;

    .line 307
    iget-object v11, v8, Lt2/d0;->i:Le3/a;

    iget-object v12, v8, Lt2/d0;->a:Le3/o;

    if-eqz v11, :cond_70

    .line 308
    iget v11, v11, Le3/a;->a:F

    .line 309
    new-instance v13, Lw2/a;

    const/4 v15, 0x0

    invoke-direct {v13, v11, v15}, Lw2/a;-><init>(FI)V

    const/16 v11, 0x21

    .line 310
    invoke-interface {v1, v13, v9, v7, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 311
    :cond_70
    invoke-interface {v12}, Le3/o;->b()J

    move-result-wide v13

    .line 312
    invoke-static {v1, v13, v14, v9, v7}, La/a;->S(Landroid/text/Spannable;JII)V

    .line 313
    invoke-interface {v12}, Le3/o;->e()Lq1/m;

    move-result-object v11

    .line 314
    invoke-interface {v12}, Le3/o;->a()F

    move-result v12

    if-eqz v11, :cond_72

    .line 315
    instance-of v13, v11, Lq1/n0;

    if-eqz v13, :cond_71

    .line 316
    check-cast v11, Lq1/n0;

    .line 317
    iget-wide v11, v11, Lq1/n0;->a:J

    .line 318
    invoke-static {v1, v11, v12, v9, v7}, La/a;->S(Landroid/text/Spannable;JII)V

    goto :goto_48

    .line 319
    :cond_71
    new-instance v13, Ld3/b;

    check-cast v11, Lq1/j0;

    invoke-direct {v13, v11, v12}, Ld3/b;-><init>(Lq1/j0;F)V

    const/16 v11, 0x21

    .line 320
    invoke-interface {v1, v13, v9, v7, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 321
    :cond_72
    :goto_48
    iget-object v11, v8, Lt2/d0;->m:Le3/l;

    if-eqz v11, :cond_75

    .line 322
    iget v11, v11, Le3/l;->a:I

    .line 323
    new-instance v12, Lw2/k;

    or-int/lit8 v13, v11, 0x1

    if-ne v13, v11, :cond_73

    const/4 v13, 0x1

    goto :goto_49

    :cond_73
    const/4 v13, 0x0

    :goto_49
    or-int/lit8 v14, v11, 0x2

    if-ne v14, v11, :cond_74

    const/4 v11, 0x1

    goto :goto_4a

    :cond_74
    const/4 v11, 0x0

    :goto_4a
    invoke-direct {v12, v13, v11}, Lw2/k;-><init>(ZZ)V

    const/16 v11, 0x21

    .line 324
    invoke-interface {v1, v12, v9, v7, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_4b

    :cond_75
    const/16 v11, 0x21

    .line 325
    :goto_4b
    iget-wide v12, v8, Lt2/d0;->b:J

    move-object/from16 v18, v1

    move/from16 v23, v7

    move/from16 v22, v9

    move-wide/from16 v19, v12

    .line 326
    invoke-static/range {v18 .. v23}, La/a;->T(Landroid/text/Spannable;JLf3/c;II)V

    move-object/from16 v7, v21

    move/from16 v12, v23

    .line 327
    iget-object v13, v8, Lt2/d0;->g:Ljava/lang/String;

    if-eqz v13, :cond_76

    .line 328
    new-instance v14, Lw2/b;

    const/4 v15, 0x0

    invoke-direct {v14, v15, v13}, Lw2/b;-><init>(ILjava/lang/Object;)V

    .line 329
    invoke-interface {v1, v14, v9, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 330
    :cond_76
    iget-object v13, v8, Lt2/d0;->j:Le3/p;

    if-eqz v13, :cond_77

    .line 331
    new-instance v14, Landroid/text/style/ScaleXSpan;

    .line 332
    iget v15, v13, Le3/p;->a:F

    .line 333
    invoke-direct {v14, v15}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 334
    invoke-interface {v1, v14, v9, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 335
    new-instance v14, Lw2/a;

    .line 336
    iget v13, v13, Le3/p;->b:F

    const/4 v15, 0x1

    .line 337
    invoke-direct {v14, v13, v15}, Lw2/a;-><init>(FI)V

    .line 338
    invoke-interface {v1, v14, v9, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_4c

    :cond_77
    const/4 v15, 0x1

    .line 339
    :goto_4c
    iget-object v11, v8, Lt2/d0;->k:La3/c;

    .line 340
    invoke-static {v1, v11, v9, v12}, La/a;->U(Landroid/text/Spannable;La3/c;II)V

    .line 341
    iget-wide v13, v8, Lt2/d0;->l:J

    const-wide/16 v16, 0x10

    cmp-long v11, v13, v16

    if-eqz v11, :cond_78

    .line 342
    new-instance v11, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v13, v14}, Lq1/h0;->B(J)I

    move-result v13

    invoke-direct {v11, v13}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/16 v13, 0x21

    .line 343
    invoke-interface {v1, v11, v9, v12, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 344
    :cond_78
    iget-object v11, v8, Lt2/d0;->n:Lq1/k0;

    if-eqz v11, :cond_7a

    .line 345
    iget-wide v13, v11, Lq1/k0;->b:J

    .line 346
    new-instance v15, Lw2/j;

    move/from16 v16, v2

    move/from16 v17, v3

    .line 347
    iget-wide v2, v11, Lq1/k0;->a:J

    .line 348
    invoke-static {v2, v3}, Lq1/h0;->B(J)I

    move-result v2

    const/16 v3, 0x20

    move-wide/from16 v18, v13

    shr-long v13, v18, v3

    long-to-int v3, v13

    .line 349
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v13, 0xffffffffL

    and-long v13, v18, v13

    long-to-int v14, v13

    .line 350
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 351
    iget v11, v11, Lq1/k0;->c:F

    cmpg-float v14, v11, p2

    if-nez v14, :cond_79

    const/4 v11, 0x1

    .line 352
    :cond_79
    invoke-direct {v15, v2, v3, v13, v11}, Lw2/j;-><init>(IFFF)V

    const/16 v11, 0x21

    .line 353
    invoke-interface {v1, v15, v9, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_4d

    :cond_7a
    move/from16 v16, v2

    move/from16 v17, v3

    const/16 v11, 0x21

    .line 354
    :goto_4d
    iget-object v2, v8, Lt2/d0;->p:Ls1/e;

    if-eqz v2, :cond_7b

    .line 355
    new-instance v3, Ld3/a;

    invoke-direct {v3, v2}, Ld3/a;-><init>(Ls1/e;)V

    .line 356
    invoke-interface {v1, v3, v9, v12, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 357
    :cond_7b
    iget-wide v2, v8, Lt2/d0;->h:J

    .line 358
    invoke-static {v2, v3}, Lf3/o;->b(J)J

    move-result-wide v2

    const-wide v14, 0x100000000L

    invoke-static {v2, v3, v14, v15}, Lf3/p;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_7c

    .line 359
    iget-wide v2, v8, Lt2/d0;->h:J

    .line 360
    invoke-static {v2, v3}, Lf3/o;->b(J)J

    move-result-wide v2

    const-wide v11, 0x200000000L

    invoke-static {v2, v3, v11, v12}, Lf3/p;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_7d

    :cond_7c
    const/4 v6, 0x1

    :cond_7d
    :goto_4e
    add-int/lit8 v3, v17, 0x1

    move-object/from16 v21, v7

    move/from16 v2, v16

    goto/16 :goto_47

    :cond_7e
    move-object/from16 v7, v21

    if-eqz v6, :cond_84

    .line 361
    invoke-interface/range {p5 .. p5}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_4f
    if-ge v3, v2, :cond_84

    .line 362
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt2/e;

    .line 363
    iget-object v8, v6, Lt2/e;->a:Ljava/lang/Object;

    .line 364
    check-cast v8, Lt2/b;

    .line 365
    instance-of v9, v8, Lt2/d0;

    if-eqz v9, :cond_7f

    .line 366
    iget v9, v6, Lt2/e;->b:I

    .line 367
    iget v6, v6, Lt2/e;->c:I

    if-ltz v9, :cond_7f

    .line 368
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v9, v11, :cond_7f

    if-le v6, v9, :cond_7f

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-le v6, v11, :cond_80

    :cond_7f
    move/from16 p2, v2

    move v8, v3

    const/16 v11, 0x21

    goto :goto_51

    .line 369
    :cond_80
    check-cast v8, Lt2/d0;

    .line 370
    iget-wide v11, v8, Lt2/d0;->h:J

    .line 371
    invoke-static {v11, v12}, Lf3/o;->b(J)J

    move-result-wide v13

    move/from16 p2, v2

    move v8, v3

    const-wide v2, 0x100000000L

    .line 372
    invoke-static {v13, v14, v2, v3}, Lf3/p;->a(JJ)Z

    move-result v15

    if-eqz v15, :cond_81

    new-instance v2, Lw2/f;

    invoke-interface {v7, v11, v12}, Lf3/c;->i0(J)F

    move-result v3

    invoke-direct {v2, v3}, Lw2/f;-><init>(F)V

    goto :goto_50

    :cond_81
    const-wide v2, 0x200000000L

    .line 373
    invoke-static {v13, v14, v2, v3}, Lf3/p;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_82

    .line 374
    new-instance v2, Lw2/e;

    invoke-static {v11, v12}, Lf3/o;->c(J)F

    move-result v3

    invoke-direct {v2, v3}, Lw2/e;-><init>(F)V

    goto :goto_50

    :cond_82
    move-object/from16 v2, p1

    :goto_50
    const/16 v11, 0x21

    if-eqz v2, :cond_83

    .line 375
    invoke-interface {v1, v2, v9, v6, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_83
    :goto_51
    add-int/lit8 v3, v8, 0x1

    move/from16 v2, p2

    goto :goto_4f

    .line 376
    :cond_84
    iget-object v2, v5, Lt2/l0;->b:Lt2/s;

    .line 377
    iget-object v2, v2, Lt2/s;->d:Le3/q;

    if-eqz v2, :cond_86

    .line 378
    iget-wide v2, v2, Le3/q;->a:J

    .line 379
    invoke-static {v2, v3}, Lf3/o;->b(J)J

    move-result-wide v5

    const-wide v14, 0x100000000L

    .line 380
    invoke-static {v5, v6, v14, v15}, Lf3/p;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_85

    invoke-interface {v7, v2, v3}, Lf3/c;->i0(J)F

    goto :goto_52

    :cond_85
    const-wide v11, 0x200000000L

    .line 381
    invoke-static {v5, v6, v11, v12}, Lf3/p;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_86

    invoke-static {v2, v3}, Lf3/o;->c(J)F

    .line 382
    :cond_86
    :goto_52
    invoke-interface/range {p5 .. p5}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_53
    if-ge v3, v2, :cond_87

    .line 383
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 384
    check-cast v5, Lt2/e;

    .line 385
    iget-object v5, v5, Lt2/e;->a:Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_53

    .line 386
    :cond_87
    move-object/from16 v7, v24

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v2

    if-lez v2, :cond_8a

    move-object/from16 v9, v24

    const/4 v15, 0x0

    .line 387
    invoke-interface {v9, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 388
    check-cast v2, Lt2/e;

    .line 389
    iget-object v3, v2, Lt2/e;->a:Ljava/lang/Object;

    if-nez v3, :cond_89

    .line 390
    iget v3, v2, Lt2/e;->b:I

    .line 391
    iget v2, v2, Lt2/e;->c:I

    .line 392
    invoke-interface {v1, v3, v2, v10}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    .line 393
    array-length v3, v2

    const/4 v11, 0x0

    :goto_54
    if-ge v11, v3, :cond_88

    aget-object v4, v2, v11

    check-cast v4, Lc4/x;

    .line 394
    invoke-interface {v1, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_54

    .line 395
    :cond_88
    new-instance v1, Lw2/i;

    .line 396
    throw p1

    .line 397
    :cond_89
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    .line 398
    :cond_8a
    :goto_55
    iput-object v1, v0, Lb3/c;->h:Ljava/lang/CharSequence;

    .line 399
    new-instance v2, Lu2/f;

    iget-object v3, v0, Lb3/c;->g:Lb3/d;

    iget v4, v0, Lb3/c;->l:I

    invoke-direct {v2, v1, v3, v4}, Lu2/f;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v2, v0, Lb3/c;->i:Lu2/f;

    return-void

    .line 400
    :cond_8b
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Array is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 401
    :cond_8c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 402
    const-string v2, "Invalid TextDirection."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final c()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lb3/c;->j:Lc7/e1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lc7/e1;->K()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Lb3/c;->k:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lb3/c;->b:Lt2/l0;

    .line 19
    .line 20
    iget-object v0, v0, Lt2/l0;->c:Lt2/w;

    .line 21
    .line 22
    sget-object v0, Lb3/h;->a:Lb0/c1;

    .line 23
    .line 24
    sget-object v0, Lb3/h;->a:Lb0/c1;

    .line 25
    .line 26
    iget-object v2, v0, Lb0/c1;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lx0/n2;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {}, Lc4/k;->d()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Lb0/c1;->n()Lx0/n2;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, v0, Lb0/c1;->b:Ljava/lang/Object;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget-object v2, Lb3/i;->a:Lb3/j;

    .line 47
    .line 48
    :goto_1
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    return v1

    .line 62
    :cond_4
    :goto_2
    const/4 v0, 0x1

    .line 63
    return v0
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public final i()F
    .locals 10

    .line 1
    iget-object v0, p0, Lb3/c;->i:Lu2/f;

    .line 2
    .line 3
    iget v1, v0, Lu2/f;->e:F

    .line 4
    .line 5
    iget-object v2, v0, Lu2/f;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget v0, v0, Lu2/f;->e:F

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Lu2/c;

    .line 25
    .line 26
    iget-object v4, v0, Lu2/f;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-direct {v3, v4, v5}, Lu2/c;-><init>(Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    new-instance v4, Landroidx/media3/exoplayer/offline/i;

    .line 41
    .line 42
    const/16 v5, 0x13

    .line 43
    .line 44
    invoke-direct {v4, v5}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/16 v5, 0xa

    .line 48
    .line 49
    invoke-direct {v3, v5, v4}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/4 v6, 0x0

    .line 57
    :goto_0
    const/4 v7, -0x1

    .line 58
    if-eq v4, v7, :cond_3

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-ge v7, v5, :cond_1

    .line 65
    .line 66
    new-instance v7, Lub/k;

    .line 67
    .line 68
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-direct {v7, v6, v8}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    check-cast v7, Lub/k;

    .line 88
    .line 89
    if-eqz v7, :cond_2

    .line 90
    .line 91
    iget-object v8, v7, Lub/k;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v8, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    iget-object v7, v7, Lub/k;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    sub-int/2addr v8, v7

    .line 108
    sub-int v7, v4, v6

    .line 109
    .line 110
    if-ge v8, v7, :cond_2

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    new-instance v7, Lub/k;

    .line 116
    .line 117
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-direct {v7, v6, v8}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    move v9, v6

    .line 136
    move v6, v4

    .line 137
    move v4, v9

    .line 138
    goto :goto_0

    .line 139
    :cond_3
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_4

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    goto :goto_3

    .line 147
    :cond_4
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_6

    .line 156
    .line 157
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    check-cast v3, Lub/k;

    .line 162
    .line 163
    iget-object v4, v3, Lub/k;->a:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Ljava/lang/Number;

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    iget-object v3, v3, Lub/k;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v3, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-virtual {v0}, Lu2/f;->b()Ljava/lang/CharSequence;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-static {v5, v4, v3, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_5

    .line 192
    .line 193
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Lub/k;

    .line 198
    .line 199
    iget-object v5, v4, Lub/k;->a:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v5, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    iget-object v4, v4, Lub/k;->b:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v4, Ljava/lang/Number;

    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-virtual {v0}, Lu2/f;->b()Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {v6, v5, v4, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    goto :goto_2

    .line 228
    :cond_5
    move v1, v3

    .line 229
    :goto_3
    iput v1, v0, Lu2/f;->e:F

    .line 230
    .line 231
    return v1

    .line 232
    :cond_6
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 233
    .line 234
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 235
    .line 236
    .line 237
    throw v0
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final j()F
    .locals 1

    .line 1
    iget-object v0, p0, Lb3/c;->i:Lu2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/f;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
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
.end method
