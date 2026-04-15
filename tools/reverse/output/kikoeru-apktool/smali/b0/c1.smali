.class public Lb0/c1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lj5/d1;
.implements Ld7/k;
.implements Lyc/m;
.implements Lf5/c;
.implements Lgg/e;
.implements Lgb/o;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 9

    iput p1, p0, Lb0/c1;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    sget-object v1, Lr/w1;->a:Lr/v1;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 11
    new-instance v0, Lr/k;

    .line 12
    new-instance v3, Lr/l;

    invoke-direct {v3, p1}, Lr/l;-><init>(F)V

    const-wide/high16 v4, -0x8000000000000000L

    const-wide/high16 v6, -0x8000000000000000L

    const/4 v8, 0x0

    .line 13
    invoke-direct/range {v0 .. v8}, Lr/k;-><init>(Lr/v1;Ljava/lang/Object;Lr/p;JJZ)V

    .line 14
    iput-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Lb0/w1;

    invoke-direct {p1, p0}, Lb0/w1;-><init>(Lb0/c1;)V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 17
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance p1, Li2/z1;

    sget-object v0, Li2/f;->b:Li2/m1;

    .line 19
    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 20
    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 21
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance p1, Lb7/c3;

    const/16 v0, 0xc

    invoke-direct {p1, v0}, Lb7/c3;-><init>(I)V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 23
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 25
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 27
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 29
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance p1, Lc5/d;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v2, 0x5

    .line 31
    invoke-direct {p1, v2, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 32
    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 33
    :sswitch_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance p1, Lo/s;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lo/s;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    .line 35
    :sswitch_8
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_8
        0x6 -> :sswitch_7
        0x8 -> :sswitch_6
        0xa -> :sswitch_5
        0xb -> :sswitch_4
        0xf -> :sswitch_3
        0x12 -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb0/c1;->a:I

    iput-object p2, p0, Lb0/c1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Lb0/c1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lb0/c1;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/cnl/kikoeru/MainApplication;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lb0/c1;->a:I

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/mmkv/MMKV;->p(Landroid/content/Context;)V

    invoke-static {}, Lcom/tencent/mmkv/MMKV;->h()Lcom/tencent/mmkv/MMKV;

    move-result-object p1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg1/c;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lb0/c1;->a:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxf/c;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lb0/c1;->a:I

    const-string v0, "json"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([J)V
    .locals 5

    const/16 v0, 0x1a

    iput v0, p0, Lb0/c1;->a:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 41
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    .line 42
    new-instance v0, Lo/b0;

    array-length v1, p1

    invoke-direct {v0, v1}, Lo/b0;-><init>(I)V

    .line 43
    iget v1, v0, Lo/b0;->b:I

    if-ltz v1, :cond_3

    .line 44
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    array-length v2, p1

    add-int/2addr v2, v1

    .line 46
    iget-object v3, v0, Lo/b0;->a:[J

    .line 47
    array-length v4, v3

    if-ge v4, v2, :cond_1

    .line 48
    array-length v4, v3

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 49
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    const-string v3, "copyOf(...)"

    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lo/b0;->a:[J

    .line 50
    :cond_1
    iget-object v2, v0, Lo/b0;->a:[J

    .line 51
    iget v3, v0, Lo/b0;->b:I

    if-eq v1, v3, :cond_2

    .line 52
    array-length v4, p1

    add-int/2addr v4, v1

    .line 53
    invoke-static {v2, v2, v4, v1, v3}, Lvb/l;->k0([J[JIII)V

    :cond_2
    const/4 v3, 0x0

    .line 54
    array-length v4, p1

    invoke-static {p1, v2, v1, v3, v4}, Lvb/l;->k0([J[JIII)V

    .line 55
    iget v1, v0, Lo/b0;->b:I

    array-length p1, p1

    add-int/2addr v1, p1

    iput v1, v0, Lo/b0;->b:I

    goto :goto_0

    .line 56
    :cond_3
    const-string p1, ""

    invoke-static {p1}, Lp/a;->d(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 57
    :cond_4
    new-instance v0, Lo/b0;

    const/16 p1, 0x10

    .line 58
    invoke-direct {v0, p1}, Lo/b0;-><init>(I)V

    .line 59
    :goto_0
    iput-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(Landroidx/media3/exoplayer/offline/u;Lj2/v;)Lb7/n;
    .locals 38

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Lb0/c1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lo/s;

    .line 8
    .line 9
    new-instance v3, Lo/s;

    .line 10
    .line 11
    iget-object v4, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-direct {v3, v5}, Lo/s;-><init>(I)V

    .line 20
    .line 21
    .line 22
    move-object v5, v4

    .line 23
    check-cast v5, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v7, 0x0

    .line 30
    :goto_0
    if-ge v7, v5, :cond_2

    .line 31
    .line 32
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    check-cast v8, Lc2/v;

    .line 37
    .line 38
    iget-wide v9, v8, Lc2/v;->a:J

    .line 39
    .line 40
    invoke-virtual {v2, v9, v10}, Lo/s;->d(J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    check-cast v11, Lc2/u;

    .line 45
    .line 46
    if-nez v11, :cond_0

    .line 47
    .line 48
    iget-wide v11, v8, Lc2/v;->b:J

    .line 49
    .line 50
    iget-wide v13, v8, Lc2/v;->d:J

    .line 51
    .line 52
    move/from16 v16, v7

    .line 53
    .line 54
    move-wide/from16 v26, v11

    .line 55
    .line 56
    move-wide/from16 v28, v13

    .line 57
    .line 58
    const/16 v30, 0x0

    .line 59
    .line 60
    move-object/from16 v11, p2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    iget-wide v12, v11, Lc2/u;->a:J

    .line 64
    .line 65
    iget-boolean v14, v11, Lc2/u;->c:Z

    .line 66
    .line 67
    move/from16 v16, v7

    .line 68
    .line 69
    iget-wide v6, v11, Lc2/u;->b:J

    .line 70
    .line 71
    move-object/from16 v11, p2

    .line 72
    .line 73
    invoke-virtual {v11, v6, v7}, Lj2/v;->L(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    move-wide/from16 v28, v6

    .line 78
    .line 79
    move-wide/from16 v26, v12

    .line 80
    .line 81
    move/from16 v30, v14

    .line 82
    .line 83
    :goto_1
    iget-wide v6, v8, Lc2/v;->a:J

    .line 84
    .line 85
    new-instance v17, Lc2/t;

    .line 86
    .line 87
    iget-wide v12, v8, Lc2/v;->b:J

    .line 88
    .line 89
    move-object v14, v4

    .line 90
    move/from16 v37, v5

    .line 91
    .line 92
    iget-wide v4, v8, Lc2/v;->d:J

    .line 93
    .line 94
    iget-boolean v15, v8, Lc2/v;->e:Z

    .line 95
    .line 96
    iget v1, v8, Lc2/v;->f:F

    .line 97
    .line 98
    move/from16 v25, v1

    .line 99
    .line 100
    iget v1, v8, Lc2/v;->g:I

    .line 101
    .line 102
    move/from16 v31, v1

    .line 103
    .line 104
    iget-object v1, v8, Lc2/v;->i:Ljava/util/ArrayList;

    .line 105
    .line 106
    move-wide/from16 v22, v4

    .line 107
    .line 108
    iget-wide v4, v8, Lc2/v;->j:J

    .line 109
    .line 110
    move-wide/from16 v33, v4

    .line 111
    .line 112
    iget-wide v4, v8, Lc2/v;->k:J

    .line 113
    .line 114
    move-object/from16 v32, v1

    .line 115
    .line 116
    move-wide/from16 v35, v4

    .line 117
    .line 118
    move-wide/from16 v18, v6

    .line 119
    .line 120
    move-wide/from16 v20, v12

    .line 121
    .line 122
    move/from16 v24, v15

    .line 123
    .line 124
    invoke-direct/range {v17 .. v36}, Lc2/t;-><init>(JJJZFJJZILjava/util/ArrayList;JJ)V

    .line 125
    .line 126
    .line 127
    move-object/from16 v1, v17

    .line 128
    .line 129
    move-wide/from16 v4, v18

    .line 130
    .line 131
    invoke-virtual {v3, v4, v5, v1}, Lo/s;->g(JLjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-boolean v1, v8, Lc2/v;->e:Z

    .line 135
    .line 136
    if-eqz v1, :cond_1

    .line 137
    .line 138
    new-instance v17, Lc2/u;

    .line 139
    .line 140
    iget-wide v4, v8, Lc2/v;->b:J

    .line 141
    .line 142
    iget-wide v6, v8, Lc2/v;->c:J

    .line 143
    .line 144
    move/from16 v22, v1

    .line 145
    .line 146
    move-wide/from16 v18, v4

    .line 147
    .line 148
    move-wide/from16 v20, v6

    .line 149
    .line 150
    invoke-direct/range {v17 .. v22}, Lc2/u;-><init>(JJZ)V

    .line 151
    .line 152
    .line 153
    move-object/from16 v1, v17

    .line 154
    .line 155
    invoke-virtual {v2, v9, v10, v1}, Lo/s;->g(JLjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_1
    invoke-virtual {v2, v9, v10}, Lo/s;->h(J)V

    .line 160
    .line 161
    .line 162
    :goto_2
    add-int/lit8 v7, v16, 0x1

    .line 163
    .line 164
    move-object/from16 v1, p0

    .line 165
    .line 166
    move-object v4, v14

    .line 167
    move/from16 v5, v37

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_2
    new-instance v1, Lb7/n;

    .line 172
    .line 173
    invoke-direct {v1, v3, v0}, Lb7/n;-><init>(Lo/s;Landroidx/media3/exoplayer/offline/u;)V

    .line 174
    .line 175
    .line 176
    return-object v1
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public B(Lbd/h;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lde/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, p2, p1, v1}, Lde/i;->w(Ljava/lang/StringBuilder;Lzc/a;Lzc/d;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p1, Lbd/h;->f:Lld/o;

    .line 15
    .line 16
    const-string v2, "getVisibility(...)"

    .line 17
    .line 18
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, p2}, Lde/i;->e0(Lld/o;Ljava/lang/StringBuilder;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lde/i;->I(Lyc/w;Ljava/lang/StringBuilder;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "typealias"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " "

    .line 37
    .line 38
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, p1, p2, v1}, Lde/i;->N(Lyc/k;Ljava/lang/StringBuilder;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lbd/h;->L()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v0, p2, v1, v2}, Lde/i;->a0(Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1, p2}, Lde/i;->y(Lyc/i;Ljava/lang/StringBuilder;)V

    .line 54
    .line 55
    .line 56
    const-string v1, " = "

    .line 57
    .line 58
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    check-cast p1, Lqe/s;

    .line 62
    .line 63
    invoke-virtual {p1}, Lqe/s;->F1()Lse/a0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v0, p1}, Lde/i;->V(Lse/w;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 75
    .line 76
    return-object p1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public C(Li2/j0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Li2/j0;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.remove called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Li2/z1;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
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
.end method

.method public D(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "android.support.v4.media.session.action.FOLLOW"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "android.support.v4.media.session.action.UNFOLLOW"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-eqz p2, :cond_2

    .line 22
    .line 23
    const-string v0, "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    :goto_0
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Landroid/media/session/MediaController$TransportControls;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Landroid/media/session/MediaController$TransportControls;->sendCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string v0, "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action "

    .line 42
    .line 43
    const-string v1, "."

    .line 44
    .line 45
    invoke-static {v0, p1, v1}, Lq/t0;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p2
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public E(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/service/media/MediaBrowserService$Result;

    .line 4
    .line 5
    instance-of v1, p1, Ljava/util/List;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Ljava/util/List;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroid/os/Parcel;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 38
    .line 39
    .line 40
    sget-object v4, Landroid/media/browse/MediaBrowser$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 41
    .line 42
    invoke-interface {v4, v3}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Landroid/media/browse/MediaBrowser$MediaItem;

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0, v1}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    instance-of v1, p1, Landroid/os/Parcel;

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    check-cast p1, Landroid/os/Parcel;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Landroid/media/browse/MediaBrowser$MediaItem;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 69
    .line 70
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    const/4 p1, 0x0

    .line 82
    invoke-virtual {v0, p1}, Landroid/service/media/MediaBrowserService$Result;->sendResult(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public F(I)Lb0/c1;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/16 p1, 0xc

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/media/AudioAttributes$Builder;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 12
    .line 13
    .line 14
    return-object p0
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
.end method

.method public bridge G(I)Lb0/c1;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb0/c1;->F(I)Lb0/c1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
    .line 6
    .line 7
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public H(Lm4/q;)I
    .locals 6

    .line 1
    iget-object v0, p1, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    invoke-static {v0}, Lm4/o0;->m(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_0
    iget-object p1, p1, Lm4/q;->n:Ljava/lang/String;

    .line 15
    .line 16
    sget v0, Lp4/c0;->a:I

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x4

    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v5, -0x1

    .line 28
    sparse-switch v2, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :sswitch_0
    const-string v2, "image/png"

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v5, 0x6

    .line 42
    goto :goto_0

    .line 43
    :sswitch_1
    const-string v2, "image/bmp"

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v5, 0x5

    .line 53
    goto :goto_0

    .line 54
    :sswitch_2
    const-string v2, "image/webp"

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 v5, 0x4

    .line 64
    goto :goto_0

    .line 65
    :sswitch_3
    const-string v2, "image/jpeg"

    .line 66
    .line 67
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const/4 v5, 0x3

    .line 75
    goto :goto_0

    .line 76
    :sswitch_4
    const-string v2, "image/heif"

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    const/4 v5, 0x2

    .line 86
    goto :goto_0

    .line 87
    :sswitch_5
    const-string v2, "image/heic"

    .line 88
    .line 89
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_6

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    const/4 v5, 0x1

    .line 97
    goto :goto_0

    .line 98
    :sswitch_6
    const-string v2, "image/avif"

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_7

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_7
    const/4 v5, 0x0

    .line 108
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :pswitch_0
    const/16 p1, 0x1a

    .line 113
    .line 114
    if-lt v0, p1, :cond_8

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_1
    const/16 p1, 0x22

    .line 118
    .line 119
    if-lt v0, p1, :cond_8

    .line 120
    .line 121
    :goto_1
    :pswitch_2
    invoke-static {v3, v1, v1, v1}, Lq/t0;->g(IIII)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    return p1

    .line 126
    :cond_8
    :goto_2
    invoke-static {v4, v1, v1, v1}, Lq/t0;->g(IIII)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    return p1

    .line 131
    :cond_9
    :goto_3
    invoke-static {v1, v1, v1, v1}, Lq/t0;->g(IIII)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    return p1

    .line 136
    nop

    .line 137
    :sswitch_data_0
    .sparse-switch
        -0x58abd7ba -> :sswitch_6
        -0x58a8e8f5 -> :sswitch_5
        -0x58a8e8f2 -> :sswitch_4
        -0x58a7d764 -> :sswitch_3
        -0x58a21830 -> :sswitch_2
        -0x3468a12f -> :sswitch_1
        -0x34686c8b -> :sswitch_0
    .end sparse-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
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
.end method

.method public I(FLf3/c;Lhf/y;)V
    .locals 7

    .line 1
    sget v0, Lb0/d1;->a:F

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lf3/c;->Q(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    cmpg-float p2, p1, p2

    .line 8
    .line 9
    if-gtz p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Lh1/t;->d()Lh1/g;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2}, Lh1/g;->e()Lic/k;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v1, v0

    .line 25
    :goto_0
    invoke-static {p2}, Lh1/t;->g(Lh1/g;)Lh1/g;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :try_start_0
    iget-object v3, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lr/k;

    .line 32
    .line 33
    iget-object v3, v3, Lr/k;->b:Lx0/e1;

    .line 34
    .line 35
    invoke-virtual {v3}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget-object v4, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Lr/k;

    .line 48
    .line 49
    iget-boolean v5, v4, Lr/k;->f:Z

    .line 50
    .line 51
    const/4 v6, 0x3

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    sub-float/2addr v3, p1

    .line 55
    const/4 p1, 0x0

    .line 56
    const/16 v5, 0x1e

    .line 57
    .line 58
    invoke-static {v4, v3, p1, v5}, Lr/d;->l(Lr/k;FFI)Lr/k;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 63
    .line 64
    new-instance p1, Lb0/b1;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {p1, p0, v0, v3}, Lb0/b1;-><init>(Lb0/c1;Lyb/c;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p3, v0, v0, p1, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    new-instance v3, Lr/k;

    .line 77
    .line 78
    sget-object v4, Lr/w1;->a:Lr/v1;

    .line 79
    .line 80
    neg-float p1, p1

    .line 81
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const/16 v5, 0x3c

    .line 86
    .line 87
    invoke-direct {v3, v4, p1, v0, v5}, Lr/k;-><init>(Lr/v1;Ljava/lang/Object;Lr/p;I)V

    .line 88
    .line 89
    .line 90
    iput-object v3, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 91
    .line 92
    new-instance p1, Lb0/b1;

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    invoke-direct {p1, p0, v0, v3}, Lb0/b1;-><init>(Lb0/c1;Lyb/c;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {p3, v0, v0, p1, v6}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    :goto_1
    invoke-static {p2, v2, v1}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :goto_2
    invoke-static {p2, v2, v1}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 106
    .line 107
    .line 108
    throw p1
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public J(Lbd/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-boolean v0, p1, Lbd/l;->D:Z

    .line 2
    .line 3
    check-cast p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    iget-object v1, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lde/i;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v1, p2, p1, v2}, Lde/i;->w(Ljava/lang/StringBuilder;Lzc/a;Lzc/d;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v1, Lde/i;->a:Lde/m;

    .line 17
    .line 18
    iget-object v3, v2, Lde/m;->o:Lde/l;

    .line 19
    .line 20
    sget-object v4, Lde/m;->Y:[Lpc/u;

    .line 21
    .line 22
    const/16 v5, 0xd

    .line 23
    .line 24
    aget-object v5, v4, v5

    .line 25
    .line 26
    invoke-virtual {v3, v2, v5}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Lbd/l;->V()Lyc/e;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Lyc/e;->s()Lyc/x;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    sget-object v7, Lyc/x;->c:Lyc/x;

    .line 49
    .line 50
    if-eq v3, v7, :cond_1

    .line 51
    .line 52
    :cond_0
    invoke-virtual {p1}, Lbd/z;->f()Lld/o;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v7, "getVisibility(...)"

    .line 57
    .line 58
    invoke-static {v3, v7}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v3, p2}, Lde/i;->e0(Lld/o;Ljava/lang/StringBuilder;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/4 v3, 0x0

    .line 70
    :goto_0
    invoke-virtual {v1, p1, p2}, Lde/i;->H(Lyc/c;Ljava/lang/StringBuilder;)V

    .line 71
    .line 72
    .line 73
    iget-object v7, v2, Lde/m;->P:Lde/l;

    .line 74
    .line 75
    const/16 v8, 0x28

    .line 76
    .line 77
    aget-object v8, v4, v8

    .line 78
    .line 79
    invoke-virtual {v7, v2, v8}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-nez v7, :cond_3

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    const/4 v3, 0x0

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 99
    :goto_2
    if-eqz v3, :cond_4

    .line 100
    .line 101
    const-string v7, "constructor"

    .line 102
    .line 103
    invoke-virtual {v1, v7}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-virtual {p1}, Lbd/l;->P1()Lyc/e;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const-string v8, "getContainingDeclaration(...)"

    .line 115
    .line 116
    invoke-static {v7, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v8, v2, Lde/m;->A:Lde/l;

    .line 120
    .line 121
    const/16 v9, 0x19

    .line 122
    .line 123
    aget-object v10, v4, v9

    .line 124
    .line 125
    invoke-virtual {v8, v2, v10}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    check-cast v8, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_6

    .line 136
    .line 137
    if-eqz v3, :cond_5

    .line 138
    .line 139
    const-string v3, " "

    .line 140
    .line 141
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    :cond_5
    invoke-virtual {v1, v7, p2, v6}, Lde/i;->N(Lyc/k;Ljava/lang/StringBuilder;Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lbd/z;->getTypeParameters()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v1, p2, v3, v5}, Lde/i;->a0(Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    .line 152
    .line 153
    .line 154
    :cond_6
    invoke-virtual {p1}, Lbd/z;->o0()Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    const-string v5, "getValueParameters(...)"

    .line 159
    .line 160
    invoke-static {v3, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    check-cast v3, Ljava/util/Collection;

    .line 164
    .line 165
    invoke-interface {p1}, Lyc/b;->Z()Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    invoke-virtual {v1, v3, v6, p2}, Lde/i;->d0(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, v2, Lde/m;->q:Lde/l;

    .line 173
    .line 174
    const/16 v6, 0xf

    .line 175
    .line 176
    aget-object v4, v4, v6

    .line 177
    .line 178
    invoke-virtual {v3, v2, v4}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_9

    .line 189
    .line 190
    if-nez v0, :cond_9

    .line 191
    .line 192
    invoke-interface {v7}, Lyc/e;->j0()Lbd/l;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-eqz v0, :cond_9

    .line 197
    .line 198
    check-cast v0, Lbd/z;

    .line 199
    .line 200
    invoke-virtual {v0}, Lbd/z;->o0()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    check-cast v0, Ljava/lang/Iterable;

    .line 208
    .line 209
    new-instance v3, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_8

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    move-object v5, v4

    .line 229
    check-cast v5, Lbd/y0;

    .line 230
    .line 231
    invoke-virtual {v5}, Lbd/y0;->E1()Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-nez v6, :cond_7

    .line 236
    .line 237
    iget-object v5, v5, Lbd/y0;->j:Lse/w;

    .line 238
    .line 239
    if-nez v5, :cond_7

    .line 240
    .line 241
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_9

    .line 250
    .line 251
    const-string v0, " : "

    .line 252
    .line 253
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string v0, "this"

    .line 257
    .line 258
    invoke-virtual {v1, v0}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    sget-object v7, Lde/d;->n:Lde/d;

    .line 266
    .line 267
    const/16 v8, 0x18

    .line 268
    .line 269
    const-string v4, ", "

    .line 270
    .line 271
    const-string v5, "("

    .line 272
    .line 273
    const-string v6, ")"

    .line 274
    .line 275
    invoke-static/range {v3 .. v8}, Lvb/m;->f0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    :cond_9
    iget-object v0, v2, Lde/m;->A:Lde/l;

    .line 283
    .line 284
    sget-object v3, Lde/m;->Y:[Lpc/u;

    .line 285
    .line 286
    aget-object v3, v3, v9

    .line 287
    .line 288
    invoke-virtual {v0, v2, v3}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_a

    .line 299
    .line 300
    invoke-virtual {p1}, Lbd/z;->getTypeParameters()Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {v1, p2, p1}, Lde/i;->f0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    :cond_a
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 308
    .line 309
    return-object p1
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public K(Lbd/e0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v1, p2

    .line 2
    check-cast v1, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    iget-object p2, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p2, Lde/i;

    .line 7
    .line 8
    iget-object v0, p2, Lde/i;->a:Lde/m;

    .line 9
    .line 10
    invoke-interface {p1}, Lyc/e;->j()Lyc/f;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, Lyc/f;->d:Lyc/f;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x0

    .line 23
    :goto_0
    invoke-virtual {p2}, Lde/i;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v6, 0x0

    .line 28
    const-string v7, "companion object"

    .line 29
    .line 30
    const-string v8, "getVisibility(...)"

    .line 31
    .line 32
    if-nez v3, :cond_12

    .line 33
    .line 34
    invoke-interface {p1}, Lyc/e;->Q0()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v9, "getContextReceivers(...)"

    .line 39
    .line 40
    invoke-static {v3, v9}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v1, v3}, Lde/i;->A(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v1, p1, v6}, Lde/i;->w(Ljava/lang/StringBuilder;Lzc/a;Lzc/d;)V

    .line 47
    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    invoke-interface {p1}, Lyc/e;->f()Lld/o;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v3, v1}, Lde/i;->e0(Lld/o;Ljava/lang/StringBuilder;)Z

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-interface {p1}, Lyc/e;->j()Lyc/f;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget-object v9, Lyc/f;->b:Lyc/f;

    .line 66
    .line 67
    if-ne v3, v9, :cond_2

    .line 68
    .line 69
    invoke-interface {p1}, Lyc/e;->s()Lyc/x;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    sget-object v9, Lyc/x;->e:Lyc/x;

    .line 74
    .line 75
    if-eq v3, v9, :cond_4

    .line 76
    .line 77
    :cond_2
    invoke-interface {p1}, Lyc/e;->j()Lyc/f;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Lyc/f;->a()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    invoke-interface {p1}, Lyc/e;->s()Lyc/x;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    sget-object v9, Lyc/x;->b:Lyc/x;

    .line 92
    .line 93
    if-eq v3, v9, :cond_4

    .line 94
    .line 95
    :cond_3
    invoke-interface {p1}, Lyc/e;->s()Lyc/x;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const-string v9, "getModality(...)"

    .line 100
    .line 101
    invoke-static {v3, v9}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Lde/i;->t(Lyc/w;)Lyc/x;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    invoke-virtual {p2, v3, v1, v9}, Lde/i;->J(Lyc/x;Ljava/lang/StringBuilder;Lyc/x;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-virtual {p2, p1, v1}, Lde/i;->I(Lyc/w;Ljava/lang/StringBuilder;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Lde/i;->o()Ljava/util/Set;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    sget-object v9, Lde/j;->h:Lde/j;

    .line 119
    .line 120
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    invoke-interface {p1}, Lyc/i;->d0()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    const/4 v3, 0x1

    .line 133
    goto :goto_1

    .line 134
    :cond_5
    const/4 v3, 0x0

    .line 135
    :goto_1
    const-string v9, "inner"

    .line 136
    .line 137
    invoke-virtual {p2, v1, v3, v9}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Lde/i;->o()Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    sget-object v9, Lde/j;->j:Lde/j;

    .line 145
    .line 146
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_6

    .line 151
    .line 152
    invoke-interface {p1}, Lyc/e;->S0()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_6

    .line 157
    .line 158
    const/4 v3, 0x1

    .line 159
    goto :goto_2

    .line 160
    :cond_6
    const/4 v3, 0x0

    .line 161
    :goto_2
    const-string v9, "data"

    .line 162
    .line 163
    invoke-virtual {p2, v1, v3, v9}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2}, Lde/i;->o()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    sget-object v9, Lde/j;->k:Lde/j;

    .line 171
    .line 172
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_7

    .line 177
    .line 178
    invoke-interface {p1}, Lyc/e;->l()Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_7

    .line 183
    .line 184
    const/4 v3, 0x1

    .line 185
    goto :goto_3

    .line 186
    :cond_7
    const/4 v3, 0x0

    .line 187
    :goto_3
    const-string v9, "inline"

    .line 188
    .line 189
    invoke-virtual {p2, v1, v3, v9}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2}, Lde/i;->o()Ljava/util/Set;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    sget-object v9, Lde/j;->q:Lde/j;

    .line 197
    .line 198
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_8

    .line 203
    .line 204
    invoke-interface {p1}, Lyc/e;->w()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_8

    .line 209
    .line 210
    const/4 v3, 0x1

    .line 211
    goto :goto_4

    .line 212
    :cond_8
    const/4 v3, 0x0

    .line 213
    :goto_4
    const-string v9, "value"

    .line 214
    .line 215
    invoke-virtual {p2, v1, v3, v9}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2}, Lde/i;->o()Ljava/util/Set;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    sget-object v9, Lde/j;->p:Lde/j;

    .line 223
    .line 224
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_9

    .line 229
    .line 230
    invoke-interface {p1}, Lyc/e;->W()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_9

    .line 235
    .line 236
    const/4 v3, 0x1

    .line 237
    goto :goto_5

    .line 238
    :cond_9
    const/4 v3, 0x0

    .line 239
    :goto_5
    const-string v9, "fun"

    .line 240
    .line 241
    invoke-virtual {p2, v1, v3, v9}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    instance-of v3, p1, Lyc/p0;

    .line 245
    .line 246
    if-eqz v3, :cond_a

    .line 247
    .line 248
    const-string v3, "typealias"

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_a
    invoke-interface {p1}, Lyc/e;->R()Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_b

    .line 256
    .line 257
    move-object v3, v7

    .line 258
    goto :goto_6

    .line 259
    :cond_b
    invoke-interface {p1}, Lyc/e;->j()Lyc/f;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-eqz v3, :cond_11

    .line 268
    .line 269
    if-eq v3, v5, :cond_10

    .line 270
    .line 271
    const/4 v9, 0x2

    .line 272
    if-eq v3, v9, :cond_f

    .line 273
    .line 274
    const/4 v9, 0x3

    .line 275
    if-eq v3, v9, :cond_e

    .line 276
    .line 277
    const/4 v9, 0x4

    .line 278
    if-eq v3, v9, :cond_d

    .line 279
    .line 280
    const/4 v9, 0x5

    .line 281
    if-ne v3, v9, :cond_c

    .line 282
    .line 283
    const-string v3, "object"

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_c
    new-instance p1, Lce/j0;

    .line 287
    .line 288
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 289
    .line 290
    .line 291
    throw p1

    .line 292
    :cond_d
    const-string v3, "annotation class"

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_e
    const-string v3, "enum entry"

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_f
    const-string v3, "enum class"

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_10
    const-string v3, "interface"

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_11
    const-string v3, "class"

    .line 305
    .line 306
    :goto_6
    invoke-virtual {p2, v3}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    :cond_12
    invoke-static {p1}, Lee/e;->l(Lyc/k;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-nez v3, :cond_14

    .line 318
    .line 319
    invoke-virtual {p2}, Lde/i;->p()Z

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-nez v3, :cond_13

    .line 324
    .line 325
    invoke-static {v1}, Lde/i;->U(Ljava/lang/StringBuilder;)V

    .line 326
    .line 327
    .line 328
    :cond_13
    invoke-virtual {p2, p1, v1, v5}, Lde/i;->N(Lyc/k;Ljava/lang/StringBuilder;Z)V

    .line 329
    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_14
    iget-object v3, v0, Lde/m;->G:Lde/l;

    .line 333
    .line 334
    sget-object v9, Lde/m;->Y:[Lpc/u;

    .line 335
    .line 336
    const/16 v10, 0x1f

    .line 337
    .line 338
    aget-object v9, v9, v10

    .line 339
    .line 340
    invoke-virtual {v3, v0, v9}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Ljava/lang/Boolean;

    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    const-string v9, "getName(...)"

    .line 351
    .line 352
    if-eqz v3, :cond_16

    .line 353
    .line 354
    invoke-virtual {p2}, Lde/i;->p()Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v3, :cond_15

    .line 359
    .line 360
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    :cond_15
    invoke-static {v1}, Lde/i;->U(Ljava/lang/StringBuilder;)V

    .line 364
    .line 365
    .line 366
    invoke-interface {p1}, Lyc/k;->y()Lyc/k;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    if-eqz v3, :cond_16

    .line 371
    .line 372
    const-string v7, "of "

    .line 373
    .line 374
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-interface {v3}, Lyc/k;->getName()Lbe/e;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    invoke-static {v3, v9}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2, v3, v4}, Lde/i;->M(Lbe/e;Z)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    :cond_16
    invoke-virtual {p2}, Lde/i;->s()Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-nez v3, :cond_17

    .line 396
    .line 397
    invoke-interface {p1}, Lyc/k;->getName()Lbe/e;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    sget-object v7, Lbe/g;->b:Lbe/e;

    .line 402
    .line 403
    invoke-static {v3, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    if-nez v3, :cond_19

    .line 408
    .line 409
    :cond_17
    invoke-virtual {p2}, Lde/i;->p()Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-nez v3, :cond_18

    .line 414
    .line 415
    invoke-static {v1}, Lde/i;->U(Ljava/lang/StringBuilder;)V

    .line 416
    .line 417
    .line 418
    :cond_18
    invoke-interface {p1}, Lyc/k;->getName()Lbe/e;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-static {v3, v9}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p2, v3, v5}, Lde/i;->M(Lbe/e;Z)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    :cond_19
    :goto_7
    if-eqz v2, :cond_1a

    .line 433
    .line 434
    goto/16 :goto_9

    .line 435
    .line 436
    :cond_1a
    invoke-interface {p1}, Lyc/e;->L()Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    const-string v2, "getDeclaredTypeParameters(...)"

    .line 441
    .line 442
    invoke-static {v7, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {p2, v1, v7, v4}, Lde/i;->a0(Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p2, p1, v1}, Lde/i;->y(Lyc/i;Ljava/lang/StringBuilder;)V

    .line 449
    .line 450
    .line 451
    invoke-interface {p1}, Lyc/e;->j()Lyc/f;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-virtual {v2}, Lyc/f;->a()Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-nez v2, :cond_1b

    .line 460
    .line 461
    iget-object v2, v0, Lde/m;->i:Lde/l;

    .line 462
    .line 463
    sget-object v3, Lde/m;->Y:[Lpc/u;

    .line 464
    .line 465
    const/4 v4, 0x7

    .line 466
    aget-object v3, v3, v4

    .line 467
    .line 468
    invoke-virtual {v2, v0, v3}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    check-cast v2, Ljava/lang/Boolean;

    .line 473
    .line 474
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_1b

    .line 479
    .line 480
    invoke-interface {p1}, Lyc/e;->j0()Lbd/l;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    if-eqz v2, :cond_1b

    .line 485
    .line 486
    const-string v3, " "

    .line 487
    .line 488
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {p2, v1, v2, v6}, Lde/i;->w(Ljava/lang/StringBuilder;Lzc/a;Lzc/d;)V

    .line 492
    .line 493
    .line 494
    move-object v3, v2

    .line 495
    check-cast v3, Lbd/z;

    .line 496
    .line 497
    invoke-virtual {v3}, Lbd/z;->f()Lld/o;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    invoke-static {v4, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {p2, v4, v1}, Lde/i;->e0(Lld/o;Ljava/lang/StringBuilder;)Z

    .line 505
    .line 506
    .line 507
    const-string v4, "constructor"

    .line 508
    .line 509
    invoke-virtual {p2, v4}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3}, Lbd/z;->o0()Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    const-string v4, "getValueParameters(...)"

    .line 521
    .line 522
    invoke-static {v3, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    check-cast v3, Ljava/util/Collection;

    .line 526
    .line 527
    invoke-interface {v2}, Lyc/b;->Z()Z

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    invoke-virtual {p2, v3, v2, v1}, Lde/i;->d0(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    .line 532
    .line 533
    .line 534
    :cond_1b
    iget-object v2, v0, Lde/m;->x:Lde/l;

    .line 535
    .line 536
    sget-object v3, Lde/m;->Y:[Lpc/u;

    .line 537
    .line 538
    const/16 v4, 0x16

    .line 539
    .line 540
    aget-object v3, v3, v4

    .line 541
    .line 542
    invoke-virtual {v2, v0, v3}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, Ljava/lang/Boolean;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_1c

    .line 553
    .line 554
    goto :goto_8

    .line 555
    :cond_1c
    invoke-interface {p1}, Lyc/e;->E()Lse/a0;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-static {v0}, Lvc/i;->E(Lse/w;)Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-eqz v0, :cond_1d

    .line 564
    .line 565
    goto :goto_8

    .line 566
    :cond_1d
    invoke-interface {p1}, Lyc/h;->Q()Lse/k0;

    .line 567
    .line 568
    .line 569
    move-result-object p1

    .line 570
    invoke-interface {p1}, Lse/k0;->i()Ljava/util/Collection;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    const-string v0, "getSupertypes(...)"

    .line 575
    .line 576
    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-nez v0, :cond_1f

    .line 584
    .line 585
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-ne v0, v5, :cond_1e

    .line 590
    .line 591
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v0, Lse/w;

    .line 600
    .line 601
    invoke-static {v0}, Lvc/i;->x(Lse/w;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eqz v0, :cond_1e

    .line 606
    .line 607
    goto :goto_8

    .line 608
    :cond_1e
    invoke-static {v1}, Lde/i;->U(Ljava/lang/StringBuilder;)V

    .line 609
    .line 610
    .line 611
    const-string v0, ": "

    .line 612
    .line 613
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    move-object v0, p1

    .line 617
    check-cast v0, Ljava/lang/Iterable;

    .line 618
    .line 619
    new-instance v5, Lde/g;

    .line 620
    .line 621
    const/4 p1, 0x1

    .line 622
    invoke-direct {v5, p2, p1}, Lde/g;-><init>(Lde/i;I)V

    .line 623
    .line 624
    .line 625
    const/16 v6, 0x3c

    .line 626
    .line 627
    const-string v2, ", "

    .line 628
    .line 629
    const/4 v3, 0x0

    .line 630
    const/4 v4, 0x0

    .line 631
    invoke-static/range {v0 .. v6}, Lvb/m;->e0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)V

    .line 632
    .line 633
    .line 634
    :cond_1f
    :goto_8
    invoke-virtual {p2, v1, v7}, Lde/i;->f0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 635
    .line 636
    .line 637
    :goto_9
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 638
    .line 639
    return-object p1
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public L(Lbd/k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lde/i;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, p1, p2, v1}, Lde/i;->Y(Lyc/q0;Ljava/lang/StringBuilder;Z)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    return-object p1
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

.method public M(Lbd/j0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lde/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lbd/j0;->e:Lbe/c;

    .line 11
    .line 12
    const-string v2, "package-fragment"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, v1, Lbe/c;->a:Lbe/d;

    .line 22
    .line 23
    const-string v2, "fqName"

    .line 24
    .line 25
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lbe/d;->f(Lbe/d;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Llc/b;->O(Ljava/util/List;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lde/i;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-lez v2, :cond_0

    .line 45
    .line 46
    const-string v2, " "

    .line 47
    .line 48
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object v1, v0, Lde/i;->a:Lde/m;

    .line 55
    .line 56
    invoke-virtual {v1}, Lde/m;->l()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const-string v1, " in "

    .line 63
    .line 64
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lbd/j0;->D1()Lyc/y;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-virtual {v0, p1, p2, v1}, Lde/i;->N(Lyc/k;Ljava/lang/StringBuilder;Z)V

    .line 73
    .line 74
    .line 75
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 76
    .line 77
    return-object p1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public N(Lyc/t;Ljava/lang/StringBuilder;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lde/i;

    .line 4
    .line 5
    iget-object v1, v0, Lde/i;->a:Lde/m;

    .line 6
    .line 7
    iget-object v2, v0, Lde/i;->a:Lde/m;

    .line 8
    .line 9
    invoke-virtual {v0}, Lde/i;->p()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const-string v4, "getTypeParameters(...)"

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    if-nez v3, :cond_c

    .line 17
    .line 18
    iget-object v3, v2, Lde/m;->g:Lde/l;

    .line 19
    .line 20
    sget-object v6, Lde/m;->Y:[Lpc/u;

    .line 21
    .line 22
    const/4 v7, 0x5

    .line 23
    aget-object v7, v6, v7

    .line 24
    .line 25
    invoke-virtual {v3, v2, v7}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_b

    .line 36
    .line 37
    invoke-interface {p1}, Lyc/b;->z0()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v7, "getContextReceiverParameters(...)"

    .line 42
    .line 43
    invoke-static {v3, v7}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2, v3}, Lde/i;->A(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v0, p2, p1, v3}, Lde/i;->w(Ljava/lang/StringBuilder;Lzc/a;Lzc/d;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Lyc/w;->f()Lld/o;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v7, "getVisibility(...)"

    .line 58
    .line 59
    invoke-static {v3, v7}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3, p2}, Lde/i;->e0(Lld/o;Ljava/lang/StringBuilder;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1, p2}, Lde/i;->K(Lyc/c;Ljava/lang/StringBuilder;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, v2, Lde/m;->T:Lde/l;

    .line 69
    .line 70
    const/16 v7, 0x2c

    .line 71
    .line 72
    aget-object v8, v6, v7

    .line 73
    .line 74
    invoke-virtual {v3, v2, v8}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    invoke-virtual {v0, p1, p2}, Lde/i;->I(Lyc/w;Ljava/lang/StringBuilder;)V

    .line 87
    .line 88
    .line 89
    :cond_0
    invoke-virtual {v0, p1, p2}, Lde/i;->Q(Lyc/c;Ljava/lang/StringBuilder;)V

    .line 90
    .line 91
    .line 92
    iget-object v3, v2, Lde/m;->T:Lde/l;

    .line 93
    .line 94
    aget-object v6, v6, v7

    .line 95
    .line 96
    invoke-virtual {v3, v2, v6}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    const-string v6, "suspend"

    .line 107
    .line 108
    if-eqz v3, :cond_9

    .line 109
    .line 110
    invoke-interface {p1}, Lyc/t;->i0()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    const/16 v7, 0x27

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    const-string v9, "getOverriddenDescriptors(...)"

    .line 118
    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    invoke-interface {p1}, Lyc/c;->A()Ljava/util/Collection;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-static {v3, v9}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    check-cast v3, Ljava/lang/Iterable;

    .line 129
    .line 130
    move-object v10, v3

    .line 131
    check-cast v10, Ljava/util/Collection;

    .line 132
    .line 133
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-eqz v10, :cond_1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-eqz v10, :cond_3

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    check-cast v10, Lyc/t;

    .line 155
    .line 156
    invoke-interface {v10}, Lyc/t;->i0()Z

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    if-eqz v10, :cond_2

    .line 161
    .line 162
    iget-object v3, v2, Lde/m;->O:Lde/l;

    .line 163
    .line 164
    sget-object v10, Lde/m;->Y:[Lpc/u;

    .line 165
    .line 166
    aget-object v10, v10, v7

    .line 167
    .line 168
    invoke-virtual {v3, v2, v10}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_4

    .line 179
    .line 180
    :cond_3
    :goto_0
    const/4 v3, 0x1

    .line 181
    goto :goto_1

    .line 182
    :cond_4
    const/4 v3, 0x0

    .line 183
    :goto_1
    invoke-interface {p1}, Lyc/t;->R0()Z

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    if-eqz v10, :cond_8

    .line 188
    .line 189
    invoke-interface {p1}, Lyc/c;->A()Ljava/util/Collection;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-static {v10, v9}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    check-cast v10, Ljava/lang/Iterable;

    .line 197
    .line 198
    move-object v9, v10

    .line 199
    check-cast v9, Ljava/util/Collection;

    .line 200
    .line 201
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    if-eqz v9, :cond_5

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_5
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    :cond_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    if-eqz v10, :cond_7

    .line 217
    .line 218
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    check-cast v10, Lyc/t;

    .line 223
    .line 224
    invoke-interface {v10}, Lyc/t;->R0()Z

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    if-eqz v10, :cond_6

    .line 229
    .line 230
    iget-object v9, v2, Lde/m;->O:Lde/l;

    .line 231
    .line 232
    sget-object v10, Lde/m;->Y:[Lpc/u;

    .line 233
    .line 234
    aget-object v7, v10, v7

    .line 235
    .line 236
    invoke-virtual {v9, v2, v7}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    check-cast v2, Ljava/lang/Boolean;

    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_8

    .line 247
    .line 248
    :cond_7
    :goto_2
    const/4 v8, 0x1

    .line 249
    :cond_8
    invoke-interface {p1}, Lyc/t;->h0()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    const-string v7, "tailrec"

    .line 254
    .line 255
    invoke-virtual {v0, p2, v2, v7}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {p1}, Lyc/t;->I()Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-virtual {v0, p2, v2, v6}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-interface {p1}, Lyc/t;->l()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    const-string v6, "inline"

    .line 270
    .line 271
    invoke-virtual {v0, p2, v2, v6}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    const-string v2, "infix"

    .line 275
    .line 276
    invoke-virtual {v0, p2, v8, v2}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const-string v2, "operator"

    .line 280
    .line 281
    invoke-virtual {v0, p2, v3, v2}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_9
    invoke-interface {p1}, Lyc/t;->I()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    invoke-virtual {v0, p2, v2, v6}, Lde/i;->L(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    .line 290
    .line 291
    .line 292
    :goto_3
    invoke-virtual {v0, p1, p2}, Lde/i;->H(Lyc/c;Ljava/lang/StringBuilder;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Lde/i;->s()Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_b

    .line 300
    .line 301
    invoke-interface {p1}, Lyc/t;->G0()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_a

    .line 306
    .line 307
    const-string v2, "/*isHiddenToOvercomeSignatureClash*/ "

    .line 308
    .line 309
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    :cond_a
    invoke-interface {p1}, Lyc/t;->L0()Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-eqz v2, :cond_b

    .line 317
    .line 318
    const-string v2, "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "

    .line 319
    .line 320
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    :cond_b
    const-string v2, "fun"

    .line 324
    .line 325
    invoke-virtual {v0, v2}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const-string v2, " "

    .line 333
    .line 334
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-interface {p1}, Lyc/b;->getTypeParameters()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v2, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, p2, v2, v5}, Lde/i;->a0(Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, p1, p2}, Lde/i;->S(Lyc/c;Ljava/lang/StringBuilder;)V

    .line 348
    .line 349
    .line 350
    :cond_c
    invoke-virtual {v0, p1, p2, v5}, Lde/i;->N(Lyc/k;Ljava/lang/StringBuilder;Z)V

    .line 351
    .line 352
    .line 353
    invoke-interface {p1}, Lyc/b;->o0()Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    const-string v3, "getValueParameters(...)"

    .line 358
    .line 359
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    check-cast v2, Ljava/util/Collection;

    .line 363
    .line 364
    invoke-interface {p1}, Lyc/b;->Z()Z

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    invoke-virtual {v0, v2, v3, p2}, Lde/i;->d0(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, p1, p2}, Lde/i;->T(Lyc/c;Ljava/lang/StringBuilder;)V

    .line 372
    .line 373
    .line 374
    invoke-interface {p1}, Lyc/b;->n()Lse/w;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    iget-object v3, v1, Lde/m;->l:Lde/l;

    .line 379
    .line 380
    sget-object v5, Lde/m;->Y:[Lpc/u;

    .line 381
    .line 382
    const/16 v6, 0xa

    .line 383
    .line 384
    aget-object v6, v5, v6

    .line 385
    .line 386
    invoke-virtual {v3, v1, v6}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    check-cast v3, Ljava/lang/Boolean;

    .line 391
    .line 392
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-nez v3, :cond_f

    .line 397
    .line 398
    iget-object v3, v1, Lde/m;->k:Lde/l;

    .line 399
    .line 400
    const/16 v6, 0x9

    .line 401
    .line 402
    aget-object v5, v5, v6

    .line 403
    .line 404
    invoke-virtual {v3, v1, v5}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, Ljava/lang/Boolean;

    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-nez v1, :cond_d

    .line 415
    .line 416
    if-eqz v2, :cond_d

    .line 417
    .line 418
    sget-object v1, Lvc/i;->e:Lbe/e;

    .line 419
    .line 420
    sget-object v1, Lvc/n;->d:Lbe/d;

    .line 421
    .line 422
    invoke-static {v2, v1}, Lvc/i;->D(Lse/w;Lbe/d;)Z

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    if-nez v1, :cond_f

    .line 427
    .line 428
    :cond_d
    const-string v1, ": "

    .line 429
    .line 430
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    if-nez v2, :cond_e

    .line 434
    .line 435
    const-string v1, "[NULL]"

    .line 436
    .line 437
    goto :goto_4

    .line 438
    :cond_e
    invoke-virtual {v0, v2}, Lde/i;->V(Lse/w;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    :goto_4
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    :cond_f
    invoke-interface {p1}, Lyc/b;->getTypeParameters()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    invoke-static {p1, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, p2, p1}, Lde/i;->f0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 453
    .line 454
    .line 455
    return-void
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public O(Lbd/n0;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lde/i;

    .line 4
    .line 5
    iget-object v1, v0, Lde/i;->a:Lde/m;

    .line 6
    .line 7
    iget-object v2, v1, Lde/m;->H:Lde/l;

    .line 8
    .line 9
    sget-object v3, Lde/m;->Y:[Lpc/u;

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    aget-object v3, v3, v4

    .line 14
    .line 15
    invoke-virtual {v2, v1, v3}, Lde/l;->a(Ljava/lang/Object;Lpc/u;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lde/r;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    if-eq v1, p3, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x2

    .line 31
    if-ne v1, p1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance p1, Lce/j0;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    invoke-virtual {p0, p1, p2}, Lb0/c1;->N(Lyc/t;Ljava/lang/StringBuilder;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {v0, p1, p2}, Lde/i;->I(Lyc/w;Ljava/lang/StringBuilder;)V

    .line 45
    .line 46
    .line 47
    const-string v1, " for "

    .line 48
    .line 49
    invoke-virtual {p3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lbd/n0;->D1()Lyc/k0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p3, "getCorrespondingProperty(...)"

    .line 61
    .line 62
    invoke-static {p1, p3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p1, p2}, Lde/i;->l(Lde/i;Lyc/k0;Ljava/lang/StringBuilder;)V

    .line 66
    .line 67
    .line 68
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public b(Lbd/h0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lde/i;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, p1, p2, v1}, Lde/i;->N(Lyc/k;Ljava/lang/StringBuilder;Z)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    return-object p1
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

.method public c(Lj5/e1;)V
    .locals 1

    .line 1
    check-cast p1, Lc5/q;

    .line 2
    .line 3
    iget-object p1, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lc5/k;

    .line 6
    .line 7
    iget-object v0, p1, Lc5/k;->q:Lj5/a0;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lj5/d1;->c(Lj5/e1;)V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method public d(Li7/u2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li7/d1;

    .line 4
    .line 5
    iget-object v0, v0, Li7/d1;->e:Lb0/c1;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lb0/c1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lb0/w1;

    .line 13
    .line 14
    instance-of v1, p1, Li7/s2;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Li7/s2;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    new-instance v2, Lcg/d;

    .line 24
    .line 25
    const/4 v3, 0x7

    .line 26
    invoke-direct {v2, v3, p1}, Lcg/d;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lb0/w1;->X(Li7/s2;Lic/n;)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public e(Li2/j0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Li2/j0;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.add called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Li2/z1;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
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
.end method

.method public f()Lc7/a;
    .locals 3

    .line 1
    new-instance v0, Lc7/a;

    .line 2
    .line 3
    iget-object v1, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/media/AudioAttributes$Builder;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v1, v2}, Lc7/a;-><init>(Landroid/media/AudioAttributes;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
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

.method public g(Lm4/q;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p1, Lm4/q;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lm4/q;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    const-string v2, "und"

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v2, Lp4/c0;->a:I

    .line 27
    .line 28
    const/16 v4, 0x18

    .line 29
    .line 30
    if-lt v2, v4, :cond_1

    .line 31
    .line 32
    invoke-static {}, Lp4/z;->g()Ljava/util/Locale$Category;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lp4/z;->h()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    :cond_2
    :goto_1
    move-object v0, v3

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    const/4 v4, 0x1

    .line 57
    const/4 v5, 0x0

    .line 58
    :try_start_0
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->offsetByCodePoints(II)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    new-instance v6, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    goto :goto_2

    .line 90
    :catch_0
    nop

    .line 91
    :goto_2
    invoke-virtual {p0, p1}, Lb0/c1;->h(Lm4/q;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Lb0/c1;->q([Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    move-object v1, v3

    .line 116
    :cond_4
    move-object p1, v1

    .line 117
    :cond_5
    return-object p1
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
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
.end method

.method public h(Lm4/q;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/Resources;

    .line 4
    .line 5
    iget p1, p1, Lm4/q;->f:I

    .line 6
    .line 7
    and-int/lit8 v1, p1, 0x2

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const v1, 0x7f0c00b7

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, ""

    .line 20
    .line 21
    :goto_0
    and-int/lit8 v2, p1, 0x4

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const v2, 0x7f0c00ba

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1}, Lb0/c1;->q([Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    and-int/lit8 v2, p1, 0x8

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    const v2, 0x7f0c00b9

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p0, v1}, Lb0/c1;->q([Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_2
    and-int/lit16 p1, p1, 0x440

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    const p1, 0x7f0c00b8

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    filled-new-array {v1, p1}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Lb0/c1;->q([Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    return-object v1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public i(Lbd/q0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "getter"

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lb0/c1;->O(Lbd/n0;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    return-object p1
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

.method public j(Lbd/c0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lde/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lbd/c0;->d:Lbe/c;

    .line 11
    .line 12
    const-string v2, "package"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lde/i;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, v1, Lbe/c;->a:Lbe/d;

    .line 22
    .line 23
    const-string v2, "fqName"

    .line 24
    .line 25
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lbe/d;->f(Lbe/d;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Llc/b;->O(Ljava/util/List;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lde/i;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-lez v2, :cond_0

    .line 45
    .line 46
    const-string v2, " "

    .line 47
    .line 48
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object v1, v0, Lde/i;->a:Lde/m;

    .line 55
    .line 56
    invoke-virtual {v1}, Lde/m;->l()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const-string v1, " in context of "

    .line 63
    .line 64
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, Lbd/c0;->c:Lbd/h0;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, p1, p2, v1}, Lde/i;->N(Lyc/k;Ljava/lang/StringBuilder;Z)V

    .line 71
    .line 72
    .line 73
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 74
    .line 75
    return-object p1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public k()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lb0/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "\' with no args"

    .line 7
    .line 8
    const-string v1, "Failed to invoke constructor \'"

    .line 9
    .line 10
    iget-object v2, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object v0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    sget-object v1, Ljb/c;->a:Lpc/f0;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/RuntimeException;

    .line 24
    .line 25
    const-string v2, "Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :catch_1
    move-exception v3

    .line 32
    new-instance v4, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Ljb/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v4, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw v4

    .line 61
    :catch_2
    move-exception v3

    .line 62
    new-instance v4, Ljava/lang/RuntimeException;

    .line 63
    .line 64
    new-instance v5, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, Ljb/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v4

    .line 87
    :pswitch_0
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Class;

    .line 90
    .line 91
    :try_start_1
    sget-object v1, Lgb/t;->a:Lgb/t;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Lgb/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 97
    return-object v0

    .line 98
    :catch_3
    move-exception v1

    .line 99
    new-instance v2, Ljava/lang/RuntimeException;

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "Unable to create instance of "

    .line 104
    .line 105
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 112
    .line 113
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    throw v2

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
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

.method public l(Lce/e;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lce/e;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Lce/e;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Lce/b0;->h:[I

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-gez v0, :cond_0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    neg-int v0, v0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 25
    .line 26
    aget v2, v1, v2

    .line 27
    .line 28
    iget-object v3, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Ljava/util/Stack;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_5

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lce/e;

    .line 43
    .line 44
    invoke-virtual {v4}, Lce/e;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-lt v4, v2, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    aget v0, v1, v0

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lce/e;

    .line 58
    .line 59
    :goto_0
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lce/e;

    .line 70
    .line 71
    invoke-virtual {v2}, Lce/e;->size()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ge v2, v0, :cond_2

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lce/e;

    .line 82
    .line 83
    new-instance v4, Lce/b0;

    .line 84
    .line 85
    invoke-direct {v4, v2, v1}, Lce/b0;-><init>(Lce/e;Lce/e;)V

    .line 86
    .line 87
    .line 88
    move-object v1, v4

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    new-instance v0, Lce/b0;

    .line 91
    .line 92
    invoke-direct {v0, v1, p1}, Lce/b0;-><init>(Lce/e;Lce/e;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    sget-object p1, Lce/b0;->h:[I

    .line 102
    .line 103
    iget v1, v0, Lce/b0;->b:I

    .line 104
    .line 105
    invoke-static {p1, v1}, Ljava/util/Arrays;->binarySearch([II)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-gez v1, :cond_3

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    neg-int v1, v1

    .line 114
    add-int/lit8 v1, v1, -0x1

    .line 115
    .line 116
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    aget p1, p1, v1

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lce/e;

    .line 125
    .line 126
    invoke-virtual {v1}, Lce/e;->size()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-ge v1, p1, :cond_4

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lce/e;

    .line 137
    .line 138
    new-instance v1, Lce/b0;

    .line 139
    .line 140
    invoke-direct {v1, p1, v0}, Lce/b0;-><init>(Lce/e;Lce/e;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v1

    .line 144
    goto :goto_1

    .line 145
    :cond_4
    invoke-virtual {v3, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_5
    :goto_2
    invoke-virtual {v3, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_6
    instance-of v0, p1, Lce/b0;

    .line 154
    .line 155
    if-eqz v0, :cond_7

    .line 156
    .line 157
    check-cast p1, Lce/b0;

    .line 158
    .line 159
    iget-object v0, p1, Lce/b0;->c:Lce/e;

    .line 160
    .line 161
    invoke-virtual {p0, v0}, Lb0/c1;->l(Lce/e;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p1, Lce/b0;->d:Lce/e;

    .line 165
    .line 166
    invoke-virtual {p0, p1}, Lb0/c1;->l(Lce/e;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    add-int/lit8 v2, v2, 0x31

    .line 187
    .line 188
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 189
    .line 190
    .line 191
    const-string v2, "Has a new type of ByteString been created? Found "

    .line 192
    .line 193
    invoke-static {v1, v2, p1}, Lj2/h0;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
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
.end method

.method public bridge synthetic m(Lyc/t;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lb0/c1;->N(Lyc/t;Ljava/lang/StringBuilder;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 7
    .line 8
    return-object p1
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

.method public n()Lx0/n2;
    .locals 8

    .line 1
    invoke-static {}, Lc4/k;->a()Lc4/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lc4/k;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    new-instance v0, Lb3/j;

    .line 13
    .line 14
    invoke-direct {v0, v2}, Lb3/j;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Lb3/f;

    .line 25
    .line 26
    invoke-direct {v3, v1, p0}, Lb3/f;-><init>(Lx0/e1;Lb0/c1;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, v0, Lc4/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget v4, v0, Lc4/k;->c:I

    .line 39
    .line 40
    if-eq v4, v2, :cond_2

    .line 41
    .line 42
    iget v4, v0, Lc4/k;->c:I

    .line 43
    .line 44
    const/4 v5, 0x2

    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v2, v0, Lc4/k;->b:Lo/f;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Lo/f;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    :goto_0
    iget-object v4, v0, Lc4/k;->d:Landroid/os/Handler;

    .line 57
    .line 58
    new-instance v5, Lc4/i;

    .line 59
    .line 60
    iget v6, v0, Lc4/k;->c:I

    .line 61
    .line 62
    new-array v2, v2, [Lb3/f;

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    aput-object v3, v2, v7

    .line 66
    .line 67
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/util/List;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v5, v2, v6, v3}, Lc4/i;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object v0, v0, Lc4/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :goto_2
    iget-object v0, v0, Lc4/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 97
    .line 98
    .line 99
    throw v1
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
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

.method public o(Lbd/a0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lbd/p;->getName()Lbe/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 11
    .line 12
    return-object p1
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

.method public p(I)Z
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lah/j;

    .line 6
    .line 7
    iget v1, v0, Lah/j;->b:I

    .line 8
    .line 9
    if-ge p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lah/j;->p(I)Lb0/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, Lb0/i;->c:Lb0/t;

    .line 16
    .line 17
    check-cast v1, Lc0/d;

    .line 18
    .line 19
    iget-object v1, v1, Lc0/d;->c:Lic/k;

    .line 20
    .line 21
    iget v0, v0, Lb0/i;->a:I

    .line 22
    .line 23
    sub-int/2addr p1, v0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v1, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v0, Lc0/c0;->a:Lc0/c0;

    .line 35
    .line 36
    if-ne p1, v0, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    return p1
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public varargs q([Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v0, :cond_2

    .line 7
    .line 8
    aget-object v4, p1, v3

    .line 9
    .line 10
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-lez v5, :cond_1

    .line 15
    .line 16
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    move-object v1, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v5, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v5, Landroid/content/res/Resources;

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    new-array v6, v6, [Ljava/lang/Object;

    .line 30
    .line 31
    aput-object v1, v6, v2

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    aput-object v4, v6, v1

    .line 35
    .line 36
    const v1, 0x7f0c00b3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v1, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-object v1
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public r()V
    .locals 12

    .line 1
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc5/k;

    .line 4
    .line 5
    iget v1, v0, Lc5/k;->r:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    iput v1, v0, Lc5/k;->r:I

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, v0, Lc5/k;->t:[Lc5/q;

    .line 15
    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    :goto_0
    if-ge v4, v2, :cond_1

    .line 21
    .line 22
    aget-object v6, v1, v4

    .line 23
    .line 24
    invoke-virtual {v6}, Lc5/q;->j()V

    .line 25
    .line 26
    .line 27
    iget-object v6, v6, Lc5/q;->I:Lj5/o1;

    .line 28
    .line 29
    iget v6, v6, Lj5/o1;->a:I

    .line 30
    .line 31
    add-int/2addr v5, v6

    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-array v1, v5, [Lm4/j1;

    .line 36
    .line 37
    iget-object v2, v0, Lc5/k;->t:[Lc5/q;

    .line 38
    .line 39
    array-length v4, v2

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    :goto_1
    if-ge v5, v4, :cond_3

    .line 43
    .line 44
    aget-object v7, v2, v5

    .line 45
    .line 46
    invoke-virtual {v7}, Lc5/q;->j()V

    .line 47
    .line 48
    .line 49
    iget-object v8, v7, Lc5/q;->I:Lj5/o1;

    .line 50
    .line 51
    iget v8, v8, Lj5/o1;->a:I

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    :goto_2
    if-ge v9, v8, :cond_2

    .line 55
    .line 56
    add-int/lit8 v10, v6, 0x1

    .line 57
    .line 58
    invoke-virtual {v7}, Lc5/q;->j()V

    .line 59
    .line 60
    .line 61
    iget-object v11, v7, Lc5/q;->I:Lj5/o1;

    .line 62
    .line 63
    invoke-virtual {v11, v9}, Lj5/o1;->a(I)Lm4/j1;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    aput-object v11, v1, v6

    .line 68
    .line 69
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    move v6, v10

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance v2, Lj5/o1;

    .line 77
    .line 78
    invoke-direct {v2, v1}, Lj5/o1;-><init>([Lm4/j1;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v0, Lc5/k;->s:Lj5/o1;

    .line 82
    .line 83
    iget-object v1, v0, Lc5/k;->q:Lj5/a0;

    .line 84
    .line 85
    invoke-interface {v1, v0}, Lj5/a0;->a(Lj5/b0;)V

    .line 86
    .line 87
    .line 88
    return-void
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

.method public s(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "android.support.v4.media.session.action.ARGUMENT_URI"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "android.support.v4.media.session.action.PLAY_FROM_URI"

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Lb0/c1;->D(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string p2, "You must specify a non-empty Uri for playFromUri."

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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

.method public t()V
    .locals 2

    .line 1
    const-string v0, "android.support.v4.media.session.action.PREPARE"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lb0/c1;->D(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lb0/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Li2/z1;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public u(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Lb0/c1;->D(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public v(Lbd/p0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "descriptor"

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lde/i;

    .line 11
    .line 12
    invoke-static {v0, p1, p2}, Lde/i;->l(Lde/i;Lyc/k0;Ljava/lang/StringBuilder;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 16
    .line 17
    return-object p1
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

.method public w(Lbd/r0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "setter"

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lb0/c1;->O(Lbd/n0;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    return-object p1
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

.method public x(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.support.v4.media.session.action.ARGUMENT_QUERY"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Lb0/c1;->D(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public y(Lbd/y0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v0, p0, Lb0/c1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lde/i;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, p1, v1, p2, v1}, Lde/i;->c0(Lbd/y0;ZLjava/lang/StringBuilder;Z)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    return-object p1
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

.method public z(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.support.v4.media.session.action.ARGUMENT_URI"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "android.support.v4.media.session.action.PREPARE_FROM_URI"

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Lb0/c1;->D(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void
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
