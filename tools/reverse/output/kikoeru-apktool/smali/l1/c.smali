.class public final Ll1/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/lifecycle/f;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final a:Lj2/v;

.field public final b:Ld/i0;

.field public c:Lj0/l;

.field public final d:Ljava/util/ArrayList;

.field public final e:J

.field public f:Ll1/a;

.field public g:Z

.field public final h:Lkf/f;

.field public final i:Landroid/os/Handler;

.field public j:Lo/y;

.field public k:J

.field public final l:Lo/y;

.field public m:Lj2/t2;

.field public n:Z

.field public final o:La9/m;


# direct methods
.method public constructor <init>(Lj2/v;Ld/i0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/c;->a:Lj2/v;

    .line 5
    .line 6
    iput-object p2, p0, Ll1/c;->b:Ld/i0;

    .line 7
    .line 8
    new-instance p2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Ll1/c;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    const-wide/16 v0, 0x64

    .line 16
    .line 17
    iput-wide v0, p0, Ll1/c;->e:J

    .line 18
    .line 19
    sget-object p2, Ll1/a;->a:Ll1/a;

    .line 20
    .line 21
    iput-object p2, p0, Ll1/c;->f:Ll1/a;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    iput-boolean p2, p0, Ll1/c;->g:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x6

    .line 28
    invoke-static {p2, v1, v0}, Lg8/a;->c(IILkf/a;)Lkf/f;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Ll1/c;->h:Lkf/f;

    .line 33
    .line 34
    new-instance p2, Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Ll1/c;->i:Landroid/os/Handler;

    .line 44
    .line 45
    sget-object p2, Lo/n;->a:Lo/y;

    .line 46
    .line 47
    const-string v0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"

    .line 48
    .line 49
    invoke-static {p2, v0}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Ll1/c;->j:Lo/y;

    .line 53
    .line 54
    new-instance v1, Lo/y;

    .line 55
    .line 56
    invoke-direct {v1}, Lo/y;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Ll1/c;->l:Lo/y;

    .line 60
    .line 61
    new-instance v1, Lj2/t2;

    .line 62
    .line 63
    invoke-virtual {p1}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lq2/q;->a()Lq2/o;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p2, v0}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, p1, p2}, Lj2/t2;-><init>(Lq2/o;Lo/m;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Ll1/c;->m:Lj2/t2;

    .line 78
    .line 79
    new-instance p1, La9/m;

    .line 80
    .line 81
    const/16 p2, 0x12

    .line 82
    .line 83
    invoke-direct {p1, p2, p0}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Ll1/c;->o:La9/m;

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


# virtual methods
.method public final a(Lac/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Ll1/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ll1/b;

    .line 7
    .line 8
    iget v1, v0, Ll1/b;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ll1/b;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ll1/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ll1/b;-><init>(Ll1/c;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ll1/b;->e:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ll1/b;->g:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Ll1/b;->d:Lkf/c;

    .line 40
    .line 41
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object v1, v0, Ll1/b;->d:Lkf/c;

    .line 54
    .line 55
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Ll1/c;->h:Lkf/f;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v1, Lkf/c;

    .line 68
    .line 69
    invoke-direct {v1, p1}, Lkf/c;-><init>(Lkf/f;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    :goto_1
    iput-object v1, v0, Ll1/b;->d:Lkf/c;

    .line 73
    .line 74
    iput v3, v0, Ll1/b;->g:I

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Lkf/c;->b(Lac/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v4, :cond_5

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_8

    .line 90
    .line 91
    invoke-virtual {v1}, Lkf/c;->c()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Ll1/c;->e()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-virtual {p0}, Ll1/c;->f()V

    .line 101
    .line 102
    .line 103
    :cond_6
    iget-boolean p1, p0, Ll1/c;->n:Z

    .line 104
    .line 105
    if-nez p1, :cond_7

    .line 106
    .line 107
    iput-boolean v3, p0, Ll1/c;->n:Z

    .line 108
    .line 109
    iget-object p1, p0, Ll1/c;->i:Landroid/os/Handler;

    .line 110
    .line 111
    iget-object v5, p0, Ll1/c;->o:La9/m;

    .line 112
    .line 113
    invoke-virtual {p1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 114
    .line 115
    .line 116
    :cond_7
    iput-object v1, v0, Ll1/b;->d:Lkf/c;

    .line 117
    .line 118
    iput v2, v0, Ll1/b;->g:I

    .line 119
    .line 120
    iget-wide v5, p0, Ll1/c;->e:J

    .line 121
    .line 122
    invoke-static {v5, v6, v0}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v4, :cond_4

    .line 127
    .line 128
    :goto_3
    return-object v4

    .line 129
    :cond_8
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 130
    .line 131
    return-object p1
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

.method public final b(Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final c(Lo/m;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lo/m;->b:[I

    .line 6
    .line 7
    iget-object v3, v1, Lo/m;->a:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    if-ltz v4, :cond_14

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_0
    aget-wide v7, v3, v6

    .line 16
    .line 17
    not-long v9, v7

    .line 18
    const/4 v11, 0x7

    .line 19
    shl-long/2addr v9, v11

    .line 20
    and-long/2addr v9, v7

    .line 21
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v9, v12

    .line 27
    cmp-long v14, v9, v12

    .line 28
    .line 29
    if-eqz v14, :cond_13

    .line 30
    .line 31
    sub-int v9, v6, v4

    .line 32
    .line 33
    not-int v9, v9

    .line 34
    ushr-int/lit8 v9, v9, 0x1f

    .line 35
    .line 36
    const/16 v10, 0x8

    .line 37
    .line 38
    rsub-int/lit8 v9, v9, 0x8

    .line 39
    .line 40
    const/4 v14, 0x0

    .line 41
    :goto_1
    if-ge v14, v9, :cond_12

    .line 42
    .line 43
    const-wide/16 v15, 0xff

    .line 44
    .line 45
    and-long v17, v7, v15

    .line 46
    .line 47
    const-wide/16 v19, 0x80

    .line 48
    .line 49
    cmp-long v21, v17, v19

    .line 50
    .line 51
    if-gez v21, :cond_11

    .line 52
    .line 53
    shl-int/lit8 v17, v6, 0x3

    .line 54
    .line 55
    add-int v17, v17, v14

    .line 56
    .line 57
    aget v5, v2, v17

    .line 58
    .line 59
    const/16 v17, 0x7

    .line 60
    .line 61
    iget-object v11, v0, Ll1/c;->l:Lo/y;

    .line 62
    .line 63
    invoke-virtual {v11, v5}, Lo/m;->b(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    check-cast v11, Lj2/t2;

    .line 68
    .line 69
    invoke-virtual {v1, v5}, Lo/m;->b(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lq2/p;

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    if-eqz v5, :cond_0

    .line 78
    .line 79
    iget-object v5, v5, Lq2/p;->a:Lq2/o;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_0
    move-object/from16 v5, v21

    .line 83
    .line 84
    :goto_2
    if-eqz v5, :cond_10

    .line 85
    .line 86
    move-wide/from16 v22, v12

    .line 87
    .line 88
    iget v12, v5, Lq2/o;->g:I

    .line 89
    .line 90
    iget-object v5, v5, Lq2/o;->d:Lq2/k;

    .line 91
    .line 92
    if-nez v11, :cond_8

    .line 93
    .line 94
    iget-object v11, v5, Lq2/k;->a:Lo/k0;

    .line 95
    .line 96
    iget-object v13, v11, Lo/k0;->b:[Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v11, v11, Lo/k0;->a:[J

    .line 99
    .line 100
    move-wide/from16 v24, v15

    .line 101
    .line 102
    array-length v15, v11

    .line 103
    add-int/lit8 v15, v15, -0x2

    .line 104
    .line 105
    move-object/from16 v26, v2

    .line 106
    .line 107
    if-ltz v15, :cond_6

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    :goto_3
    const/16 v16, 0x8

    .line 111
    .line 112
    aget-wide v1, v11, v10

    .line 113
    .line 114
    move-wide/from16 v27, v7

    .line 115
    .line 116
    not-long v7, v1

    .line 117
    shl-long v7, v7, v17

    .line 118
    .line 119
    and-long/2addr v7, v1

    .line 120
    and-long v7, v7, v22

    .line 121
    .line 122
    cmp-long v29, v7, v22

    .line 123
    .line 124
    if-eqz v29, :cond_5

    .line 125
    .line 126
    sub-int v7, v10, v15

    .line 127
    .line 128
    not-int v7, v7

    .line 129
    ushr-int/lit8 v7, v7, 0x1f

    .line 130
    .line 131
    rsub-int/lit8 v7, v7, 0x8

    .line 132
    .line 133
    const/4 v8, 0x0

    .line 134
    :goto_4
    if-ge v8, v7, :cond_4

    .line 135
    .line 136
    and-long v29, v1, v24

    .line 137
    .line 138
    cmp-long v31, v29, v19

    .line 139
    .line 140
    if-gez v31, :cond_2

    .line 141
    .line 142
    shl-int/lit8 v29, v10, 0x3

    .line 143
    .line 144
    add-int v29, v29, v8

    .line 145
    .line 146
    aget-object v29, v13, v29

    .line 147
    .line 148
    move-wide/from16 v30, v1

    .line 149
    .line 150
    move-object/from16 v1, v29

    .line 151
    .line 152
    check-cast v1, Lq2/w;

    .line 153
    .line 154
    sget-object v2, Lq2/t;->a:Lq2/w;

    .line 155
    .line 156
    sget-object v2, Lq2/t;->A:Lq2/w;

    .line 157
    .line 158
    invoke-static {v1, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_3

    .line 163
    .line 164
    invoke-static {v5, v2}, Lq2/r;->d(Lq2/k;Lq2/w;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Ljava/util/List;

    .line 169
    .line 170
    if-eqz v1, :cond_1

    .line 171
    .line 172
    invoke-static {v1}, Lvb/m;->a0(Ljava/util/List;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Lt2/g;

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_1
    move-object/from16 v1, v21

    .line 180
    .line 181
    :goto_5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v0, v12, v1}, Ll1/c;->j(ILjava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_2
    move-wide/from16 v30, v1

    .line 190
    .line 191
    :cond_3
    :goto_6
    shr-long v1, v30, v16

    .line 192
    .line 193
    add-int/lit8 v8, v8, 0x1

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_4
    const/16 v1, 0x8

    .line 197
    .line 198
    if-ne v7, v1, :cond_7

    .line 199
    .line 200
    :cond_5
    if-eq v10, v15, :cond_7

    .line 201
    .line 202
    add-int/lit8 v10, v10, 0x1

    .line 203
    .line 204
    move-wide/from16 v7, v27

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_6
    move-wide/from16 v27, v7

    .line 208
    .line 209
    :cond_7
    move-object v10, v3

    .line 210
    move v15, v14

    .line 211
    goto/16 :goto_e

    .line 212
    .line 213
    :cond_8
    move-object/from16 v26, v2

    .line 214
    .line 215
    move-wide/from16 v27, v7

    .line 216
    .line 217
    move-wide/from16 v24, v15

    .line 218
    .line 219
    iget-object v1, v5, Lq2/k;->a:Lo/k0;

    .line 220
    .line 221
    iget-object v2, v1, Lo/k0;->b:[Ljava/lang/Object;

    .line 222
    .line 223
    iget-object v1, v1, Lo/k0;->a:[J

    .line 224
    .line 225
    array-length v7, v1

    .line 226
    add-int/lit8 v7, v7, -0x2

    .line 227
    .line 228
    if-ltz v7, :cond_7

    .line 229
    .line 230
    move-object v13, v2

    .line 231
    move-object v10, v3

    .line 232
    const/4 v8, 0x0

    .line 233
    :goto_7
    aget-wide v2, v1, v8

    .line 234
    .line 235
    move-object/from16 v29, v13

    .line 236
    .line 237
    move v15, v14

    .line 238
    not-long v13, v2

    .line 239
    shl-long v13, v13, v17

    .line 240
    .line 241
    and-long/2addr v13, v2

    .line 242
    and-long v13, v13, v22

    .line 243
    .line 244
    cmp-long v30, v13, v22

    .line 245
    .line 246
    if-eqz v30, :cond_e

    .line 247
    .line 248
    sub-int v13, v8, v7

    .line 249
    .line 250
    not-int v13, v13

    .line 251
    ushr-int/lit8 v13, v13, 0x1f

    .line 252
    .line 253
    const/16 v16, 0x8

    .line 254
    .line 255
    rsub-int/lit8 v13, v13, 0x8

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    :goto_8
    if-ge v14, v13, :cond_d

    .line 259
    .line 260
    and-long v30, v2, v24

    .line 261
    .line 262
    cmp-long v32, v30, v19

    .line 263
    .line 264
    if-gez v32, :cond_c

    .line 265
    .line 266
    shl-int/lit8 v30, v8, 0x3

    .line 267
    .line 268
    add-int v30, v30, v14

    .line 269
    .line 270
    aget-object v30, v29, v30

    .line 271
    .line 272
    move-object/from16 v31, v1

    .line 273
    .line 274
    move-object/from16 v1, v30

    .line 275
    .line 276
    check-cast v1, Lq2/w;

    .line 277
    .line 278
    sget-object v30, Lq2/t;->a:Lq2/w;

    .line 279
    .line 280
    move-wide/from16 v32, v2

    .line 281
    .line 282
    sget-object v2, Lq2/t;->A:Lq2/w;

    .line 283
    .line 284
    invoke-static {v1, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_b

    .line 289
    .line 290
    iget-object v1, v11, Lj2/t2;->a:Lq2/k;

    .line 291
    .line 292
    invoke-static {v1, v2}, Lq2/r;->d(Lq2/k;Lq2/w;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Ljava/util/List;

    .line 297
    .line 298
    if-eqz v1, :cond_9

    .line 299
    .line 300
    invoke-static {v1}, Lvb/m;->a0(Ljava/util/List;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    check-cast v1, Lt2/g;

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_9
    move-object/from16 v1, v21

    .line 308
    .line 309
    :goto_9
    invoke-static {v5, v2}, Lq2/r;->d(Lq2/k;Lq2/w;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, Ljava/util/List;

    .line 314
    .line 315
    if-eqz v2, :cond_a

    .line 316
    .line 317
    invoke-static {v2}, Lvb/m;->a0(Ljava/util/List;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    check-cast v2, Lt2/g;

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_a
    move-object/from16 v2, v21

    .line 325
    .line 326
    :goto_a
    invoke-static {v1, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-nez v1, :cond_b

    .line 331
    .line 332
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v12, v1}, Ll1/c;->j(ILjava/lang/String;)V

    .line 337
    .line 338
    .line 339
    :cond_b
    :goto_b
    const/16 v1, 0x8

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_c
    move-object/from16 v31, v1

    .line 343
    .line 344
    move-wide/from16 v32, v2

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :goto_c
    shr-long v2, v32, v1

    .line 348
    .line 349
    add-int/lit8 v14, v14, 0x1

    .line 350
    .line 351
    move-object/from16 v1, v31

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_d
    move-object/from16 v31, v1

    .line 355
    .line 356
    const/16 v1, 0x8

    .line 357
    .line 358
    if-ne v13, v1, :cond_f

    .line 359
    .line 360
    goto :goto_d

    .line 361
    :cond_e
    move-object/from16 v31, v1

    .line 362
    .line 363
    :goto_d
    if-eq v8, v7, :cond_f

    .line 364
    .line 365
    add-int/lit8 v8, v8, 0x1

    .line 366
    .line 367
    move v14, v15

    .line 368
    move-object/from16 v13, v29

    .line 369
    .line 370
    move-object/from16 v1, v31

    .line 371
    .line 372
    goto/16 :goto_7

    .line 373
    .line 374
    :cond_f
    :goto_e
    const/16 v1, 0x8

    .line 375
    .line 376
    goto :goto_f

    .line 377
    :cond_10
    const-string v1, "no value for specified key"

    .line 378
    .line 379
    invoke-static {v1}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    throw v1

    .line 384
    :cond_11
    move-object/from16 v26, v2

    .line 385
    .line 386
    move-object v10, v3

    .line 387
    move-wide/from16 v27, v7

    .line 388
    .line 389
    move-wide/from16 v22, v12

    .line 390
    .line 391
    move v15, v14

    .line 392
    const/16 v17, 0x7

    .line 393
    .line 394
    goto :goto_e

    .line 395
    :goto_f
    shr-long v7, v27, v1

    .line 396
    .line 397
    add-int/lit8 v14, v15, 0x1

    .line 398
    .line 399
    move-object/from16 v1, p1

    .line 400
    .line 401
    move-object v3, v10

    .line 402
    move-wide/from16 v12, v22

    .line 403
    .line 404
    move-object/from16 v2, v26

    .line 405
    .line 406
    const/16 v10, 0x8

    .line 407
    .line 408
    const/4 v11, 0x7

    .line 409
    goto/16 :goto_1

    .line 410
    .line 411
    :cond_12
    move-object/from16 v26, v2

    .line 412
    .line 413
    move-object v10, v3

    .line 414
    const/16 v1, 0x8

    .line 415
    .line 416
    if-ne v9, v1, :cond_14

    .line 417
    .line 418
    goto :goto_10

    .line 419
    :cond_13
    move-object/from16 v26, v2

    .line 420
    .line 421
    move-object v10, v3

    .line 422
    :goto_10
    if-eq v6, v4, :cond_14

    .line 423
    .line 424
    add-int/lit8 v6, v6, 0x1

    .line 425
    .line 426
    move-object/from16 v1, p1

    .line 427
    .line 428
    move-object v3, v10

    .line 429
    move-object/from16 v2, v26

    .line 430
    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_14
    return-void
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
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final d()Lo/m;
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll1/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Ll1/c;->g:Z

    .line 7
    .line 8
    iget-object v0, p0, Ll1/c;->a:Lj2/v;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lq2/r;->b(Lq2/q;)Lo/y;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Ll1/c;->j:Lo/y;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Ll1/c;->k:J

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Ll1/c;->j:Lo/y;

    .line 27
    .line 28
    return-object v0
    .line 29
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/c;->c:Lj0/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final f()V
    .locals 10

    .line 1
    iget-object v0, p0, Ll1/c;->c:Lj0/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v1, v0, Lj0/l;->a:Ljava/lang/Object;

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x1d

    .line 12
    .line 13
    if-ge v2, v3, :cond_1

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_1
    iget-object v2, p0, Ll1/c;->d:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_7

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    :goto_0
    const/4 v7, 0x1

    .line 32
    if-ge v6, v4, :cond_5

    .line 33
    .line 34
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    check-cast v8, Ll1/d;

    .line 39
    .line 40
    iget-object v9, v8, Ll1/d;->c:Ll1/e;

    .line 41
    .line 42
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_3

    .line 47
    .line 48
    if-ne v9, v7, :cond_2

    .line 49
    .line 50
    iget v7, v8, Ll1/d;->a:I

    .line 51
    .line 52
    int-to-long v7, v7

    .line 53
    invoke-virtual {v0, v7, v8}, Lj0/l;->b(J)Landroid/view/autofill/AutofillId;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    if-eqz v7, :cond_4

    .line 58
    .line 59
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    if-lt v8, v3, :cond_4

    .line 62
    .line 63
    invoke-static {v1}, Lj2/l2;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-static {v8, v7}, Lm2/a;->e(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    new-instance v0, Lce/j0;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_3
    iget-object v7, v8, Ll1/d;->d:Lb1/e;

    .line 78
    .line 79
    if-eqz v7, :cond_4

    .line 80
    .line 81
    iget-object v7, v7, Lb1/e;->a:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v7}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 88
    .line 89
    if-lt v8, v3, :cond_4

    .line 90
    .line 91
    invoke-static {v1}, Lj2/l2;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-static {v8, v7}, Lm2/a;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    if-lt v4, v3, :cond_6

    .line 104
    .line 105
    invoke-static {v1}, Lj2/l2;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v0, v0, Lj0/l;->b:Landroid/view/View;

    .line 110
    .line 111
    invoke-static {v0}, La2/c;->K(Landroid/view/View;)Lb1/e;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, Lb1/e;->a:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v0}, Lk1/g;->k(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-array v3, v7, [J

    .line 125
    .line 126
    const-wide/high16 v6, -0x8000000000000000L

    .line 127
    .line 128
    aput-wide v6, v3, v5

    .line 129
    .line 130
    invoke-static {v1, v0, v3}, Lm2/a;->g(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 134
    .line 135
    .line 136
    :cond_7
    :goto_2
    return-void
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

.method public final synthetic g(Landroidx/lifecycle/x;)V
    .locals 0

    .line 1
    invoke-static {p1}, La0/c;->o(Landroidx/lifecycle/x;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
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

.method public final h(Lq2/o;Lj2/t2;)V
    .locals 7

    .line 1
    new-instance v0, Lb0/i0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1, p2, p0}, Lb0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x4

    .line 12
    invoke-static {p2, p1}, Lq2/o;->j(ILq2/o;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    move-object v1, p2

    .line 17
    check-cast v1, Ljava/util/Collection;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    move-object v5, v4

    .line 32
    check-cast v5, Lq2/o;

    .line 33
    .line 34
    invoke-virtual {p0}, Ll1/c;->d()Lo/m;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget v5, v5, Lq2/o;->g:I

    .line 39
    .line 40
    invoke-virtual {v6, v5}, Lo/m;->a(I)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-interface {v0, v5, v4}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 p2, 0x4

    .line 59
    invoke-static {p2, p1}, Lq2/o;->j(ILq2/o;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    move-object p2, p1

    .line 64
    check-cast p2, Ljava/util/Collection;

    .line 65
    .line 66
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    const/4 v0, 0x0

    .line 71
    :goto_1
    if-ge v0, p2, :cond_4

    .line 72
    .line 73
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lq2/o;

    .line 78
    .line 79
    invoke-virtual {p0}, Ll1/c;->d()Lo/m;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget v3, v1, Lq2/o;->g:I

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Lo/m;->a(I)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    iget-object v2, p0, Ll1/c;->l:Lo/y;

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lo/m;->a(I)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Lo/m;->b(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    check-cast v2, Lj2/t2;

    .line 106
    .line 107
    invoke-virtual {p0, v1, v2}, Ll1/c;->h(Lq2/o;Lj2/t2;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    const-string p1, "node not present in pruned tree before this change"

    .line 112
    .line 113
    invoke-static {p1}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    throw p1

    .line 118
    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    return-void
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

.method public final j(ILjava/lang/String;)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, p0, Ll1/c;->c:Lj0/l;

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    int-to-long v3, p1

    .line 14
    invoke-virtual {v2, v3, v4}, Lj0/l;->b(J)Landroid/view/autofill/AutofillId;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    if-lt v0, v1, :cond_2

    .line 21
    .line 22
    iget-object v0, v2, Lj0/l;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v0}, Lj2/l2;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p1, p2}, Lm2/a;->f(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void

    .line 32
    :cond_3
    const-string p1, "Invalid content capture ID"

    .line 33
    .line 34
    invoke-static {p1}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    throw p1
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

.method public final synthetic k(Landroidx/lifecycle/x;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
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

.method public final l(ILq2/o;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ll1/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p2, Lq2/o;->d:Lq2/k;

    .line 9
    .line 10
    iget-object v0, v0, Lq2/k;->a:Lo/k0;

    .line 11
    .line 12
    sget-object v1, Lq2/t;->C:Lq2/w;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    move-object v1, v2

    .line 22
    :cond_1
    check-cast v1, Ljava/lang/Boolean;

    .line 23
    .line 24
    iget-object v3, p0, Ll1/c;->f:Ll1/a;

    .line 25
    .line 26
    sget-object v4, Ll1/a;->a:Ll1/a;

    .line 27
    .line 28
    if-ne v3, v4, :cond_3

    .line 29
    .line 30
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {v1, v3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    sget-object v1, Lq2/j;->l:Lq2/w;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    move-object v0, v2

    .line 47
    :cond_2
    check-cast v0, Lq2/a;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    iget-object v0, v0, Lq2/a;->b:Lub/e;

    .line 52
    .line 53
    check-cast v0, Lic/k;

    .line 54
    .line 55
    if-eqz v0, :cond_5

    .line 56
    .line 57
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-interface {v0, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    iget-object v3, p0, Ll1/c;->f:Ll1/a;

    .line 67
    .line 68
    sget-object v4, Ll1/a;->b:Ll1/a;

    .line 69
    .line 70
    if-ne v3, v4, :cond_5

    .line 71
    .line 72
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {v1, v3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    sget-object v1, Lq2/j;->l:Lq2/w;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-nez v0, :cond_4

    .line 87
    .line 88
    move-object v0, v2

    .line 89
    :cond_4
    check-cast v0, Lq2/a;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    iget-object v0, v0, Lq2/a;->b:Lub/e;

    .line 94
    .line 95
    check-cast v0, Lic/k;

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-interface {v0, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ljava/lang/Boolean;

    .line 106
    .line 107
    :cond_5
    :goto_0
    iget v4, p2, Lq2/o;->g:I

    .line 108
    .line 109
    iget-object v0, p0, Ll1/c;->c:Lj0/l;

    .line 110
    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    :goto_1
    move-object v8, v2

    .line 114
    goto/16 :goto_5

    .line 115
    .line 116
    :cond_6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    const/16 v3, 0x1d

    .line 119
    .line 120
    if-ge v1, v3, :cond_7

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_7
    iget-object v5, p0, Ll1/c;->a:Lj2/v;

    .line 124
    .line 125
    invoke-static {v5}, La2/c;->K(Landroid/view/View;)Lb1/e;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-nez v5, :cond_8

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    invoke-virtual {p2}, Lq2/o;->l()Lq2/o;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    iget v7, p2, Lq2/o;->g:I

    .line 137
    .line 138
    if-eqz v6, :cond_9

    .line 139
    .line 140
    iget v5, v6, Lq2/o;->g:I

    .line 141
    .line 142
    int-to-long v5, v5

    .line 143
    invoke-virtual {v0, v5, v6}, Lj0/l;->b(J)Landroid/view/autofill/AutofillId;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    if-nez v5, :cond_a

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_9
    iget-object v5, v5, Lb1/e;->a:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v5}, Lk1/g;->k(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    :cond_a
    int-to-long v8, v7

    .line 157
    if-lt v1, v3, :cond_b

    .line 158
    .line 159
    iget-object v0, v0, Lj0/l;->a:Ljava/lang/Object;

    .line 160
    .line 161
    invoke-static {v0}, Lj2/l2;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0, v5, v8, v9}, Lm2/a;->c(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    new-instance v3, Lb1/e;

    .line 170
    .line 171
    invoke-direct {v3, v0}, Lb1/e;-><init>(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_b
    move-object v3, v2

    .line 176
    :goto_2
    if-nez v3, :cond_c

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_c
    iget-object v0, v3, Lb1/e;->a:Ljava/lang/Object;

    .line 180
    .line 181
    iget-object v5, p2, Lq2/o;->d:Lq2/k;

    .line 182
    .line 183
    sget-object v6, Lq2/t;->J:Lq2/w;

    .line 184
    .line 185
    iget-object v8, v5, Lq2/k;->a:Lo/k0;

    .line 186
    .line 187
    invoke-virtual {v8, v6}, Lo/k0;->c(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_d

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_d
    const/16 v6, 0x17

    .line 195
    .line 196
    if-lt v1, v6, :cond_e

    .line 197
    .line 198
    invoke-static {v0}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-static {v9}, Lc7/p0;->b(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    goto :goto_3

    .line 207
    :cond_e
    move-object v9, v2

    .line 208
    :goto_3
    if-eqz v9, :cond_f

    .line 209
    .line 210
    const-string v10, "android.view.contentcapture.EventTimestamp"

    .line 211
    .line 212
    iget-wide v11, p0, Ll1/c;->k:J

    .line 213
    .line 214
    invoke-virtual {v9, v10, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 215
    .line 216
    .line 217
    const-string v10, "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"

    .line 218
    .line 219
    invoke-virtual {v9, v10, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    :cond_f
    sget-object p1, Lq2/t;->y:Lq2/w;

    .line 223
    .line 224
    invoke-virtual {v8, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    if-nez p1, :cond_10

    .line 229
    .line 230
    move-object p1, v2

    .line 231
    :cond_10
    check-cast p1, Ljava/lang/String;

    .line 232
    .line 233
    if-eqz p1, :cond_11

    .line 234
    .line 235
    if-lt v1, v6, :cond_11

    .line 236
    .line 237
    invoke-static {v0}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-static {v9, v7, p1}, Lc7/p0;->l(Landroid/view/ViewStructure;ILjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_11
    sget-object p1, Lq2/t;->m:Lq2/w;

    .line 245
    .line 246
    invoke-virtual {v8, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    if-nez p1, :cond_12

    .line 251
    .line 252
    move-object p1, v2

    .line 253
    :cond_12
    check-cast p1, Ljava/lang/Boolean;

    .line 254
    .line 255
    if-eqz p1, :cond_13

    .line 256
    .line 257
    const-string p1, "android.widget.ViewGroup"

    .line 258
    .line 259
    invoke-virtual {v3, p1}, Lb1/e;->b(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_13
    sget-object p1, Lq2/t;->A:Lq2/w;

    .line 263
    .line 264
    invoke-virtual {v8, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    if-nez p1, :cond_14

    .line 269
    .line 270
    move-object p1, v2

    .line 271
    :cond_14
    check-cast p1, Ljava/util/List;

    .line 272
    .line 273
    const/16 v7, 0x3e

    .line 274
    .line 275
    const-string v9, "\n"

    .line 276
    .line 277
    if-eqz p1, :cond_15

    .line 278
    .line 279
    const-string v10, "android.widget.TextView"

    .line 280
    .line 281
    invoke-virtual {v3, v10}, Lb1/e;->b(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-static {p1, v9, v2, v7}, Lh3/a;->b(Ljava/util/List;Ljava/lang/String;Lsf/i;I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    if-lt v1, v6, :cond_15

    .line 289
    .line 290
    invoke-static {v0}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    invoke-static {v10, p1}, Lc7/p0;->p(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    .line 295
    .line 296
    .line 297
    :cond_15
    sget-object p1, Lq2/t;->E:Lq2/w;

    .line 298
    .line 299
    invoke-virtual {v8, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    if-nez p1, :cond_16

    .line 304
    .line 305
    move-object p1, v2

    .line 306
    :cond_16
    check-cast p1, Lt2/g;

    .line 307
    .line 308
    if-eqz p1, :cond_17

    .line 309
    .line 310
    const-string v10, "android.widget.EditText"

    .line 311
    .line 312
    invoke-virtual {v3, v10}, Lb1/e;->b(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    if-lt v1, v6, :cond_17

    .line 316
    .line 317
    invoke-static {v0}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    invoke-static {v10, p1}, Lc7/p0;->p(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    .line 322
    .line 323
    .line 324
    :cond_17
    sget-object p1, Lq2/t;->a:Lq2/w;

    .line 325
    .line 326
    invoke-virtual {v8, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    if-nez p1, :cond_18

    .line 331
    .line 332
    move-object p1, v2

    .line 333
    :cond_18
    check-cast p1, Ljava/util/List;

    .line 334
    .line 335
    if-eqz p1, :cond_19

    .line 336
    .line 337
    invoke-static {p1, v9, v2, v7}, Lh3/a;->b(Ljava/util/List;Ljava/lang/String;Lsf/i;I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    if-lt v1, v6, :cond_19

    .line 342
    .line 343
    invoke-static {v0}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    invoke-static {v7, p1}, Lc7/p0;->j(Landroid/view/ViewStructure;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_19
    sget-object p1, Lq2/t;->x:Lq2/w;

    .line 351
    .line 352
    invoke-virtual {v8, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    if-nez p1, :cond_1a

    .line 357
    .line 358
    move-object p1, v2

    .line 359
    :cond_1a
    check-cast p1, Lq2/h;

    .line 360
    .line 361
    if-eqz p1, :cond_1b

    .line 362
    .line 363
    iget p1, p1, Lq2/h;->a:I

    .line 364
    .line 365
    invoke-static {p1}, Lj2/l0;->H(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    if-eqz p1, :cond_1b

    .line 370
    .line 371
    invoke-virtual {v3, p1}, Lb1/e;->b(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :cond_1b
    invoke-static {v5}, Lj2/l0;->z(Lq2/k;)Lt2/i0;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    if-eqz p1, :cond_1c

    .line 379
    .line 380
    iget-object p1, p1, Lt2/i0;->a:Lt2/h0;

    .line 381
    .line 382
    iget-object v5, p1, Lt2/h0;->b:Lt2/l0;

    .line 383
    .line 384
    iget-object p1, p1, Lt2/h0;->g:Lf3/c;

    .line 385
    .line 386
    iget-object v5, v5, Lt2/l0;->a:Lt2/d0;

    .line 387
    .line 388
    iget-wide v7, v5, Lt2/d0;->b:J

    .line 389
    .line 390
    invoke-static {v7, v8}, Lf3/o;->c(J)F

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    invoke-interface {p1}, Lf3/c;->a()F

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    mul-float v7, v7, v5

    .line 399
    .line 400
    invoke-interface {p1}, Lf3/c;->M()F

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    mul-float p1, p1, v7

    .line 405
    .line 406
    if-lt v1, v6, :cond_1c

    .line 407
    .line 408
    invoke-static {v0}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-static {v5, p1}, Lc7/p0;->q(Landroid/view/ViewStructure;F)V

    .line 413
    .line 414
    .line 415
    :cond_1c
    invoke-virtual {p2}, Lq2/o;->d()Li2/g1;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    if-eqz p1, :cond_1e

    .line 420
    .line 421
    invoke-virtual {p1}, Li2/g1;->M0()Lj1/p;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    iget-boolean v5, v5, Lj1/p;->n:Z

    .line 426
    .line 427
    if-eqz v5, :cond_1d

    .line 428
    .line 429
    move-object v2, p1

    .line 430
    :cond_1d
    if-eqz v2, :cond_1e

    .line 431
    .line 432
    invoke-virtual {p2, v2}, Lq2/o;->a(Li2/g1;)Lp1/c;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    goto :goto_4

    .line 437
    :cond_1e
    sget-object p1, Lp1/c;->e:Lp1/c;

    .line 438
    .line 439
    :goto_4
    iget v2, p1, Lp1/c;->a:F

    .line 440
    .line 441
    float-to-int v5, v2

    .line 442
    iget v7, p1, Lp1/c;->b:F

    .line 443
    .line 444
    float-to-int v8, v7

    .line 445
    iget v9, p1, Lp1/c;->c:F

    .line 446
    .line 447
    sub-float/2addr v9, v2

    .line 448
    float-to-int v2, v9

    .line 449
    iget p1, p1, Lp1/c;->d:F

    .line 450
    .line 451
    sub-float/2addr p1, v7

    .line 452
    float-to-int p1, p1

    .line 453
    if-lt v1, v6, :cond_1f

    .line 454
    .line 455
    invoke-static {v0}, Landroid/support/v4/media/c;->h(Ljava/lang/Object;)Landroid/view/ViewStructure;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static {v0, v5, v8, v2, p1}, Lc7/p0;->k(Landroid/view/ViewStructure;IIII)V

    .line 460
    .line 461
    .line 462
    :cond_1f
    move-object v8, v3

    .line 463
    :goto_5
    if-nez v8, :cond_20

    .line 464
    .line 465
    goto :goto_6

    .line 466
    :cond_20
    new-instance v3, Ll1/d;

    .line 467
    .line 468
    iget-wide v5, p0, Ll1/c;->k:J

    .line 469
    .line 470
    sget-object v7, Ll1/e;->a:Ll1/e;

    .line 471
    .line 472
    invoke-direct/range {v3 .. v8}, Ll1/d;-><init>(IJLl1/e;Lb1/e;)V

    .line 473
    .line 474
    .line 475
    iget-object p1, p0, Ll1/c;->d:Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    :goto_6
    const/4 p1, 0x4

    .line 481
    invoke-static {p1, p2}, Lq2/o;->j(ILq2/o;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    move-object p2, p1

    .line 486
    check-cast p2, Ljava/util/Collection;

    .line 487
    .line 488
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 489
    .line 490
    .line 491
    move-result p2

    .line 492
    const/4 v0, 0x0

    .line 493
    const/4 v1, 0x0

    .line 494
    :goto_7
    if-ge v0, p2, :cond_22

    .line 495
    .line 496
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    move-object v3, v2

    .line 501
    check-cast v3, Lq2/o;

    .line 502
    .line 503
    invoke-virtual {p0}, Ll1/c;->d()Lo/m;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    iget v3, v3, Lq2/o;->g:I

    .line 508
    .line 509
    invoke-virtual {v4, v3}, Lo/m;->a(I)Z

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    if-eqz v3, :cond_21

    .line 514
    .line 515
    check-cast v2, Lq2/o;

    .line 516
    .line 517
    invoke-virtual {p0, v1, v2}, Ll1/c;->l(ILq2/o;)V

    .line 518
    .line 519
    .line 520
    add-int/lit8 v1, v1, 0x1

    .line 521
    .line 522
    :cond_21
    add-int/lit8 v0, v0, 0x1

    .line 523
    .line 524
    goto :goto_7

    .line 525
    :cond_22
    return-void
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

.method public final m(Lq2/o;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ll1/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget v2, p1, Lq2/o;->g:I

    .line 9
    .line 10
    new-instance v1, Ll1/d;

    .line 11
    .line 12
    iget-wide v3, p0, Ll1/c;->k:J

    .line 13
    .line 14
    sget-object v5, Ll1/e;->b:Ll1/e;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-direct/range {v1 .. v6}, Ll1/d;-><init>(IJLl1/e;Lb1/e;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Ll1/c;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-static {v0, p1}, Lq2/o;->j(ILq2/o;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    move-object v0, p1

    .line 31
    check-cast v0, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    :goto_0
    if-ge v1, v0, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lq2/o;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ll1/c;->m(Lq2/o;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    return-void
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

.method public final n(Landroidx/lifecycle/x;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ll1/c;->a:Lj2/v;

    .line 2
    .line 3
    invoke-virtual {p1}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lq2/q;->a()Lq2/o;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ll1/c;->m(Lq2/o;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ll1/c;->f()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Ll1/c;->c:Lj0/l;

    .line 19
    .line 20
    return-void
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

.method public final synthetic o(Landroidx/lifecycle/x;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
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

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
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

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ll1/c;->i:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Ll1/c;->o:La9/m;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Ll1/c;->c:Lj0/l;

    .line 10
    .line 11
    return-void
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

.method public final p()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ll1/c;->l:Lo/y;

    .line 4
    .line 5
    invoke-virtual {v1}, Lo/y;->c()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ll1/c;->d()Lo/m;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, v2, Lo/m;->b:[I

    .line 13
    .line 14
    iget-object v4, v2, Lo/m;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v2, v2, Lo/m;->a:[J

    .line 17
    .line 18
    array-length v5, v2

    .line 19
    add-int/lit8 v5, v5, -0x2

    .line 20
    .line 21
    if-ltz v5, :cond_3

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    :goto_0
    aget-wide v8, v2, v7

    .line 25
    .line 26
    not-long v10, v8

    .line 27
    const/4 v12, 0x7

    .line 28
    shl-long/2addr v10, v12

    .line 29
    and-long/2addr v10, v8

    .line 30
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v10, v12

    .line 36
    cmp-long v14, v10, v12

    .line 37
    .line 38
    if-eqz v14, :cond_2

    .line 39
    .line 40
    sub-int v10, v7, v5

    .line 41
    .line 42
    not-int v10, v10

    .line 43
    ushr-int/lit8 v10, v10, 0x1f

    .line 44
    .line 45
    const/16 v11, 0x8

    .line 46
    .line 47
    rsub-int/lit8 v10, v10, 0x8

    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    :goto_1
    if-ge v12, v10, :cond_1

    .line 51
    .line 52
    const-wide/16 v13, 0xff

    .line 53
    .line 54
    and-long/2addr v13, v8

    .line 55
    const-wide/16 v15, 0x80

    .line 56
    .line 57
    cmp-long v17, v13, v15

    .line 58
    .line 59
    if-gez v17, :cond_0

    .line 60
    .line 61
    shl-int/lit8 v13, v7, 0x3

    .line 62
    .line 63
    add-int/2addr v13, v12

    .line 64
    aget v14, v3, v13

    .line 65
    .line 66
    aget-object v13, v4, v13

    .line 67
    .line 68
    check-cast v13, Lq2/p;

    .line 69
    .line 70
    new-instance v15, Lj2/t2;

    .line 71
    .line 72
    iget-object v13, v13, Lq2/p;->a:Lq2/o;

    .line 73
    .line 74
    invoke-virtual {v0}, Ll1/c;->d()Lo/m;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-direct {v15, v13, v6}, Lj2/t2;-><init>(Lq2/o;Lo/m;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v14, v15}, Lo/y;->h(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    shr-long/2addr v8, v11

    .line 85
    add-int/lit8 v12, v12, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    if-ne v10, v11, :cond_3

    .line 89
    .line 90
    :cond_2
    if-eq v7, v5, :cond_3

    .line 91
    .line 92
    add-int/lit8 v7, v7, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-instance v1, Lj2/t2;

    .line 96
    .line 97
    iget-object v2, v0, Ll1/c;->a:Lj2/v;

    .line 98
    .line 99
    invoke-virtual {v2}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Lq2/q;->a()Lq2/o;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0}, Ll1/c;->d()Lo/m;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-direct {v1, v2, v3}, Lj2/t2;-><init>(Lq2/o;Lo/m;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v0, Ll1/c;->m:Lj2/t2;

    .line 115
    .line 116
    return-void
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

.method public final q(Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ll1/c;->b:Ld/i0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ld/i0;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lj0/l;

    .line 8
    .line 9
    iput-object p1, p0, Ll1/c;->c:Lj0/l;

    .line 10
    .line 11
    iget-object p1, p0, Ll1/c;->a:Lj2/v;

    .line 12
    .line 13
    invoke-virtual {p1}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lq2/q;->a()Lq2/o;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0, p1}, Ll1/c;->l(ILq2/o;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ll1/c;->f()V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
