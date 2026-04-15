.class public final Ll6/m;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/n;
.implements Lr5/b0;


# instance fields
.field public A:[Ll6/l;

.field public B:[[J

.field public C:I

.field public D:J

.field public E:I

.field public F:Lg6/a;

.field public final a:Lo6/j;

.field public final b:I

.field public final c:Lp4/s;

.field public final d:Lp4/s;

.field public final e:Lp4/s;

.field public final f:Lp4/s;

.field public final g:Ljava/util/ArrayDeque;

.field public final h:Ll6/o;

.field public final i:Ljava/util/ArrayList;

.field public j:Lya/a1;

.field public k:I

.field public l:I

.field public m:J

.field public n:I

.field public o:Lp4/s;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:J

.field public x:Z

.field public y:J

.field public z:Lr5/q;


# direct methods
.method public constructor <init>(Lo6/j;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6/m;->a:Lo6/j;

    .line 5
    .line 6
    iput p2, p0, Ll6/m;->b:I

    .line 7
    .line 8
    sget-object p1, Lya/i0;->b:Lya/g0;

    .line 9
    .line 10
    sget-object p1, Lya/a1;->e:Lya/a1;

    .line 11
    .line 12
    iput-object p1, p0, Ll6/m;->j:Lya/a1;

    .line 13
    .line 14
    and-int/lit8 p1, p2, 0x4

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput p1, p0, Ll6/m;->k:I

    .line 23
    .line 24
    new-instance p1, Ll6/o;

    .line 25
    .line 26
    invoke-direct {p1}, Ll6/o;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ll6/m;->h:Ll6/o;

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ll6/m;->i:Ljava/util/ArrayList;

    .line 37
    .line 38
    new-instance p1, Lp4/s;

    .line 39
    .line 40
    const/16 v0, 0x10

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lp4/s;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Ll6/m;->f:Lp4/s;

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Ll6/m;->g:Ljava/util/ArrayDeque;

    .line 53
    .line 54
    new-instance p1, Lp4/s;

    .line 55
    .line 56
    sget-object v0, Lq4/p;->a:[B

    .line 57
    .line 58
    invoke-direct {p1, v0}, Lp4/s;-><init>([B)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Ll6/m;->c:Lp4/s;

    .line 62
    .line 63
    new-instance p1, Lp4/s;

    .line 64
    .line 65
    const/4 v0, 0x6

    .line 66
    invoke-direct {p1, v0}, Lp4/s;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Ll6/m;->d:Lp4/s;

    .line 70
    .line 71
    new-instance p1, Lp4/s;

    .line 72
    .line 73
    invoke-direct {p1}, Lp4/s;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Ll6/m;->e:Lp4/s;

    .line 77
    .line 78
    const/4 p1, -0x1

    .line 79
    iput p1, p0, Ll6/m;->p:I

    .line 80
    .line 81
    sget-object p1, Lr5/q;->n0:Lr5/p;

    .line 82
    .line 83
    iput-object p1, p0, Ll6/m;->z:Lr5/q;

    .line 84
    .line 85
    new-array p1, p2, [Ll6/l;

    .line 86
    .line 87
    iput-object p1, p0, Ll6/m;->A:[Ll6/l;

    .line 88
    .line 89
    return-void
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
.method public final a()V
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
.end method

.method public final c()Lr5/n;
    .locals 0

    .line 1
    return-object p0
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
.end method

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public final f(Lr5/o;)Z
    .locals 3

    .line 1
    iget v0, p0, Ll6/m;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {p1, v2, v0}, Ll6/p;->m(Lr5/o;ZZ)Lr5/f0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v0, Lya/i0;->b:Lya/g0;

    .line 24
    .line 25
    sget-object v0, Lya/a1;->e:Lya/a1;

    .line 26
    .line 27
    :goto_1
    iput-object v0, p0, Ll6/m;->j:Lya/a1;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    return v2
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final g(Lr5/o;Lb0/a;)I
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :cond_0
    iget v3, v1, Ll6/m;->k:I

    .line 8
    .line 9
    iget-object v5, v1, Ll6/m;->g:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    iget v6, v1, Ll6/m;->b:I

    .line 12
    .line 13
    iget-object v8, v1, Ll6/m;->e:Lp4/s;

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v15, 0x4

    .line 17
    const-wide/16 v16, -0x1

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x2

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v3, :cond_47

    .line 23
    .line 24
    const-wide/32 v19, 0x40000

    .line 25
    .line 26
    .line 27
    if-eq v3, v4, :cond_38

    .line 28
    .line 29
    const-wide/16 v21, 0x8

    .line 30
    .line 31
    if-eq v3, v10, :cond_19

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    if-ne v3, v5, :cond_18

    .line 35
    .line 36
    iget-object v3, v1, Ll6/m;->h:Ll6/o;

    .line 37
    .line 38
    iget-object v6, v3, Ll6/o;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget v8, v3, Ll6/o;->b:I

    .line 41
    .line 42
    if-eqz v8, :cond_14

    .line 43
    .line 44
    if-eq v8, v4, :cond_12

    .line 45
    .line 46
    const/16 v7, 0xb01

    .line 47
    .line 48
    const/16 v12, 0xb00

    .line 49
    .line 50
    const/16 v4, 0x890

    .line 51
    .line 52
    if-eq v8, v10, :cond_d

    .line 53
    .line 54
    if-ne v8, v5, :cond_c

    .line 55
    .line 56
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 57
    .line 58
    .line 59
    move-result-wide v16

    .line 60
    invoke-interface {v0}, Lr5/o;->getLength()J

    .line 61
    .line 62
    .line 63
    move-result-wide v18

    .line 64
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 65
    .line 66
    .line 67
    move-result-wide v20

    .line 68
    sub-long v18, v18, v20

    .line 69
    .line 70
    iget v3, v3, Ll6/o;->c:I

    .line 71
    .line 72
    int-to-long v13, v3

    .line 73
    sub-long v13, v18, v13

    .line 74
    .line 75
    long-to-int v3, v13

    .line 76
    new-instance v13, Lp4/s;

    .line 77
    .line 78
    invoke-direct {v13, v3}, Lp4/s;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iget-object v14, v13, Lp4/s;->a:[B

    .line 82
    .line 83
    invoke-interface {v0, v14, v9, v3}, Lr5/o;->readFully([BII)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-ge v0, v3, :cond_b

    .line 92
    .line 93
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Ll6/n;

    .line 98
    .line 99
    iget-wide v8, v3, Ll6/n;->a:J

    .line 100
    .line 101
    sub-long v8, v8, v16

    .line 102
    .line 103
    long-to-int v9, v8

    .line 104
    invoke-virtual {v13, v9}, Lp4/s;->G(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v13, v15}, Lp4/s;->H(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v13}, Lp4/s;->i()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 115
    .line 116
    invoke-virtual {v13, v8, v9}, Lp4/s;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v19

    .line 124
    sparse-switch v19, :sswitch_data_0

    .line 125
    .line 126
    .line 127
    :goto_1
    const/4 v14, -0x1

    .line 128
    goto :goto_2

    .line 129
    :sswitch_0
    const-string v15, "Super_SlowMotion_BGM"

    .line 130
    .line 131
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    if-nez v14, :cond_1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    const/4 v14, 0x4

    .line 139
    goto :goto_2

    .line 140
    :sswitch_1
    const-string v15, "Super_SlowMotion_Deflickering_On"

    .line 141
    .line 142
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    if-nez v14, :cond_2

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    const/4 v14, 0x3

    .line 150
    goto :goto_2

    .line 151
    :sswitch_2
    const-string v15, "Super_SlowMotion_Data"

    .line 152
    .line 153
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    if-nez v14, :cond_3

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_3
    const/4 v14, 0x2

    .line 161
    goto :goto_2

    .line 162
    :sswitch_3
    const-string v15, "Super_SlowMotion_Edit_Data"

    .line 163
    .line 164
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-nez v14, :cond_4

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    const/4 v14, 0x1

    .line 172
    goto :goto_2

    .line 173
    :sswitch_4
    const-string v15, "SlowMotion_Data"

    .line 174
    .line 175
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    if-nez v14, :cond_5

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_5
    const/4 v14, 0x0

    .line 183
    :goto_2
    packed-switch v14, :pswitch_data_0

    .line 184
    .line 185
    .line 186
    const-string v0, "Invalid SEF name"

    .line 187
    .line 188
    invoke-static {v11, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    throw v0

    .line 193
    :pswitch_0
    const/16 v14, 0xb01

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :pswitch_1
    const/16 v14, 0xb04

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_2
    const/16 v14, 0xb00

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :pswitch_3
    const/16 v14, 0xb03

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :pswitch_4
    const/16 v14, 0x890

    .line 206
    .line 207
    :goto_3
    iget v3, v3, Ll6/n;->b:I

    .line 208
    .line 209
    add-int/lit8 v8, v8, 0x8

    .line 210
    .line 211
    sub-int/2addr v3, v8

    .line 212
    if-eq v14, v4, :cond_7

    .line 213
    .line 214
    if-eq v14, v12, :cond_a

    .line 215
    .line 216
    if-eq v14, v7, :cond_a

    .line 217
    .line 218
    const/16 v3, 0xb03

    .line 219
    .line 220
    if-eq v14, v3, :cond_a

    .line 221
    .line 222
    const/16 v8, 0xb04

    .line 223
    .line 224
    if-ne v14, v8, :cond_6

    .line 225
    .line 226
    goto/16 :goto_5

    .line 227
    .line 228
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 229
    .line 230
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 231
    .line 232
    .line 233
    throw v0

    .line 234
    :cond_7
    new-instance v15, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13, v3, v9}, Lp4/s;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    sget-object v9, Ll6/o;->e:Lah/j;

    .line 244
    .line 245
    invoke-virtual {v9, v3}, Lah/j;->L(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    const/4 v9, 0x0

    .line 250
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v14

    .line 254
    if-ge v9, v14, :cond_9

    .line 255
    .line 256
    sget-object v14, Ll6/o;->d:Lah/j;

    .line 257
    .line 258
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v18

    .line 262
    move-object/from16 v8, v18

    .line 263
    .line 264
    check-cast v8, Ljava/lang/CharSequence;

    .line 265
    .line 266
    invoke-virtual {v14, v8}, Lah/j;->L(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    if-ne v14, v5, :cond_8

    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    :try_start_0
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v18

    .line 281
    check-cast v18, Ljava/lang/String;

    .line 282
    .line 283
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 284
    .line 285
    .line 286
    move-result-wide v30

    .line 287
    const/4 v14, 0x1

    .line 288
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v21

    .line 292
    check-cast v21, Ljava/lang/String;

    .line 293
    .line 294
    invoke-static/range {v21 .. v21}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v32

    .line 298
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    check-cast v8, Ljava/lang/String;

    .line 303
    .line 304
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    const/16 v27, 0x1

    .line 309
    .line 310
    add-int/lit8 v8, v8, -0x1

    .line 311
    .line 312
    shl-int v29, v27, v8

    .line 313
    .line 314
    new-instance v28, Lg6/b;

    .line 315
    .line 316
    invoke-direct/range {v28 .. v33}, Lg6/b;-><init>(IJJ)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v8, v28

    .line 320
    .line 321
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 322
    .line 323
    .line 324
    add-int/lit8 v9, v9, 0x1

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :catch_0
    move-exception v0

    .line 328
    invoke-static {v0, v11}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    throw v0

    .line 333
    :cond_8
    invoke-static {v11, v11}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    throw v0

    .line 338
    :cond_9
    new-instance v3, Lg6/c;

    .line 339
    .line 340
    invoke-direct {v3, v15}, Lg6/c;-><init>(Ljava/util/ArrayList;)V

    .line 341
    .line 342
    .line 343
    iget-object v8, v1, Ll6/m;->i:Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    :cond_a
    :goto_5
    add-int/lit8 v0, v0, 0x1

    .line 349
    .line 350
    const/4 v9, 0x0

    .line 351
    const/4 v15, 0x4

    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_b
    const-wide/16 v8, 0x0

    .line 355
    .line 356
    iput-wide v8, v2, Lb0/a;->a:J

    .line 357
    .line 358
    :goto_6
    const/4 v0, 0x1

    .line 359
    goto/16 :goto_b

    .line 360
    .line 361
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 362
    .line 363
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 364
    .line 365
    .line 366
    throw v0

    .line 367
    :cond_d
    invoke-interface {v0}, Lr5/o;->getLength()J

    .line 368
    .line 369
    .line 370
    move-result-wide v8

    .line 371
    iget v11, v3, Ll6/o;->c:I

    .line 372
    .line 373
    add-int/lit8 v11, v11, -0x14

    .line 374
    .line 375
    new-instance v13, Lp4/s;

    .line 376
    .line 377
    invoke-direct {v13, v11}, Lp4/s;-><init>(I)V

    .line 378
    .line 379
    .line 380
    iget-object v14, v13, Lp4/s;->a:[B

    .line 381
    .line 382
    const/4 v15, 0x0

    .line 383
    invoke-interface {v0, v14, v15, v11}, Lr5/o;->readFully([BII)V

    .line 384
    .line 385
    .line 386
    const/4 v0, 0x0

    .line 387
    :goto_7
    div-int/lit8 v15, v11, 0xc

    .line 388
    .line 389
    if-ge v0, v15, :cond_10

    .line 390
    .line 391
    invoke-virtual {v13, v10}, Lp4/s;->H(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v13}, Lp4/s;->k()S

    .line 395
    .line 396
    .line 397
    move-result v15

    .line 398
    if-eq v15, v4, :cond_e

    .line 399
    .line 400
    if-eq v15, v12, :cond_e

    .line 401
    .line 402
    if-eq v15, v7, :cond_e

    .line 403
    .line 404
    const/16 v4, 0xb03

    .line 405
    .line 406
    if-eq v15, v4, :cond_e

    .line 407
    .line 408
    const/16 v4, 0xb04

    .line 409
    .line 410
    if-eq v15, v4, :cond_f

    .line 411
    .line 412
    const/16 v15, 0x8

    .line 413
    .line 414
    invoke-virtual {v13, v15}, Lp4/s;->H(I)V

    .line 415
    .line 416
    .line 417
    move-wide/from16 v18, v8

    .line 418
    .line 419
    move-object/from16 v21, v13

    .line 420
    .line 421
    goto :goto_8

    .line 422
    :cond_e
    const/16 v4, 0xb04

    .line 423
    .line 424
    :cond_f
    iget v15, v3, Ll6/o;->c:I

    .line 425
    .line 426
    move-wide/from16 v18, v8

    .line 427
    .line 428
    int-to-long v7, v15

    .line 429
    sub-long v7, v18, v7

    .line 430
    .line 431
    invoke-virtual {v13}, Lp4/s;->i()I

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    move-object/from16 v21, v13

    .line 436
    .line 437
    int-to-long v12, v9

    .line 438
    sub-long/2addr v7, v12

    .line 439
    invoke-virtual/range {v21 .. v21}, Lp4/s;->i()I

    .line 440
    .line 441
    .line 442
    move-result v9

    .line 443
    new-instance v12, Ll6/n;

    .line 444
    .line 445
    invoke-direct {v12, v7, v8, v9}, Ll6/n;-><init>(JI)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    :goto_8
    add-int/lit8 v0, v0, 0x1

    .line 452
    .line 453
    move-wide/from16 v8, v18

    .line 454
    .line 455
    move-object/from16 v13, v21

    .line 456
    .line 457
    const/16 v4, 0x890

    .line 458
    .line 459
    const/16 v7, 0xb01

    .line 460
    .line 461
    const/16 v12, 0xb00

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-eqz v0, :cond_11

    .line 469
    .line 470
    const-wide/16 v8, 0x0

    .line 471
    .line 472
    iput-wide v8, v2, Lb0/a;->a:J

    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    goto :goto_6

    .line 476
    :cond_11
    iput v5, v3, Ll6/o;->b:I

    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    check-cast v0, Ll6/n;

    .line 484
    .line 485
    iget-wide v3, v0, Ll6/n;->a:J

    .line 486
    .line 487
    iput-wide v3, v2, Lb0/a;->a:J

    .line 488
    .line 489
    goto/16 :goto_6

    .line 490
    .line 491
    :cond_12
    const/4 v14, 0x0

    .line 492
    new-instance v4, Lp4/s;

    .line 493
    .line 494
    const/16 v15, 0x8

    .line 495
    .line 496
    invoke-direct {v4, v15}, Lp4/s;-><init>(I)V

    .line 497
    .line 498
    .line 499
    iget-object v5, v4, Lp4/s;->a:[B

    .line 500
    .line 501
    invoke-interface {v0, v5, v14, v15}, Lr5/o;->readFully([BII)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v4}, Lp4/s;->i()I

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    add-int/2addr v5, v15

    .line 509
    iput v5, v3, Ll6/o;->c:I

    .line 510
    .line 511
    invoke-virtual {v4}, Lp4/s;->g()I

    .line 512
    .line 513
    .line 514
    move-result v4

    .line 515
    const v5, 0x53454654

    .line 516
    .line 517
    .line 518
    if-eq v4, v5, :cond_13

    .line 519
    .line 520
    const-wide/16 v8, 0x0

    .line 521
    .line 522
    iput-wide v8, v2, Lb0/a;->a:J

    .line 523
    .line 524
    goto/16 :goto_6

    .line 525
    .line 526
    :cond_13
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 527
    .line 528
    .line 529
    move-result-wide v4

    .line 530
    iget v0, v3, Ll6/o;->c:I

    .line 531
    .line 532
    add-int/lit8 v0, v0, -0xc

    .line 533
    .line 534
    int-to-long v6, v0

    .line 535
    sub-long/2addr v4, v6

    .line 536
    iput-wide v4, v2, Lb0/a;->a:J

    .line 537
    .line 538
    iput v10, v3, Ll6/o;->b:I

    .line 539
    .line 540
    goto/16 :goto_6

    .line 541
    .line 542
    :cond_14
    invoke-interface {v0}, Lr5/o;->getLength()J

    .line 543
    .line 544
    .line 545
    move-result-wide v4

    .line 546
    cmp-long v0, v4, v16

    .line 547
    .line 548
    if-eqz v0, :cond_16

    .line 549
    .line 550
    cmp-long v0, v4, v21

    .line 551
    .line 552
    if-gez v0, :cond_15

    .line 553
    .line 554
    goto :goto_9

    .line 555
    :cond_15
    sub-long v4, v4, v21

    .line 556
    .line 557
    goto :goto_a

    .line 558
    :cond_16
    :goto_9
    const-wide/16 v4, 0x0

    .line 559
    .line 560
    :goto_a
    iput-wide v4, v2, Lb0/a;->a:J

    .line 561
    .line 562
    const/4 v0, 0x1

    .line 563
    iput v0, v3, Ll6/o;->b:I

    .line 564
    .line 565
    :goto_b
    iget-wide v2, v2, Lb0/a;->a:J

    .line 566
    .line 567
    const-wide/16 v25, 0x0

    .line 568
    .line 569
    cmp-long v4, v2, v25

    .line 570
    .line 571
    if-nez v4, :cond_17

    .line 572
    .line 573
    const/4 v14, 0x0

    .line 574
    iput v14, v1, Ll6/m;->k:I

    .line 575
    .line 576
    iput v14, v1, Ll6/m;->n:I

    .line 577
    .line 578
    return v0

    .line 579
    :cond_17
    :goto_c
    const/4 v3, 0x1

    .line 580
    goto/16 :goto_22

    .line 581
    .line 582
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 583
    .line 584
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 585
    .line 586
    .line 587
    throw v0

    .line 588
    :cond_19
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 589
    .line 590
    .line 591
    move-result-wide v3

    .line 592
    iget v5, v1, Ll6/m;->p:I

    .line 593
    .line 594
    const/4 v7, -0x1

    .line 595
    if-ne v5, v7, :cond_24

    .line 596
    .line 597
    const/4 v5, 0x0

    .line 598
    const/4 v7, -0x1

    .line 599
    const/4 v9, -0x1

    .line 600
    const/4 v12, 0x1

    .line 601
    const/4 v15, 0x1

    .line 602
    const-wide v16, 0x7fffffffffffffffL

    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    const-wide v28, 0x7fffffffffffffffL

    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    const-wide v30, 0x7fffffffffffffffL

    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    const-wide v32, 0x7fffffffffffffffL

    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    :goto_d
    iget-object v13, v1, Ll6/m;->A:[Ll6/l;

    .line 623
    .line 624
    array-length v14, v13

    .line 625
    if-ge v5, v14, :cond_21

    .line 626
    .line 627
    aget-object v13, v13, v5

    .line 628
    .line 629
    iget v14, v13, Ll6/l;->e:I

    .line 630
    .line 631
    iget-object v13, v13, Ll6/l;->b:Ll6/t;

    .line 632
    .line 633
    const/16 v34, 0x2

    .line 634
    .line 635
    iget v10, v13, Ll6/t;->b:I

    .line 636
    .line 637
    if-ne v14, v10, :cond_1a

    .line 638
    .line 639
    goto :goto_10

    .line 640
    :cond_1a
    iget-object v10, v13, Ll6/t;->c:[J

    .line 641
    .line 642
    aget-wide v35, v10, v14

    .line 643
    .line 644
    iget-object v10, v1, Ll6/m;->B:[[J

    .line 645
    .line 646
    sget v13, Lp4/c0;->a:I

    .line 647
    .line 648
    aget-object v10, v10, v5

    .line 649
    .line 650
    aget-wide v13, v10, v14

    .line 651
    .line 652
    sub-long v35, v35, v3

    .line 653
    .line 654
    const-wide/16 v25, 0x0

    .line 655
    .line 656
    cmp-long v10, v35, v25

    .line 657
    .line 658
    if-ltz v10, :cond_1c

    .line 659
    .line 660
    cmp-long v10, v35, v19

    .line 661
    .line 662
    if-ltz v10, :cond_1b

    .line 663
    .line 664
    goto :goto_e

    .line 665
    :cond_1b
    const/4 v10, 0x0

    .line 666
    goto :goto_f

    .line 667
    :cond_1c
    :goto_e
    const/4 v10, 0x1

    .line 668
    :goto_f
    if-nez v10, :cond_1d

    .line 669
    .line 670
    if-nez v12, :cond_1e

    .line 671
    .line 672
    :cond_1d
    if-ne v10, v12, :cond_1f

    .line 673
    .line 674
    cmp-long v24, v35, v32

    .line 675
    .line 676
    if-gez v24, :cond_1f

    .line 677
    .line 678
    :cond_1e
    move v9, v5

    .line 679
    move v12, v10

    .line 680
    move-wide/from16 v30, v13

    .line 681
    .line 682
    move-wide/from16 v32, v35

    .line 683
    .line 684
    :cond_1f
    cmp-long v24, v13, v28

    .line 685
    .line 686
    if-gez v24, :cond_20

    .line 687
    .line 688
    move v7, v5

    .line 689
    move v15, v10

    .line 690
    move-wide/from16 v28, v13

    .line 691
    .line 692
    :cond_20
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 693
    .line 694
    const/4 v10, 0x2

    .line 695
    goto :goto_d

    .line 696
    :cond_21
    const/16 v34, 0x2

    .line 697
    .line 698
    cmp-long v5, v28, v16

    .line 699
    .line 700
    if-eqz v5, :cond_22

    .line 701
    .line 702
    if-eqz v15, :cond_22

    .line 703
    .line 704
    const-wide/32 v12, 0xa00000

    .line 705
    .line 706
    .line 707
    add-long v28, v28, v12

    .line 708
    .line 709
    cmp-long v5, v30, v28

    .line 710
    .line 711
    if-gez v5, :cond_23

    .line 712
    .line 713
    :cond_22
    move v7, v9

    .line 714
    :cond_23
    iput v7, v1, Ll6/m;->p:I

    .line 715
    .line 716
    const/4 v5, -0x1

    .line 717
    if-ne v7, v5, :cond_25

    .line 718
    .line 719
    :goto_11
    const/16 v23, -0x1

    .line 720
    .line 721
    goto/16 :goto_2b

    .line 722
    .line 723
    :cond_24
    const/16 v34, 0x2

    .line 724
    .line 725
    :cond_25
    iget-object v5, v1, Ll6/m;->A:[Ll6/l;

    .line 726
    .line 727
    iget v7, v1, Ll6/m;->p:I

    .line 728
    .line 729
    aget-object v5, v5, v7

    .line 730
    .line 731
    iget-object v7, v5, Ll6/l;->c:Lr5/h0;

    .line 732
    .line 733
    iget-object v9, v5, Ll6/l;->b:Ll6/t;

    .line 734
    .line 735
    iget-object v10, v5, Ll6/l;->a:Ll6/q;

    .line 736
    .line 737
    iget v12, v5, Ll6/l;->e:I

    .line 738
    .line 739
    iget-object v13, v9, Ll6/t;->c:[J

    .line 740
    .line 741
    iget-object v15, v9, Ll6/t;->d:[I

    .line 742
    .line 743
    aget-wide v16, v13, v12

    .line 744
    .line 745
    iget-wide v13, v1, Ll6/m;->y:J

    .line 746
    .line 747
    add-long v13, v16, v13

    .line 748
    .line 749
    aget v16, v15, v12

    .line 750
    .line 751
    iget-object v11, v5, Ll6/l;->d:Lr5/i0;

    .line 752
    .line 753
    sub-long v3, v13, v3

    .line 754
    .line 755
    move-wide/from16 v29, v3

    .line 756
    .line 757
    iget v3, v1, Ll6/m;->q:I

    .line 758
    .line 759
    int-to-long v3, v3

    .line 760
    add-long v3, v29, v3

    .line 761
    .line 762
    const-wide/16 v25, 0x0

    .line 763
    .line 764
    cmp-long v17, v3, v25

    .line 765
    .line 766
    if-ltz v17, :cond_26

    .line 767
    .line 768
    cmp-long v17, v3, v19

    .line 769
    .line 770
    if-ltz v17, :cond_27

    .line 771
    .line 772
    :cond_26
    const/16 v27, 0x1

    .line 773
    .line 774
    goto/16 :goto_1b

    .line 775
    .line 776
    :cond_27
    iget v2, v10, Ll6/q;->h:I

    .line 777
    .line 778
    iget v13, v10, Ll6/q;->k:I

    .line 779
    .line 780
    iget-object v10, v10, Ll6/q;->g:Lm4/q;

    .line 781
    .line 782
    const/4 v14, 0x1

    .line 783
    if-ne v2, v14, :cond_28

    .line 784
    .line 785
    add-long v3, v3, v21

    .line 786
    .line 787
    add-int/lit8 v16, v16, -0x8

    .line 788
    .line 789
    :cond_28
    move/from16 v2, v16

    .line 790
    .line 791
    long-to-int v4, v3

    .line 792
    invoke-interface {v0, v4}, Lr5/o;->r(I)V

    .line 793
    .line 794
    .line 795
    iget-object v3, v10, Lm4/q;->n:Ljava/lang/String;

    .line 796
    .line 797
    iget-object v4, v10, Lm4/q;->n:Ljava/lang/String;

    .line 798
    .line 799
    const-string v14, "video/avc"

    .line 800
    .line 801
    invoke-static {v3, v14}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    if-eqz v3, :cond_2a

    .line 806
    .line 807
    and-int/lit8 v3, v6, 0x20

    .line 808
    .line 809
    if-eqz v3, :cond_29

    .line 810
    .line 811
    goto :goto_12

    .line 812
    :cond_29
    const/4 v14, 0x1

    .line 813
    goto :goto_13

    .line 814
    :cond_2a
    const-string v3, "video/hevc"

    .line 815
    .line 816
    invoke-static {v4, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v3

    .line 820
    if-eqz v3, :cond_29

    .line 821
    .line 822
    and-int/lit16 v3, v6, 0x80

    .line 823
    .line 824
    if-eqz v3, :cond_29

    .line 825
    .line 826
    :goto_12
    const/4 v14, 0x1

    .line 827
    goto :goto_14

    .line 828
    :goto_13
    iput-boolean v14, v1, Ll6/m;->t:Z

    .line 829
    .line 830
    :goto_14
    if-eqz v13, :cond_30

    .line 831
    .line 832
    iget-object v3, v1, Ll6/m;->d:Lp4/s;

    .line 833
    .line 834
    iget-object v4, v3, Lp4/s;->a:[B

    .line 835
    .line 836
    const/16 v18, 0x0

    .line 837
    .line 838
    aput-byte v18, v4, v18

    .line 839
    .line 840
    aput-byte v18, v4, v14

    .line 841
    .line 842
    aput-byte v18, v4, v34

    .line 843
    .line 844
    rsub-int/lit8 v6, v13, 0x4

    .line 845
    .line 846
    add-int/2addr v2, v6

    .line 847
    :goto_15
    iget v8, v1, Ll6/m;->r:I

    .line 848
    .line 849
    if-ge v8, v2, :cond_2f

    .line 850
    .line 851
    iget v8, v1, Ll6/m;->s:I

    .line 852
    .line 853
    if-nez v8, :cond_2e

    .line 854
    .line 855
    iget-boolean v8, v1, Ll6/m;->t:Z

    .line 856
    .line 857
    if-nez v8, :cond_2b

    .line 858
    .line 859
    invoke-static {v10}, Lq4/p;->d(Lm4/q;)I

    .line 860
    .line 861
    .line 862
    move-result v8

    .line 863
    add-int/2addr v8, v13

    .line 864
    aget v16, v15, v12

    .line 865
    .line 866
    iget v14, v1, Ll6/m;->q:I

    .line 867
    .line 868
    sub-int v14, v16, v14

    .line 869
    .line 870
    if-gt v8, v14, :cond_2b

    .line 871
    .line 872
    invoke-static {v10}, Lq4/p;->d(Lm4/q;)I

    .line 873
    .line 874
    .line 875
    move-result v14

    .line 876
    add-int v8, v13, v14

    .line 877
    .line 878
    goto :goto_16

    .line 879
    :cond_2b
    move v8, v13

    .line 880
    const/4 v14, 0x0

    .line 881
    :goto_16
    invoke-interface {v0, v4, v6, v8}, Lr5/o;->readFully([BII)V

    .line 882
    .line 883
    .line 884
    move/from16 p2, v2

    .line 885
    .line 886
    iget v2, v1, Ll6/m;->q:I

    .line 887
    .line 888
    add-int/2addr v2, v8

    .line 889
    iput v2, v1, Ll6/m;->q:I

    .line 890
    .line 891
    const/4 v2, 0x0

    .line 892
    invoke-virtual {v3, v2}, Lp4/s;->G(I)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v3}, Lp4/s;->g()I

    .line 896
    .line 897
    .line 898
    move-result v8

    .line 899
    if-ltz v8, :cond_2d

    .line 900
    .line 901
    sub-int/2addr v8, v14

    .line 902
    iput v8, v1, Ll6/m;->s:I

    .line 903
    .line 904
    iget-object v8, v1, Ll6/m;->c:Lp4/s;

    .line 905
    .line 906
    invoke-virtual {v8, v2}, Lp4/s;->G(I)V

    .line 907
    .line 908
    .line 909
    move v2, v14

    .line 910
    const/4 v14, 0x4

    .line 911
    invoke-interface {v7, v14, v8}, Lr5/h0;->e(ILp4/s;)V

    .line 912
    .line 913
    .line 914
    iget v8, v1, Ll6/m;->r:I

    .line 915
    .line 916
    add-int/2addr v8, v14

    .line 917
    iput v8, v1, Ll6/m;->r:I

    .line 918
    .line 919
    if-lez v2, :cond_2c

    .line 920
    .line 921
    invoke-interface {v7, v2, v3}, Lr5/h0;->e(ILp4/s;)V

    .line 922
    .line 923
    .line 924
    iget v8, v1, Ll6/m;->r:I

    .line 925
    .line 926
    add-int/2addr v8, v2

    .line 927
    iput v8, v1, Ll6/m;->r:I

    .line 928
    .line 929
    invoke-static {v4, v2, v10}, Lq4/p;->c([BILm4/q;)Z

    .line 930
    .line 931
    .line 932
    move-result v2

    .line 933
    if-eqz v2, :cond_2c

    .line 934
    .line 935
    const/4 v14, 0x1

    .line 936
    iput-boolean v14, v1, Ll6/m;->t:Z

    .line 937
    .line 938
    :cond_2c
    :goto_17
    move/from16 v2, p2

    .line 939
    .line 940
    goto :goto_15

    .line 941
    :cond_2d
    const-string v0, "Invalid NAL length"

    .line 942
    .line 943
    const/4 v2, 0x0

    .line 944
    invoke-static {v2, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    throw v0

    .line 949
    :cond_2e
    move/from16 p2, v2

    .line 950
    .line 951
    const/4 v14, 0x0

    .line 952
    invoke-interface {v7, v0, v8, v14}, Lr5/h0;->d(Lm4/i;IZ)I

    .line 953
    .line 954
    .line 955
    move-result v2

    .line 956
    iget v8, v1, Ll6/m;->q:I

    .line 957
    .line 958
    add-int/2addr v8, v2

    .line 959
    iput v8, v1, Ll6/m;->q:I

    .line 960
    .line 961
    iget v8, v1, Ll6/m;->r:I

    .line 962
    .line 963
    add-int/2addr v8, v2

    .line 964
    iput v8, v1, Ll6/m;->r:I

    .line 965
    .line 966
    iget v8, v1, Ll6/m;->s:I

    .line 967
    .line 968
    sub-int/2addr v8, v2

    .line 969
    iput v8, v1, Ll6/m;->s:I

    .line 970
    .line 971
    goto :goto_17

    .line 972
    :cond_2f
    move/from16 p2, v2

    .line 973
    .line 974
    move/from16 v39, p2

    .line 975
    .line 976
    goto :goto_19

    .line 977
    :cond_30
    const-string v3, "audio/ac4"

    .line 978
    .line 979
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    move-result v3

    .line 983
    if-eqz v3, :cond_32

    .line 984
    .line 985
    iget v3, v1, Ll6/m;->r:I

    .line 986
    .line 987
    if-nez v3, :cond_31

    .line 988
    .line 989
    invoke-static {v2, v8}, Lr5/b;->g(ILp4/s;)V

    .line 990
    .line 991
    .line 992
    const/4 v3, 0x7

    .line 993
    invoke-interface {v7, v3, v8}, Lr5/h0;->e(ILp4/s;)V

    .line 994
    .line 995
    .line 996
    iget v4, v1, Ll6/m;->r:I

    .line 997
    .line 998
    add-int/2addr v4, v3

    .line 999
    iput v4, v1, Ll6/m;->r:I

    .line 1000
    .line 1001
    :cond_31
    add-int/lit8 v2, v2, 0x7

    .line 1002
    .line 1003
    goto :goto_18

    .line 1004
    :cond_32
    if-eqz v11, :cond_33

    .line 1005
    .line 1006
    invoke-virtual {v11, v0}, Lr5/i0;->c(Lr5/o;)V

    .line 1007
    .line 1008
    .line 1009
    :cond_33
    :goto_18
    iget v3, v1, Ll6/m;->r:I

    .line 1010
    .line 1011
    if-ge v3, v2, :cond_34

    .line 1012
    .line 1013
    sub-int v3, v2, v3

    .line 1014
    .line 1015
    const/4 v14, 0x0

    .line 1016
    invoke-interface {v7, v0, v3, v14}, Lr5/h0;->d(Lm4/i;IZ)I

    .line 1017
    .line 1018
    .line 1019
    move-result v3

    .line 1020
    iget v4, v1, Ll6/m;->q:I

    .line 1021
    .line 1022
    add-int/2addr v4, v3

    .line 1023
    iput v4, v1, Ll6/m;->q:I

    .line 1024
    .line 1025
    iget v4, v1, Ll6/m;->r:I

    .line 1026
    .line 1027
    add-int/2addr v4, v3

    .line 1028
    iput v4, v1, Ll6/m;->r:I

    .line 1029
    .line 1030
    iget v4, v1, Ll6/m;->s:I

    .line 1031
    .line 1032
    sub-int/2addr v4, v3

    .line 1033
    iput v4, v1, Ll6/m;->s:I

    .line 1034
    .line 1035
    goto :goto_18

    .line 1036
    :cond_34
    move/from16 v39, v2

    .line 1037
    .line 1038
    :goto_19
    iget-object v0, v9, Ll6/t;->f:[J

    .line 1039
    .line 1040
    aget-wide v36, v0, v12

    .line 1041
    .line 1042
    iget-object v0, v9, Ll6/t;->g:[I

    .line 1043
    .line 1044
    aget v0, v0, v12

    .line 1045
    .line 1046
    iget-boolean v2, v1, Ll6/m;->t:Z

    .line 1047
    .line 1048
    if-nez v2, :cond_35

    .line 1049
    .line 1050
    const/high16 v2, 0x4000000

    .line 1051
    .line 1052
    or-int/2addr v0, v2

    .line 1053
    :cond_35
    move/from16 v38, v0

    .line 1054
    .line 1055
    if-eqz v11, :cond_36

    .line 1056
    .line 1057
    const/16 v41, 0x0

    .line 1058
    .line 1059
    const/16 v42, 0x0

    .line 1060
    .line 1061
    move-object/from16 v35, v11

    .line 1062
    .line 1063
    move/from16 v40, v39

    .line 1064
    .line 1065
    move/from16 v39, v38

    .line 1066
    .line 1067
    move-wide/from16 v37, v36

    .line 1068
    .line 1069
    move-object/from16 v36, v7

    .line 1070
    .line 1071
    invoke-virtual/range {v35 .. v42}, Lr5/i0;->b(Lr5/h0;JIIILr5/g0;)V

    .line 1072
    .line 1073
    .line 1074
    move-object/from16 v2, v35

    .line 1075
    .line 1076
    move-object/from16 v0, v36

    .line 1077
    .line 1078
    const/16 v27, 0x1

    .line 1079
    .line 1080
    add-int/lit8 v12, v12, 0x1

    .line 1081
    .line 1082
    iget v3, v9, Ll6/t;->b:I

    .line 1083
    .line 1084
    if-ne v12, v3, :cond_37

    .line 1085
    .line 1086
    const/4 v3, 0x0

    .line 1087
    invoke-virtual {v2, v0, v3}, Lr5/i0;->a(Lr5/h0;Lr5/g0;)V

    .line 1088
    .line 1089
    .line 1090
    goto :goto_1a

    .line 1091
    :cond_36
    move-object v0, v7

    .line 1092
    const/16 v27, 0x1

    .line 1093
    .line 1094
    const/16 v40, 0x0

    .line 1095
    .line 1096
    const/16 v41, 0x0

    .line 1097
    .line 1098
    move-object/from16 v35, v0

    .line 1099
    .line 1100
    invoke-interface/range {v35 .. v41}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 1101
    .line 1102
    .line 1103
    :cond_37
    :goto_1a
    iget v0, v5, Ll6/l;->e:I

    .line 1104
    .line 1105
    add-int/lit8 v0, v0, 0x1

    .line 1106
    .line 1107
    iput v0, v5, Ll6/l;->e:I

    .line 1108
    .line 1109
    const/4 v5, -0x1

    .line 1110
    iput v5, v1, Ll6/m;->p:I

    .line 1111
    .line 1112
    const/4 v14, 0x0

    .line 1113
    iput v14, v1, Ll6/m;->q:I

    .line 1114
    .line 1115
    iput v14, v1, Ll6/m;->r:I

    .line 1116
    .line 1117
    iput v14, v1, Ll6/m;->s:I

    .line 1118
    .line 1119
    iput-boolean v14, v1, Ll6/m;->t:Z

    .line 1120
    .line 1121
    return v14

    .line 1122
    :goto_1b
    iput-wide v13, v2, Lb0/a;->a:J

    .line 1123
    .line 1124
    return v27

    .line 1125
    :cond_38
    const/16 v34, 0x2

    .line 1126
    .line 1127
    iget-wide v3, v1, Ll6/m;->m:J

    .line 1128
    .line 1129
    iget v6, v1, Ll6/m;->n:I

    .line 1130
    .line 1131
    int-to-long v6, v6

    .line 1132
    sub-long/2addr v3, v6

    .line 1133
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v6

    .line 1137
    add-long/2addr v6, v3

    .line 1138
    iget-object v8, v1, Ll6/m;->o:Lp4/s;

    .line 1139
    .line 1140
    if-eqz v8, :cond_41

    .line 1141
    .line 1142
    iget-object v9, v8, Lp4/s;->a:[B

    .line 1143
    .line 1144
    iget v10, v1, Ll6/m;->n:I

    .line 1145
    .line 1146
    long-to-int v4, v3

    .line 1147
    invoke-interface {v0, v9, v10, v4}, Lr5/o;->readFully([BII)V

    .line 1148
    .line 1149
    .line 1150
    iget v3, v1, Ll6/m;->l:I

    .line 1151
    .line 1152
    const v4, 0x66747970

    .line 1153
    .line 1154
    .line 1155
    if-ne v3, v4, :cond_40

    .line 1156
    .line 1157
    const/4 v3, 0x1

    .line 1158
    iput-boolean v3, v1, Ll6/m;->u:Z

    .line 1159
    .line 1160
    const/16 v15, 0x8

    .line 1161
    .line 1162
    invoke-virtual {v8, v15}, Lp4/s;->G(I)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v8}, Lp4/s;->g()I

    .line 1166
    .line 1167
    .line 1168
    move-result v3

    .line 1169
    const v4, 0x71742020

    .line 1170
    .line 1171
    .line 1172
    const v5, 0x68656963

    .line 1173
    .line 1174
    .line 1175
    if-eq v3, v5, :cond_3a

    .line 1176
    .line 1177
    if-eq v3, v4, :cond_39

    .line 1178
    .line 1179
    const/4 v3, 0x0

    .line 1180
    goto :goto_1c

    .line 1181
    :cond_39
    const/4 v3, 0x1

    .line 1182
    goto :goto_1c

    .line 1183
    :cond_3a
    const/4 v3, 0x2

    .line 1184
    :goto_1c
    if-eqz v3, :cond_3b

    .line 1185
    .line 1186
    goto :goto_1e

    .line 1187
    :cond_3b
    const/4 v3, 0x4

    .line 1188
    invoke-virtual {v8, v3}, Lp4/s;->H(I)V

    .line 1189
    .line 1190
    .line 1191
    :cond_3c
    invoke-virtual {v8}, Lp4/s;->a()I

    .line 1192
    .line 1193
    .line 1194
    move-result v3

    .line 1195
    if-lez v3, :cond_3f

    .line 1196
    .line 1197
    invoke-virtual {v8}, Lp4/s;->g()I

    .line 1198
    .line 1199
    .line 1200
    move-result v3

    .line 1201
    if-eq v3, v5, :cond_3e

    .line 1202
    .line 1203
    if-eq v3, v4, :cond_3d

    .line 1204
    .line 1205
    const/4 v3, 0x0

    .line 1206
    goto :goto_1d

    .line 1207
    :cond_3d
    const/4 v3, 0x1

    .line 1208
    goto :goto_1d

    .line 1209
    :cond_3e
    const/4 v3, 0x2

    .line 1210
    :goto_1d
    if-eqz v3, :cond_3c

    .line 1211
    .line 1212
    goto :goto_1e

    .line 1213
    :cond_3f
    const/4 v3, 0x0

    .line 1214
    :goto_1e
    iput v3, v1, Ll6/m;->E:I

    .line 1215
    .line 1216
    goto :goto_1f

    .line 1217
    :cond_40
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1218
    .line 1219
    .line 1220
    move-result v3

    .line 1221
    if-nez v3, :cond_43

    .line 1222
    .line 1223
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v3

    .line 1227
    check-cast v3, Lq4/b;

    .line 1228
    .line 1229
    new-instance v4, Lq4/c;

    .line 1230
    .line 1231
    iget v5, v1, Ll6/m;->l:I

    .line 1232
    .line 1233
    invoke-direct {v4, v5, v8}, Lq4/c;-><init>(ILp4/s;)V

    .line 1234
    .line 1235
    .line 1236
    iget-object v3, v3, Lq4/b;->d:Ljava/util/ArrayList;

    .line 1237
    .line 1238
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1239
    .line 1240
    .line 1241
    goto :goto_1f

    .line 1242
    :cond_41
    iget-boolean v5, v1, Ll6/m;->u:Z

    .line 1243
    .line 1244
    if-nez v5, :cond_42

    .line 1245
    .line 1246
    iget v5, v1, Ll6/m;->l:I

    .line 1247
    .line 1248
    const v8, 0x6d646174

    .line 1249
    .line 1250
    .line 1251
    if-ne v5, v8, :cond_42

    .line 1252
    .line 1253
    const/4 v5, 0x1

    .line 1254
    iput v5, v1, Ll6/m;->E:I

    .line 1255
    .line 1256
    :cond_42
    cmp-long v5, v3, v19

    .line 1257
    .line 1258
    if-gez v5, :cond_44

    .line 1259
    .line 1260
    long-to-int v4, v3

    .line 1261
    invoke-interface {v0, v4}, Lr5/o;->r(I)V

    .line 1262
    .line 1263
    .line 1264
    :cond_43
    :goto_1f
    const/4 v3, 0x0

    .line 1265
    goto :goto_20

    .line 1266
    :cond_44
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 1267
    .line 1268
    .line 1269
    move-result-wide v8

    .line 1270
    add-long/2addr v8, v3

    .line 1271
    iput-wide v8, v2, Lb0/a;->a:J

    .line 1272
    .line 1273
    const/4 v3, 0x1

    .line 1274
    :goto_20
    invoke-virtual {v1, v6, v7}, Ll6/m;->n(J)V

    .line 1275
    .line 1276
    .line 1277
    iget-boolean v4, v1, Ll6/m;->v:Z

    .line 1278
    .line 1279
    if-eqz v4, :cond_45

    .line 1280
    .line 1281
    const/4 v5, 0x1

    .line 1282
    iput-boolean v5, v1, Ll6/m;->x:Z

    .line 1283
    .line 1284
    iget-wide v3, v1, Ll6/m;->w:J

    .line 1285
    .line 1286
    iput-wide v3, v2, Lb0/a;->a:J

    .line 1287
    .line 1288
    const/4 v14, 0x0

    .line 1289
    iput-boolean v14, v1, Ll6/m;->v:Z

    .line 1290
    .line 1291
    const/4 v3, 0x1

    .line 1292
    :cond_45
    if-eqz v3, :cond_46

    .line 1293
    .line 1294
    iget v3, v1, Ll6/m;->k:I

    .line 1295
    .line 1296
    const/4 v4, 0x2

    .line 1297
    if-eq v3, v4, :cond_46

    .line 1298
    .line 1299
    const/4 v9, 0x1

    .line 1300
    goto :goto_21

    .line 1301
    :cond_46
    const/4 v9, 0x0

    .line 1302
    :goto_21
    if-eqz v9, :cond_0

    .line 1303
    .line 1304
    goto/16 :goto_c

    .line 1305
    .line 1306
    :goto_22
    return v3

    .line 1307
    :cond_47
    const/4 v3, 0x1

    .line 1308
    iget v4, v1, Ll6/m;->n:I

    .line 1309
    .line 1310
    iget-object v7, v1, Ll6/m;->f:Lp4/s;

    .line 1311
    .line 1312
    if-nez v4, :cond_4b

    .line 1313
    .line 1314
    iget-object v4, v7, Lp4/s;->a:[B

    .line 1315
    .line 1316
    const/4 v14, 0x0

    .line 1317
    const/16 v15, 0x8

    .line 1318
    .line 1319
    invoke-interface {v0, v4, v14, v15, v3}, Lr5/o;->d([BIIZ)Z

    .line 1320
    .line 1321
    .line 1322
    move-result v4

    .line 1323
    if-nez v4, :cond_4a

    .line 1324
    .line 1325
    iget v3, v1, Ll6/m;->E:I

    .line 1326
    .line 1327
    const/4 v4, 0x2

    .line 1328
    if-ne v3, v4, :cond_49

    .line 1329
    .line 1330
    and-int/lit8 v3, v6, 0x2

    .line 1331
    .line 1332
    if-eqz v3, :cond_49

    .line 1333
    .line 1334
    iget-object v3, v1, Ll6/m;->z:Lr5/q;

    .line 1335
    .line 1336
    const/4 v4, 0x4

    .line 1337
    invoke-interface {v3, v14, v4}, Lr5/q;->u(II)Lr5/h0;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    iget-object v4, v1, Ll6/m;->F:Lg6/a;

    .line 1342
    .line 1343
    if-nez v4, :cond_48

    .line 1344
    .line 1345
    const/4 v11, 0x0

    .line 1346
    goto :goto_23

    .line 1347
    :cond_48
    new-instance v11, Lm4/n0;

    .line 1348
    .line 1349
    const/4 v5, 0x1

    .line 1350
    new-array v5, v5, [Lm4/m0;

    .line 1351
    .line 1352
    aput-object v4, v5, v14

    .line 1353
    .line 1354
    invoke-direct {v11, v5}, Lm4/n0;-><init>([Lm4/m0;)V

    .line 1355
    .line 1356
    .line 1357
    :goto_23
    new-instance v4, Lm4/p;

    .line 1358
    .line 1359
    invoke-direct {v4}, Lm4/p;-><init>()V

    .line 1360
    .line 1361
    .line 1362
    iput-object v11, v4, Lm4/p;->k:Lm4/n0;

    .line 1363
    .line 1364
    invoke-static {v4, v3}, La0/c;->O(Lm4/p;Lr5/h0;)V

    .line 1365
    .line 1366
    .line 1367
    iget-object v3, v1, Ll6/m;->z:Lr5/q;

    .line 1368
    .line 1369
    invoke-interface {v3}, Lr5/q;->n()V

    .line 1370
    .line 1371
    .line 1372
    iget-object v3, v1, Ll6/m;->z:Lr5/q;

    .line 1373
    .line 1374
    new-instance v4, Lr5/s;

    .line 1375
    .line 1376
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    invoke-direct {v4, v5, v6}, Lr5/s;-><init>(J)V

    .line 1382
    .line 1383
    .line 1384
    invoke-interface {v3, v4}, Lr5/q;->a(Lr5/b0;)V

    .line 1385
    .line 1386
    .line 1387
    :cond_49
    const/4 v9, 0x0

    .line 1388
    goto/16 :goto_2a

    .line 1389
    .line 1390
    :cond_4a
    const/16 v15, 0x8

    .line 1391
    .line 1392
    iput v15, v1, Ll6/m;->n:I

    .line 1393
    .line 1394
    const/4 v14, 0x0

    .line 1395
    invoke-virtual {v7, v14}, Lp4/s;->G(I)V

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v7}, Lp4/s;->w()J

    .line 1399
    .line 1400
    .line 1401
    move-result-wide v3

    .line 1402
    iput-wide v3, v1, Ll6/m;->m:J

    .line 1403
    .line 1404
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 1405
    .line 1406
    .line 1407
    move-result v3

    .line 1408
    iput v3, v1, Ll6/m;->l:I

    .line 1409
    .line 1410
    :cond_4b
    iget-wide v3, v1, Ll6/m;->m:J

    .line 1411
    .line 1412
    const-wide/16 v9, 0x1

    .line 1413
    .line 1414
    cmp-long v6, v3, v9

    .line 1415
    .line 1416
    if-nez v6, :cond_4c

    .line 1417
    .line 1418
    iget-object v3, v7, Lp4/s;->a:[B

    .line 1419
    .line 1420
    const/16 v15, 0x8

    .line 1421
    .line 1422
    invoke-interface {v0, v3, v15, v15}, Lr5/o;->readFully([BII)V

    .line 1423
    .line 1424
    .line 1425
    iget v3, v1, Ll6/m;->n:I

    .line 1426
    .line 1427
    add-int/2addr v3, v15

    .line 1428
    iput v3, v1, Ll6/m;->n:I

    .line 1429
    .line 1430
    invoke-virtual {v7}, Lp4/s;->z()J

    .line 1431
    .line 1432
    .line 1433
    move-result-wide v3

    .line 1434
    iput-wide v3, v1, Ll6/m;->m:J

    .line 1435
    .line 1436
    goto :goto_24

    .line 1437
    :cond_4c
    const-wide/16 v25, 0x0

    .line 1438
    .line 1439
    cmp-long v6, v3, v25

    .line 1440
    .line 1441
    if-nez v6, :cond_4e

    .line 1442
    .line 1443
    invoke-interface {v0}, Lr5/o;->getLength()J

    .line 1444
    .line 1445
    .line 1446
    move-result-wide v3

    .line 1447
    cmp-long v6, v3, v16

    .line 1448
    .line 1449
    if-nez v6, :cond_4d

    .line 1450
    .line 1451
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v6

    .line 1455
    check-cast v6, Lq4/b;

    .line 1456
    .line 1457
    if-eqz v6, :cond_4d

    .line 1458
    .line 1459
    iget-wide v3, v6, Lq4/b;->c:J

    .line 1460
    .line 1461
    :cond_4d
    cmp-long v6, v3, v16

    .line 1462
    .line 1463
    if-eqz v6, :cond_4e

    .line 1464
    .line 1465
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 1466
    .line 1467
    .line 1468
    move-result-wide v9

    .line 1469
    sub-long/2addr v3, v9

    .line 1470
    iget v6, v1, Ll6/m;->n:I

    .line 1471
    .line 1472
    int-to-long v9, v6

    .line 1473
    add-long/2addr v3, v9

    .line 1474
    iput-wide v3, v1, Ll6/m;->m:J

    .line 1475
    .line 1476
    :cond_4e
    :goto_24
    iget-wide v3, v1, Ll6/m;->m:J

    .line 1477
    .line 1478
    iget v6, v1, Ll6/m;->n:I

    .line 1479
    .line 1480
    int-to-long v9, v6

    .line 1481
    cmp-long v11, v3, v9

    .line 1482
    .line 1483
    if-ltz v11, :cond_59

    .line 1484
    .line 1485
    iget v3, v1, Ll6/m;->l:I

    .line 1486
    .line 1487
    const v4, 0x6d6f6f76

    .line 1488
    .line 1489
    .line 1490
    const v9, 0x68646c72    # 4.3148E24f

    .line 1491
    .line 1492
    .line 1493
    const v10, 0x6d657461

    .line 1494
    .line 1495
    .line 1496
    if-eq v3, v4, :cond_4f

    .line 1497
    .line 1498
    const v4, 0x7472616b

    .line 1499
    .line 1500
    .line 1501
    if-eq v3, v4, :cond_4f

    .line 1502
    .line 1503
    const v4, 0x6d646961

    .line 1504
    .line 1505
    .line 1506
    if-eq v3, v4, :cond_4f

    .line 1507
    .line 1508
    const v4, 0x6d696e66

    .line 1509
    .line 1510
    .line 1511
    if-eq v3, v4, :cond_4f

    .line 1512
    .line 1513
    const v4, 0x7374626c

    .line 1514
    .line 1515
    .line 1516
    if-eq v3, v4, :cond_4f

    .line 1517
    .line 1518
    const v4, 0x65647473

    .line 1519
    .line 1520
    .line 1521
    if-eq v3, v4, :cond_4f

    .line 1522
    .line 1523
    if-eq v3, v10, :cond_4f

    .line 1524
    .line 1525
    const v4, 0x61787465

    .line 1526
    .line 1527
    .line 1528
    if-ne v3, v4, :cond_50

    .line 1529
    .line 1530
    :cond_4f
    const/4 v3, 0x1

    .line 1531
    goto/16 :goto_28

    .line 1532
    .line 1533
    :cond_50
    const v4, 0x6d646864

    .line 1534
    .line 1535
    .line 1536
    if-eq v3, v4, :cond_51

    .line 1537
    .line 1538
    const v4, 0x6d766864

    .line 1539
    .line 1540
    .line 1541
    if-eq v3, v4, :cond_51

    .line 1542
    .line 1543
    if-eq v3, v9, :cond_51

    .line 1544
    .line 1545
    const v4, 0x73747364

    .line 1546
    .line 1547
    .line 1548
    if-eq v3, v4, :cond_51

    .line 1549
    .line 1550
    const v4, 0x73747473

    .line 1551
    .line 1552
    .line 1553
    if-eq v3, v4, :cond_51

    .line 1554
    .line 1555
    const v4, 0x73747373

    .line 1556
    .line 1557
    .line 1558
    if-eq v3, v4, :cond_51

    .line 1559
    .line 1560
    const v4, 0x63747473

    .line 1561
    .line 1562
    .line 1563
    if-eq v3, v4, :cond_51

    .line 1564
    .line 1565
    const v4, 0x656c7374

    .line 1566
    .line 1567
    .line 1568
    if-eq v3, v4, :cond_51

    .line 1569
    .line 1570
    const v4, 0x73747363

    .line 1571
    .line 1572
    .line 1573
    if-eq v3, v4, :cond_51

    .line 1574
    .line 1575
    const v4, 0x7374737a

    .line 1576
    .line 1577
    .line 1578
    if-eq v3, v4, :cond_51

    .line 1579
    .line 1580
    const v4, 0x73747a32

    .line 1581
    .line 1582
    .line 1583
    if-eq v3, v4, :cond_51

    .line 1584
    .line 1585
    const v4, 0x7374636f

    .line 1586
    .line 1587
    .line 1588
    if-eq v3, v4, :cond_51

    .line 1589
    .line 1590
    const v4, 0x636f3634

    .line 1591
    .line 1592
    .line 1593
    if-eq v3, v4, :cond_51

    .line 1594
    .line 1595
    const v4, 0x746b6864

    .line 1596
    .line 1597
    .line 1598
    if-eq v3, v4, :cond_51

    .line 1599
    .line 1600
    const v4, 0x66747970

    .line 1601
    .line 1602
    .line 1603
    if-eq v3, v4, :cond_51

    .line 1604
    .line 1605
    const v4, 0x75647461

    .line 1606
    .line 1607
    .line 1608
    if-eq v3, v4, :cond_51

    .line 1609
    .line 1610
    const v4, 0x6b657973

    .line 1611
    .line 1612
    .line 1613
    if-eq v3, v4, :cond_51

    .line 1614
    .line 1615
    const v4, 0x696c7374

    .line 1616
    .line 1617
    .line 1618
    if-ne v3, v4, :cond_52

    .line 1619
    .line 1620
    :cond_51
    const/16 v15, 0x8

    .line 1621
    .line 1622
    goto :goto_25

    .line 1623
    :cond_52
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 1624
    .line 1625
    .line 1626
    move-result-wide v3

    .line 1627
    iget v5, v1, Ll6/m;->n:I

    .line 1628
    .line 1629
    int-to-long v5, v5

    .line 1630
    sub-long v10, v3, v5

    .line 1631
    .line 1632
    iget v3, v1, Ll6/m;->l:I

    .line 1633
    .line 1634
    const v4, 0x6d707664

    .line 1635
    .line 1636
    .line 1637
    if-ne v3, v4, :cond_53

    .line 1638
    .line 1639
    new-instance v7, Lg6/a;

    .line 1640
    .line 1641
    add-long v14, v10, v5

    .line 1642
    .line 1643
    iget-wide v3, v1, Ll6/m;->m:J

    .line 1644
    .line 1645
    sub-long v16, v3, v5

    .line 1646
    .line 1647
    const-wide/16 v8, 0x0

    .line 1648
    .line 1649
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    invoke-direct/range {v7 .. v17}, Lg6/a;-><init>(JJJJJ)V

    .line 1655
    .line 1656
    .line 1657
    iput-object v7, v1, Ll6/m;->F:Lg6/a;

    .line 1658
    .line 1659
    :cond_53
    const/4 v3, 0x0

    .line 1660
    iput-object v3, v1, Ll6/m;->o:Lp4/s;

    .line 1661
    .line 1662
    const/4 v14, 0x1

    .line 1663
    iput v14, v1, Ll6/m;->k:I

    .line 1664
    .line 1665
    goto/16 :goto_29

    .line 1666
    .line 1667
    :goto_25
    if-ne v6, v15, :cond_54

    .line 1668
    .line 1669
    const/4 v3, 0x1

    .line 1670
    goto :goto_26

    .line 1671
    :cond_54
    const/4 v3, 0x0

    .line 1672
    :goto_26
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 1673
    .line 1674
    .line 1675
    iget-wide v3, v1, Ll6/m;->m:J

    .line 1676
    .line 1677
    const-wide/32 v5, 0x7fffffff

    .line 1678
    .line 1679
    .line 1680
    cmp-long v8, v3, v5

    .line 1681
    .line 1682
    if-gtz v8, :cond_55

    .line 1683
    .line 1684
    const/4 v3, 0x1

    .line 1685
    goto :goto_27

    .line 1686
    :cond_55
    const/4 v3, 0x0

    .line 1687
    :goto_27
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 1688
    .line 1689
    .line 1690
    new-instance v3, Lp4/s;

    .line 1691
    .line 1692
    iget-wide v4, v1, Ll6/m;->m:J

    .line 1693
    .line 1694
    long-to-int v5, v4

    .line 1695
    invoke-direct {v3, v5}, Lp4/s;-><init>(I)V

    .line 1696
    .line 1697
    .line 1698
    iget-object v4, v7, Lp4/s;->a:[B

    .line 1699
    .line 1700
    iget-object v5, v3, Lp4/s;->a:[B

    .line 1701
    .line 1702
    const/4 v14, 0x0

    .line 1703
    const/16 v15, 0x8

    .line 1704
    .line 1705
    invoke-static {v4, v14, v5, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1706
    .line 1707
    .line 1708
    iput-object v3, v1, Ll6/m;->o:Lp4/s;

    .line 1709
    .line 1710
    const/4 v3, 0x1

    .line 1711
    iput v3, v1, Ll6/m;->k:I

    .line 1712
    .line 1713
    goto :goto_29

    .line 1714
    :goto_28
    invoke-interface {v0}, Lr5/o;->getPosition()J

    .line 1715
    .line 1716
    .line 1717
    move-result-wide v6

    .line 1718
    iget-wide v11, v1, Ll6/m;->m:J

    .line 1719
    .line 1720
    add-long/2addr v6, v11

    .line 1721
    iget v4, v1, Ll6/m;->n:I

    .line 1722
    .line 1723
    int-to-long v3, v4

    .line 1724
    sub-long/2addr v6, v3

    .line 1725
    cmp-long v13, v11, v3

    .line 1726
    .line 1727
    if-eqz v13, :cond_57

    .line 1728
    .line 1729
    iget v3, v1, Ll6/m;->l:I

    .line 1730
    .line 1731
    if-ne v3, v10, :cond_57

    .line 1732
    .line 1733
    const/16 v15, 0x8

    .line 1734
    .line 1735
    invoke-virtual {v8, v15}, Lp4/s;->D(I)V

    .line 1736
    .line 1737
    .line 1738
    iget-object v3, v8, Lp4/s;->a:[B

    .line 1739
    .line 1740
    const/4 v14, 0x0

    .line 1741
    invoke-interface {v0, v3, v14, v15}, Lr5/o;->z([BII)V

    .line 1742
    .line 1743
    .line 1744
    sget-object v3, Ll6/e;->a:[B

    .line 1745
    .line 1746
    iget v3, v8, Lp4/s;->b:I

    .line 1747
    .line 1748
    const/4 v4, 0x4

    .line 1749
    invoke-virtual {v8, v4}, Lp4/s;->H(I)V

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v8}, Lp4/s;->g()I

    .line 1753
    .line 1754
    .line 1755
    move-result v4

    .line 1756
    if-eq v4, v9, :cond_56

    .line 1757
    .line 1758
    add-int/lit8 v3, v3, 0x4

    .line 1759
    .line 1760
    :cond_56
    invoke-virtual {v8, v3}, Lp4/s;->G(I)V

    .line 1761
    .line 1762
    .line 1763
    iget v3, v8, Lp4/s;->b:I

    .line 1764
    .line 1765
    invoke-interface {v0, v3}, Lr5/o;->r(I)V

    .line 1766
    .line 1767
    .line 1768
    invoke-interface {v0}, Lr5/o;->q()V

    .line 1769
    .line 1770
    .line 1771
    :cond_57
    new-instance v3, Lq4/b;

    .line 1772
    .line 1773
    iget v4, v1, Ll6/m;->l:I

    .line 1774
    .line 1775
    invoke-direct {v3, v4, v6, v7}, Lq4/b;-><init>(IJ)V

    .line 1776
    .line 1777
    .line 1778
    invoke-virtual {v5, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1779
    .line 1780
    .line 1781
    iget-wide v3, v1, Ll6/m;->m:J

    .line 1782
    .line 1783
    iget v5, v1, Ll6/m;->n:I

    .line 1784
    .line 1785
    int-to-long v8, v5

    .line 1786
    cmp-long v5, v3, v8

    .line 1787
    .line 1788
    if-nez v5, :cond_58

    .line 1789
    .line 1790
    invoke-virtual {v1, v6, v7}, Ll6/m;->n(J)V

    .line 1791
    .line 1792
    .line 1793
    goto :goto_29

    .line 1794
    :cond_58
    const/4 v14, 0x0

    .line 1795
    iput v14, v1, Ll6/m;->k:I

    .line 1796
    .line 1797
    iput v14, v1, Ll6/m;->n:I

    .line 1798
    .line 1799
    :goto_29
    const/4 v9, 0x1

    .line 1800
    :goto_2a
    if-nez v9, :cond_0

    .line 1801
    .line 1802
    goto/16 :goto_11

    .line 1803
    .line 1804
    :goto_2b
    return v23

    .line 1805
    :cond_59
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1806
    .line 1807
    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    throw v0

    .line 1812
    nop

    .line 1813
    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch

    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
    .line 3777
    .line 3778
    .line 3779
    .line 3780
    .line 3781
    .line 3782
    .line 3783
    .line 3784
    .line 3785
    .line 3786
    .line 3787
    .line 3788
    .line 3789
    .line 3790
    .line 3791
    .line 3792
    .line 3793
    .line 3794
    .line 3795
    .line 3796
    .line 3797
    .line 3798
    .line 3799
    .line 3800
    .line 3801
    .line 3802
    .line 3803
    .line 3804
    .line 3805
    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    .line 3866
    .line 3867
    .line 3868
    .line 3869
    .line 3870
    .line 3871
    .line 3872
    .line 3873
    .line 3874
    .line 3875
    .line 3876
    .line 3877
    .line 3878
    .line 3879
    .line 3880
    .line 3881
    .line 3882
    .line 3883
    .line 3884
    .line 3885
    .line 3886
    .line 3887
    .line 3888
    .line 3889
    .line 3890
    .line 3891
    .line 3892
    .line 3893
    .line 3894
    .line 3895
    .line 3896
    .line 3897
    .line 3898
    .line 3899
    .line 3900
    .line 3901
    .line 3902
    .line 3903
    .line 3904
    .line 3905
    .line 3906
    .line 3907
    .line 3908
    .line 3909
    .line 3910
    .line 3911
    .line 3912
    .line 3913
    .line 3914
    .line 3915
    .line 3916
    .line 3917
    .line 3918
    .line 3919
    .line 3920
    .line 3921
    .line 3922
    .line 3923
    .line 3924
    .line 3925
    .line 3926
    .line 3927
    .line 3928
    .line 3929
    .line 3930
    .line 3931
    .line 3932
    .line 3933
    .line 3934
    .line 3935
    .line 3936
    .line 3937
    .line 3938
    .line 3939
    .line 3940
    .line 3941
    .line 3942
    .line 3943
    .line 3944
    .line 3945
    .line 3946
    .line 3947
    .line 3948
    .line 3949
    .line 3950
    .line 3951
    .line 3952
    .line 3953
    .line 3954
    .line 3955
    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    .line 3961
    .line 3962
    .line 3963
    .line 3964
    .line 3965
    .line 3966
    .line 3967
    .line 3968
    .line 3969
    .line 3970
    .line 3971
    .line 3972
    .line 3973
    .line 3974
    .line 3975
    .line 3976
    .line 3977
    .line 3978
    .line 3979
    .line 3980
    .line 3981
    .line 3982
    .line 3983
    .line 3984
    .line 3985
    .line 3986
    .line 3987
    .line 3988
    .line 3989
    .line 3990
    .line 3991
    .line 3992
    .line 3993
    .line 3994
    .line 3995
    .line 3996
    .line 3997
    .line 3998
    .line 3999
    .line 4000
    .line 4001
    .line 4002
    .line 4003
    .line 4004
    .line 4005
    .line 4006
    .line 4007
    .line 4008
    .line 4009
    .line 4010
    .line 4011
    .line 4012
    .line 4013
    .line 4014
    .line 4015
    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
.end method

.method public final h(Lr5/q;)V
    .locals 2

    .line 1
    iget v0, p0, Ll6/m;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lb5/d0;

    .line 8
    .line 9
    iget-object v1, p0, Ll6/m;->a:Lo6/j;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lb5/d0;-><init>(Lr5/q;Lo6/j;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Ll6/m;->z:Lr5/q;

    .line 16
    .line 17
    return-void
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

.method public final i(JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Ll6/m;->g:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Ll6/m;->n:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Ll6/m;->p:I

    .line 11
    .line 12
    iput v0, p0, Ll6/m;->q:I

    .line 13
    .line 14
    iput v0, p0, Ll6/m;->r:I

    .line 15
    .line 16
    iput v0, p0, Ll6/m;->s:I

    .line 17
    .line 18
    iput-boolean v0, p0, Ll6/m;->t:Z

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long v4, p1, v2

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    iget p1, p0, Ll6/m;->k:I

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    if-eq p1, p2, :cond_0

    .line 30
    .line 31
    iput v0, p0, Ll6/m;->k:I

    .line 32
    .line 33
    iput v0, p0, Ll6/m;->n:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object p1, p0, Ll6/m;->h:Ll6/o;

    .line 37
    .line 38
    iget-object p2, p1, Ll6/o;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 41
    .line 42
    .line 43
    iput v0, p1, Ll6/o;->b:I

    .line 44
    .line 45
    iget-object p1, p0, Ll6/m;->i:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    iget-object p1, p0, Ll6/m;->A:[Ll6/l;

    .line 52
    .line 53
    array-length p2, p1

    .line 54
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-ge v2, p2, :cond_6

    .line 56
    .line 57
    aget-object v3, p1, v2

    .line 58
    .line 59
    iget-object v4, v3, Ll6/l;->b:Ll6/t;

    .line 60
    .line 61
    iget-object v5, v4, Ll6/t;->f:[J

    .line 62
    .line 63
    invoke-static {v5, p3, p4, v0}, Lp4/c0;->e([JJZ)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    :goto_1
    if-ltz v5, :cond_3

    .line 68
    .line 69
    iget-object v6, v4, Ll6/t;->g:[I

    .line 70
    .line 71
    aget v6, v6, v5

    .line 72
    .line 73
    and-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    add-int/lit8 v5, v5, -0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const/4 v5, -0x1

    .line 82
    :goto_2
    if-ne v5, v1, :cond_4

    .line 83
    .line 84
    invoke-virtual {v4, p3, p4}, Ll6/t;->a(J)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    :cond_4
    iput v5, v3, Ll6/l;->e:I

    .line 89
    .line 90
    iget-object v3, v3, Ll6/l;->d:Lr5/i0;

    .line 91
    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    iput-boolean v0, v3, Lr5/i0;->b:Z

    .line 95
    .line 96
    iput v0, v3, Lr5/i0;->c:I

    .line 97
    .line 98
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_6
    return-void
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

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll6/m;->j:Lya/a1;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final k(J)Lr5/a0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Ll6/m;->A:[Ll6/l;

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    sget-object v5, Lr5/c0;->c:Lr5/c0;

    .line 9
    .line 10
    if-nez v4, :cond_0

    .line 11
    .line 12
    new-instance v1, Lr5/a0;

    .line 13
    .line 14
    invoke-direct {v1, v5, v5}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    iget v4, v0, Ll6/m;->C:I

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v9, -0x1

    .line 22
    const-wide/16 v10, -0x1

    .line 23
    .line 24
    if-eq v4, v9, :cond_5

    .line 25
    .line 26
    aget-object v3, v3, v4

    .line 27
    .line 28
    iget-object v3, v3, Ll6/l;->b:Ll6/t;

    .line 29
    .line 30
    iget-object v4, v3, Ll6/t;->f:[J

    .line 31
    .line 32
    invoke-static {v4, v1, v2, v6}, Lp4/c0;->e([JJZ)I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    :goto_0
    if-ltz v12, :cond_2

    .line 37
    .line 38
    iget-object v13, v3, Ll6/t;->g:[I

    .line 39
    .line 40
    aget v13, v13, v12

    .line 41
    .line 42
    and-int/lit8 v13, v13, 0x1

    .line 43
    .line 44
    if-eqz v13, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    add-int/lit8 v12, v12, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v12, -0x1

    .line 51
    :goto_1
    if-ne v12, v9, :cond_3

    .line 52
    .line 53
    invoke-virtual {v3, v1, v2}, Ll6/t;->a(J)I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    :cond_3
    iget-object v13, v3, Ll6/t;->c:[J

    .line 58
    .line 59
    if-ne v12, v9, :cond_4

    .line 60
    .line 61
    new-instance v1, Lr5/a0;

    .line 62
    .line 63
    invoke-direct {v1, v5, v5}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_4
    aget-wide v14, v4, v12

    .line 68
    .line 69
    aget-wide v16, v13, v12

    .line 70
    .line 71
    cmp-long v5, v14, v1

    .line 72
    .line 73
    if-gez v5, :cond_6

    .line 74
    .line 75
    iget v5, v3, Ll6/t;->b:I

    .line 76
    .line 77
    add-int/lit8 v5, v5, -0x1

    .line 78
    .line 79
    if-ge v12, v5, :cond_6

    .line 80
    .line 81
    invoke-virtual {v3, v1, v2}, Ll6/t;->a(J)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eq v1, v9, :cond_6

    .line 86
    .line 87
    if-eq v1, v12, :cond_6

    .line 88
    .line 89
    aget-wide v2, v4, v1

    .line 90
    .line 91
    aget-wide v10, v13, v1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    const-wide v16, 0x7fffffffffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    move-wide v14, v1

    .line 100
    :cond_6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    :goto_2
    move-wide/from16 v4, v16

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    :goto_3
    iget-object v12, v0, Ll6/m;->A:[Ll6/l;

    .line 109
    .line 110
    array-length v13, v12

    .line 111
    if-ge v1, v13, :cond_11

    .line 112
    .line 113
    iget v13, v0, Ll6/m;->C:I

    .line 114
    .line 115
    if-eq v1, v13, :cond_10

    .line 116
    .line 117
    aget-object v12, v12, v1

    .line 118
    .line 119
    iget-object v12, v12, Ll6/l;->b:Ll6/t;

    .line 120
    .line 121
    iget-object v13, v12, Ll6/t;->c:[J

    .line 122
    .line 123
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    iget-object v7, v12, Ll6/t;->g:[I

    .line 129
    .line 130
    iget-object v8, v12, Ll6/t;->f:[J

    .line 131
    .line 132
    invoke-static {v8, v14, v15, v6}, Lp4/c0;->e([JJZ)I

    .line 133
    .line 134
    .line 135
    move-result v18

    .line 136
    :goto_4
    if-ltz v18, :cond_8

    .line 137
    .line 138
    aget v19, v7, v18

    .line 139
    .line 140
    and-int/lit8 v19, v19, 0x1

    .line 141
    .line 142
    if-eqz v19, :cond_7

    .line 143
    .line 144
    move/from16 v6, v18

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    add-int/lit8 v18, v18, -0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    const/4 v6, -0x1

    .line 151
    :goto_5
    if-ne v6, v9, :cond_9

    .line 152
    .line 153
    invoke-virtual {v12, v14, v15}, Ll6/t;->a(J)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    :cond_9
    if-ne v6, v9, :cond_a

    .line 158
    .line 159
    move-wide/from16 p1, v10

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_a
    move-wide/from16 p1, v10

    .line 163
    .line 164
    aget-wide v9, v13, v6

    .line 165
    .line 166
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 167
    .line 168
    .line 169
    move-result-wide v4

    .line 170
    :goto_6
    cmp-long v6, v2, v16

    .line 171
    .line 172
    if-eqz v6, :cond_f

    .line 173
    .line 174
    const/4 v6, 0x0

    .line 175
    invoke-static {v8, v2, v3, v6}, Lp4/c0;->e([JJZ)I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    :goto_7
    if-ltz v8, :cond_c

    .line 180
    .line 181
    aget v9, v7, v8

    .line 182
    .line 183
    and-int/lit8 v9, v9, 0x1

    .line 184
    .line 185
    if-eqz v9, :cond_b

    .line 186
    .line 187
    :goto_8
    const/4 v7, -0x1

    .line 188
    goto :goto_9

    .line 189
    :cond_b
    add-int/lit8 v8, v8, -0x1

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_c
    const/4 v8, -0x1

    .line 193
    goto :goto_8

    .line 194
    :goto_9
    if-ne v8, v7, :cond_d

    .line 195
    .line 196
    invoke-virtual {v12, v2, v3}, Ll6/t;->a(J)I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    :cond_d
    if-ne v8, v7, :cond_e

    .line 201
    .line 202
    move-wide/from16 v10, p1

    .line 203
    .line 204
    goto :goto_a

    .line 205
    :cond_e
    aget-wide v8, v13, v8

    .line 206
    .line 207
    move-wide/from16 v10, p1

    .line 208
    .line 209
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 210
    .line 211
    .line 212
    move-result-wide v10

    .line 213
    goto :goto_a

    .line 214
    :cond_f
    move-wide/from16 v10, p1

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    const/4 v7, -0x1

    .line 218
    goto :goto_a

    .line 219
    :cond_10
    const/4 v7, -0x1

    .line 220
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :goto_a
    add-int/lit8 v1, v1, 0x1

    .line 226
    .line 227
    const/4 v9, -0x1

    .line 228
    goto :goto_3

    .line 229
    :cond_11
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    new-instance v1, Lr5/c0;

    .line 235
    .line 236
    invoke-direct {v1, v14, v15, v4, v5}, Lr5/c0;-><init>(JJ)V

    .line 237
    .line 238
    .line 239
    cmp-long v4, v2, v16

    .line 240
    .line 241
    if-nez v4, :cond_12

    .line 242
    .line 243
    new-instance v2, Lr5/a0;

    .line 244
    .line 245
    invoke-direct {v2, v1, v1}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 246
    .line 247
    .line 248
    return-object v2

    .line 249
    :cond_12
    new-instance v4, Lr5/c0;

    .line 250
    .line 251
    invoke-direct {v4, v2, v3, v10, v11}, Lr5/c0;-><init>(JJ)V

    .line 252
    .line 253
    .line 254
    new-instance v2, Lr5/a0;

    .line 255
    .line 256
    invoke-direct {v2, v1, v4}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 257
    .line 258
    .line 259
    return-object v2
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

.method public final m()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll6/m;->D:J

    .line 2
    .line 3
    return-wide v0
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
.end method

.method public final n(J)V
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v0, v1, Ll6/m;->g:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_6f

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lq4/b;

    .line 17
    .line 18
    iget-wide v5, v2, Lq4/b;->c:J

    .line 19
    .line 20
    cmp-long v2, v5, p1

    .line 21
    .line 22
    if-nez v2, :cond_6f

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v5, v2

    .line 29
    check-cast v5, Lq4/b;

    .line 30
    .line 31
    iget v2, v5, Lq4/d;->b:I

    .line 32
    .line 33
    const v6, 0x6d6f6f76

    .line 34
    .line 35
    .line 36
    if-ne v2, v6, :cond_6e

    .line 37
    .line 38
    const v2, 0x6d657461

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v2}, Lq4/b;->h(I)Lq4/b;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    new-instance v7, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v14, 0x1

    .line 51
    const v8, 0x68646c72    # 4.3148E24f

    .line 52
    .line 53
    .line 54
    const/4 v9, 0x4

    .line 55
    const/16 v10, 0x10

    .line 56
    .line 57
    const v11, 0x64617461

    .line 58
    .line 59
    .line 60
    const/16 v12, 0xc

    .line 61
    .line 62
    const v15, 0x696c7374

    .line 63
    .line 64
    .line 65
    const-wide/16 v16, 0x0

    .line 66
    .line 67
    move-object/from16 v18, v7

    .line 68
    .line 69
    iget v7, v1, Ll6/m;->b:I

    .line 70
    .line 71
    const/16 v2, 0x8

    .line 72
    .line 73
    move/from16 v20, v7

    .line 74
    .line 75
    if-eqz v6, :cond_13

    .line 76
    .line 77
    sget-object v21, Ll6/e;->a:[B

    .line 78
    .line 79
    invoke-virtual {v6, v8}, Lq4/b;->i(I)Lq4/c;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const v8, 0x6b657973

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v8}, Lq4/b;->i(I)Lq4/c;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v6, v15}, Lq4/b;->i(I)Lq4/c;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v7, :cond_8

    .line 95
    .line 96
    if-eqz v8, :cond_8

    .line 97
    .line 98
    if-eqz v6, :cond_8

    .line 99
    .line 100
    iget-object v7, v7, Lq4/c;->c:Lp4/s;

    .line 101
    .line 102
    invoke-virtual {v7, v10}, Lp4/s;->G(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    const v10, 0x6d647461

    .line 110
    .line 111
    .line 112
    if-eq v7, v10, :cond_1

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_1
    iget-object v7, v8, Lq4/c;->c:Lp4/s;

    .line 117
    .line 118
    invoke-virtual {v7, v12}, Lp4/s;->G(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    new-array v10, v8, [Ljava/lang/String;

    .line 126
    .line 127
    const/4 v12, 0x0

    .line 128
    :goto_1
    if-ge v12, v8, :cond_2

    .line 129
    .line 130
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 131
    .line 132
    .line 133
    move-result v25

    .line 134
    invoke-virtual {v7, v9}, Lp4/s;->H(I)V

    .line 135
    .line 136
    .line 137
    add-int/lit8 v15, v25, -0x8

    .line 138
    .line 139
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 140
    .line 141
    invoke-virtual {v7, v15, v9}, Lp4/s;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    aput-object v9, v10, v12

    .line 146
    .line 147
    add-int/lit8 v12, v12, 0x1

    .line 148
    .line 149
    const/4 v9, 0x4

    .line 150
    const v15, 0x696c7374

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_2
    iget-object v6, v6, Lq4/c;->c:Lp4/s;

    .line 155
    .line 156
    invoke-virtual {v6, v2}, Lp4/s;->G(I)V

    .line 157
    .line 158
    .line 159
    new-instance v7, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    :goto_2
    invoke-virtual {v6}, Lp4/s;->a()I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-le v9, v2, :cond_7

    .line 169
    .line 170
    iget v9, v6, Lp4/s;->b:I

    .line 171
    .line 172
    invoke-virtual {v6}, Lp4/s;->g()I

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    invoke-virtual {v6}, Lp4/s;->g()I

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    sub-int/2addr v15, v14

    .line 181
    if-ltz v15, :cond_5

    .line 182
    .line 183
    if-ge v15, v8, :cond_5

    .line 184
    .line 185
    aget-object v15, v10, v15

    .line 186
    .line 187
    add-int v2, v9, v12

    .line 188
    .line 189
    :goto_3
    iget v13, v6, Lp4/s;->b:I

    .line 190
    .line 191
    if-ge v13, v2, :cond_4

    .line 192
    .line 193
    invoke-virtual {v6}, Lp4/s;->g()I

    .line 194
    .line 195
    .line 196
    move-result v28

    .line 197
    invoke-virtual {v6}, Lp4/s;->g()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-ne v4, v11, :cond_3

    .line 202
    .line 203
    invoke-virtual {v6}, Lp4/s;->g()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    invoke-virtual {v6}, Lp4/s;->g()I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    add-int/lit8 v13, v28, -0x10

    .line 212
    .line 213
    new-array v11, v13, [B

    .line 214
    .line 215
    invoke-virtual {v6, v11, v3, v13}, Lp4/s;->e([BII)V

    .line 216
    .line 217
    .line 218
    new-instance v13, Lq4/a;

    .line 219
    .line 220
    invoke-direct {v13, v15, v11, v4, v2}, Lq4/a;-><init>(Ljava/lang/String;[BII)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_3
    add-int v13, v13, v28

    .line 225
    .line 226
    invoke-virtual {v6, v13}, Lp4/s;->G(I)V

    .line 227
    .line 228
    .line 229
    const v11, 0x64617461

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_4
    const/4 v13, 0x0

    .line 234
    :goto_4
    if-eqz v13, :cond_6

    .line 235
    .line 236
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_5
    const-string v2, "BoxParsers"

    .line 241
    .line 242
    const-string v4, "Skipped metadata with unknown key index: "

    .line 243
    .line 244
    invoke-static {v15, v4, v2}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :cond_6
    :goto_5
    add-int/2addr v9, v12

    .line 248
    invoke-virtual {v6, v9}, Lp4/s;->G(I)V

    .line 249
    .line 250
    .line 251
    const/16 v2, 0x8

    .line 252
    .line 253
    const v11, 0x64617461

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_9

    .line 262
    .line 263
    :cond_8
    :goto_6
    const/4 v2, 0x0

    .line 264
    goto :goto_7

    .line 265
    :cond_9
    new-instance v2, Lm4/n0;

    .line 266
    .line 267
    invoke-direct {v2, v7}, Lm4/n0;-><init>(Ljava/util/List;)V

    .line 268
    .line 269
    .line 270
    :goto_7
    iget-boolean v4, v1, Ll6/m;->x:Z

    .line 271
    .line 272
    if-eqz v4, :cond_10

    .line 273
    .line 274
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    const-string v4, "auxiliary.tracks.interleaved"

    .line 278
    .line 279
    invoke-static {v2, v4}, Ll6/p;->b(Lm4/n0;Ljava/lang/String;)Lq4/a;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    if-eqz v4, :cond_a

    .line 284
    .line 285
    iget-object v4, v4, Lq4/a;->b:[B

    .line 286
    .line 287
    aget-byte v4, v4, v3

    .line 288
    .line 289
    if-nez v4, :cond_a

    .line 290
    .line 291
    iget-wide v6, v1, Ll6/m;->w:J

    .line 292
    .line 293
    const-wide/16 v8, 0x10

    .line 294
    .line 295
    add-long/2addr v6, v8

    .line 296
    iput-wide v6, v1, Ll6/m;->y:J

    .line 297
    .line 298
    :cond_a
    const-string v4, "auxiliary.tracks.map"

    .line 299
    .line 300
    invoke-static {v2, v4}, Ll6/p;->b(Lm4/n0;Ljava/lang/String;)Lq4/a;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-static {v4}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4}, Lq4/a;->d()Ljava/util/ArrayList;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    new-instance v7, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 318
    .line 319
    .line 320
    const/4 v6, 0x0

    .line 321
    :goto_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    if-ge v6, v8, :cond_f

    .line 326
    .line 327
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    check-cast v8, Ljava/lang/Integer;

    .line 332
    .line 333
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-eqz v8, :cond_e

    .line 338
    .line 339
    if-eq v8, v14, :cond_d

    .line 340
    .line 341
    const/4 v9, 0x2

    .line 342
    if-eq v8, v9, :cond_c

    .line 343
    .line 344
    const/4 v9, 0x3

    .line 345
    if-eq v8, v9, :cond_b

    .line 346
    .line 347
    const/4 v8, 0x0

    .line 348
    goto :goto_9

    .line 349
    :cond_b
    const/4 v8, 0x4

    .line 350
    goto :goto_9

    .line 351
    :cond_c
    const/4 v8, 0x3

    .line 352
    goto :goto_9

    .line 353
    :cond_d
    const/4 v8, 0x2

    .line 354
    goto :goto_9

    .line 355
    :cond_e
    const/4 v8, 0x1

    .line 356
    :goto_9
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    add-int/lit8 v6, v6, 0x1

    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_f
    move-object v4, v7

    .line 367
    goto :goto_b

    .line 368
    :cond_10
    if-nez v2, :cond_11

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_11
    and-int/lit8 v4, v20, 0x40

    .line 372
    .line 373
    if-eqz v4, :cond_12

    .line 374
    .line 375
    const-string v4, "auxiliary.tracks.offset"

    .line 376
    .line 377
    invoke-static {v2, v4}, Ll6/p;->b(Lm4/n0;Ljava/lang/String;)Lq4/a;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    if-eqz v4, :cond_12

    .line 382
    .line 383
    new-instance v6, Lp4/s;

    .line 384
    .line 385
    iget-object v4, v4, Lq4/a;->b:[B

    .line 386
    .line 387
    invoke-direct {v6, v4}, Lp4/s;-><init>([B)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6}, Lp4/s;->z()J

    .line 391
    .line 392
    .line 393
    move-result-wide v6

    .line 394
    cmp-long v4, v6, v16

    .line 395
    .line 396
    if-lez v4, :cond_12

    .line 397
    .line 398
    iput-wide v6, v1, Ll6/m;->w:J

    .line 399
    .line 400
    iput-boolean v14, v1, Ll6/m;->v:Z

    .line 401
    .line 402
    move-object/from16 v32, v0

    .line 403
    .line 404
    goto/16 :goto_3c

    .line 405
    .line 406
    :cond_12
    :goto_a
    move-object/from16 v4, v18

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_13
    move-object/from16 v4, v18

    .line 410
    .line 411
    const/4 v2, 0x0

    .line 412
    :goto_b
    new-instance v13, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 415
    .line 416
    .line 417
    iget v6, v1, Ll6/m;->E:I

    .line 418
    .line 419
    if-ne v6, v14, :cond_14

    .line 420
    .line 421
    const/4 v11, 0x1

    .line 422
    goto :goto_c

    .line 423
    :cond_14
    const/4 v11, 0x0

    .line 424
    :goto_c
    new-instance v6, Lr5/v;

    .line 425
    .line 426
    invoke-direct {v6}, Lr5/v;-><init>()V

    .line 427
    .line 428
    .line 429
    const v7, 0x75647461

    .line 430
    .line 431
    .line 432
    invoke-virtual {v5, v7}, Lq4/b;->i(I)Lq4/c;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    if-eqz v7, :cond_52

    .line 437
    .line 438
    sget-object v8, Ll6/e;->a:[B

    .line 439
    .line 440
    iget-object v7, v7, Lq4/c;->c:Lp4/s;

    .line 441
    .line 442
    const/16 v8, 0x8

    .line 443
    .line 444
    invoke-virtual {v7, v8}, Lp4/s;->G(I)V

    .line 445
    .line 446
    .line 447
    new-instance v9, Lm4/n0;

    .line 448
    .line 449
    new-array v10, v3, [Lm4/m0;

    .line 450
    .line 451
    invoke-direct {v9, v10}, Lm4/n0;-><init>([Lm4/m0;)V

    .line 452
    .line 453
    .line 454
    :goto_d
    invoke-virtual {v7}, Lp4/s;->a()I

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    if-lt v10, v8, :cond_51

    .line 459
    .line 460
    iget v10, v7, Lp4/s;->b:I

    .line 461
    .line 462
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 463
    .line 464
    .line 465
    move-result v12

    .line 466
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 467
    .line 468
    .line 469
    move-result v15

    .line 470
    const v3, 0x6d657461

    .line 471
    .line 472
    .line 473
    if-ne v15, v3, :cond_40

    .line 474
    .line 475
    invoke-virtual {v7, v10}, Lp4/s;->G(I)V

    .line 476
    .line 477
    .line 478
    add-int v15, v10, v12

    .line 479
    .line 480
    invoke-virtual {v7, v8}, Lp4/s;->H(I)V

    .line 481
    .line 482
    .line 483
    iget v8, v7, Lp4/s;->b:I

    .line 484
    .line 485
    const/4 v3, 0x4

    .line 486
    invoke-virtual {v7, v3}, Lp4/s;->H(I)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    const v14, 0x68646c72    # 4.3148E24f

    .line 494
    .line 495
    .line 496
    const/16 v31, 0x1

    .line 497
    .line 498
    if-eq v3, v14, :cond_15

    .line 499
    .line 500
    add-int/lit8 v8, v8, 0x4

    .line 501
    .line 502
    :cond_15
    invoke-virtual {v7, v8}, Lp4/s;->G(I)V

    .line 503
    .line 504
    .line 505
    :goto_e
    iget v3, v7, Lp4/s;->b:I

    .line 506
    .line 507
    if-ge v3, v15, :cond_3f

    .line 508
    .line 509
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 514
    .line 515
    .line 516
    move-result v14

    .line 517
    move-object/from16 v32, v0

    .line 518
    .line 519
    const v0, 0x696c7374

    .line 520
    .line 521
    .line 522
    if-ne v14, v0, :cond_3e

    .line 523
    .line 524
    invoke-virtual {v7, v3}, Lp4/s;->G(I)V

    .line 525
    .line 526
    .line 527
    add-int/2addr v3, v8

    .line 528
    const/16 v8, 0x8

    .line 529
    .line 530
    invoke-virtual {v7, v8}, Lp4/s;->H(I)V

    .line 531
    .line 532
    .line 533
    new-instance v8, Ljava/util/ArrayList;

    .line 534
    .line 535
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 536
    .line 537
    .line 538
    :goto_f
    iget v14, v7, Lp4/s;->b:I

    .line 539
    .line 540
    if-ge v14, v3, :cond_3c

    .line 541
    .line 542
    const-string v15, "Skipped unknown metadata entry: "

    .line 543
    .line 544
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 545
    .line 546
    .line 547
    move-result v26

    .line 548
    add-int v14, v26, v14

    .line 549
    .line 550
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    move/from16 v33, v3

    .line 555
    .line 556
    shr-int/lit8 v3, v0, 0x18

    .line 557
    .line 558
    and-int/lit16 v3, v3, 0xff

    .line 559
    .line 560
    move/from16 v34, v11

    .line 561
    .line 562
    const/16 v11, 0xa9

    .line 563
    .line 564
    move/from16 v35, v12

    .line 565
    .line 566
    const-string v12, "MetadataUtil"

    .line 567
    .line 568
    move-object/from16 v36, v13

    .line 569
    .line 570
    const-string v13, "TCON"

    .line 571
    .line 572
    if-eq v3, v11, :cond_16

    .line 573
    .line 574
    const/16 v11, 0xfd

    .line 575
    .line 576
    if-ne v3, v11, :cond_17

    .line 577
    .line 578
    :cond_16
    const v3, 0x64617461

    .line 579
    .line 580
    .line 581
    goto/16 :goto_16

    .line 582
    .line 583
    :cond_17
    const v3, 0x676e7265

    .line 584
    .line 585
    .line 586
    if-ne v0, v3, :cond_19

    .line 587
    .line 588
    :try_start_0
    invoke-static {v7}, Ll6/p;->h(Lp4/s;)I

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    add-int/lit8 v0, v0, -0x1

    .line 593
    .line 594
    invoke-static {v0}, Lf6/j;->a(I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    if-eqz v0, :cond_18

    .line 599
    .line 600
    new-instance v3, Lf6/n;

    .line 601
    .line 602
    invoke-static {v0}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    const/4 v11, 0x0

    .line 607
    invoke-direct {v3, v13, v11, v0}, Lf6/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lya/a1;)V

    .line 608
    .line 609
    .line 610
    goto :goto_10

    .line 611
    :cond_18
    const/4 v11, 0x0

    .line 612
    const-string v0, "Failed to parse standard genre code"

    .line 613
    .line 614
    invoke-static {v12, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 615
    .line 616
    .line 617
    move-object v3, v11

    .line 618
    :goto_10
    invoke-virtual {v7, v14}, Lp4/s;->G(I)V

    .line 619
    .line 620
    .line 621
    goto/16 :goto_19

    .line 622
    .line 623
    :cond_19
    const/4 v11, 0x0

    .line 624
    const v3, 0x6469736b

    .line 625
    .line 626
    .line 627
    if-ne v0, v3, :cond_1a

    .line 628
    .line 629
    :try_start_1
    const-string v3, "TPOS"

    .line 630
    .line 631
    invoke-static {v0, v3, v7}, Ll6/p;->g(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    goto :goto_10

    .line 636
    :catchall_0
    move-exception v0

    .line 637
    goto/16 :goto_1a

    .line 638
    .line 639
    :cond_1a
    const v3, 0x74726b6e

    .line 640
    .line 641
    .line 642
    if-ne v0, v3, :cond_1b

    .line 643
    .line 644
    const-string v3, "TRCK"

    .line 645
    .line 646
    invoke-static {v0, v3, v7}, Ll6/p;->g(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    goto :goto_10

    .line 651
    :cond_1b
    const v3, 0x746d706f

    .line 652
    .line 653
    .line 654
    if-ne v0, v3, :cond_1c

    .line 655
    .line 656
    const-string v3, "TBPM"

    .line 657
    .line 658
    const/4 v12, 0x1

    .line 659
    const/4 v13, 0x0

    .line 660
    invoke-static {v0, v3, v7, v12, v13}, Ll6/p;->i(ILjava/lang/String;Lp4/s;ZZ)Lf6/i;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    goto :goto_10

    .line 665
    :cond_1c
    const v3, 0x6370696c

    .line 666
    .line 667
    .line 668
    if-ne v0, v3, :cond_1d

    .line 669
    .line 670
    const-string v3, "TCMP"

    .line 671
    .line 672
    const/4 v12, 0x1

    .line 673
    invoke-static {v0, v3, v7, v12, v12}, Ll6/p;->i(ILjava/lang/String;Lp4/s;ZZ)Lf6/i;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    goto :goto_10

    .line 678
    :cond_1d
    const v3, 0x636f7672

    .line 679
    .line 680
    .line 681
    if-ne v0, v3, :cond_1e

    .line 682
    .line 683
    invoke-static {v7}, Ll6/p;->f(Lp4/s;)Lf6/a;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    goto :goto_10

    .line 688
    :cond_1e
    const v3, 0x61415254

    .line 689
    .line 690
    .line 691
    if-ne v0, v3, :cond_1f

    .line 692
    .line 693
    const-string v3, "TPE2"

    .line 694
    .line 695
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 696
    .line 697
    .line 698
    move-result-object v3

    .line 699
    goto :goto_10

    .line 700
    :cond_1f
    const v3, 0x736f6e6d

    .line 701
    .line 702
    .line 703
    if-ne v0, v3, :cond_20

    .line 704
    .line 705
    const-string v3, "TSOT"

    .line 706
    .line 707
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    goto :goto_10

    .line 712
    :cond_20
    const v3, 0x736f616c

    .line 713
    .line 714
    .line 715
    if-ne v0, v3, :cond_21

    .line 716
    .line 717
    const-string v3, "TSOA"

    .line 718
    .line 719
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    goto :goto_10

    .line 724
    :cond_21
    const v3, 0x736f6172

    .line 725
    .line 726
    .line 727
    if-ne v0, v3, :cond_22

    .line 728
    .line 729
    const-string v3, "TSOP"

    .line 730
    .line 731
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    goto :goto_10

    .line 736
    :cond_22
    const v3, 0x736f6161

    .line 737
    .line 738
    .line 739
    if-ne v0, v3, :cond_23

    .line 740
    .line 741
    const-string v3, "TSO2"

    .line 742
    .line 743
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    goto/16 :goto_10

    .line 748
    .line 749
    :cond_23
    const v3, 0x736f636f

    .line 750
    .line 751
    .line 752
    if-ne v0, v3, :cond_24

    .line 753
    .line 754
    const-string v3, "TSOC"

    .line 755
    .line 756
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 757
    .line 758
    .line 759
    move-result-object v3

    .line 760
    goto/16 :goto_10

    .line 761
    .line 762
    :cond_24
    const v3, 0x72746e67

    .line 763
    .line 764
    .line 765
    if-ne v0, v3, :cond_25

    .line 766
    .line 767
    const-string v3, "ITUNESADVISORY"

    .line 768
    .line 769
    const/4 v13, 0x0

    .line 770
    invoke-static {v0, v3, v7, v13, v13}, Ll6/p;->i(ILjava/lang/String;Lp4/s;ZZ)Lf6/i;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    goto/16 :goto_10

    .line 775
    .line 776
    :cond_25
    const v3, 0x70676170

    .line 777
    .line 778
    .line 779
    if-ne v0, v3, :cond_26

    .line 780
    .line 781
    const-string v3, "ITUNESGAPLESS"

    .line 782
    .line 783
    const/4 v12, 0x1

    .line 784
    const/4 v13, 0x0

    .line 785
    invoke-static {v0, v3, v7, v13, v12}, Ll6/p;->i(ILjava/lang/String;Lp4/s;ZZ)Lf6/i;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    goto/16 :goto_10

    .line 790
    .line 791
    :cond_26
    const v3, 0x736f736e

    .line 792
    .line 793
    .line 794
    if-ne v0, v3, :cond_27

    .line 795
    .line 796
    const-string v3, "TVSHOWSORT"

    .line 797
    .line 798
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    goto/16 :goto_10

    .line 803
    .line 804
    :cond_27
    const v3, 0x74767368

    .line 805
    .line 806
    .line 807
    if-ne v0, v3, :cond_28

    .line 808
    .line 809
    const-string v3, "TVSHOW"

    .line 810
    .line 811
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    goto/16 :goto_10

    .line 816
    .line 817
    :cond_28
    const v3, 0x2d2d2d2d

    .line 818
    .line 819
    .line 820
    if-ne v0, v3, :cond_38

    .line 821
    .line 822
    move-object v12, v11

    .line 823
    move-object v13, v12

    .line 824
    const/4 v0, -0x1

    .line 825
    const/4 v3, -0x1

    .line 826
    :goto_11
    iget v15, v7, Lp4/s;->b:I

    .line 827
    .line 828
    if-ge v15, v14, :cond_2c

    .line 829
    .line 830
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 831
    .line 832
    .line 833
    move-result v21

    .line 834
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 835
    .line 836
    .line 837
    move-result v11

    .line 838
    move/from16 v37, v3

    .line 839
    .line 840
    const/4 v3, 0x4

    .line 841
    invoke-virtual {v7, v3}, Lp4/s;->H(I)V

    .line 842
    .line 843
    .line 844
    const v3, 0x6d65616e

    .line 845
    .line 846
    .line 847
    if-ne v11, v3, :cond_29

    .line 848
    .line 849
    add-int/lit8 v3, v21, -0xc

    .line 850
    .line 851
    invoke-virtual {v7, v3}, Lp4/s;->q(I)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v12

    .line 855
    :goto_12
    const v3, 0x64617461

    .line 856
    .line 857
    .line 858
    goto :goto_13

    .line 859
    :cond_29
    const v3, 0x6e616d65

    .line 860
    .line 861
    .line 862
    if-ne v11, v3, :cond_2a

    .line 863
    .line 864
    add-int/lit8 v3, v21, -0xc

    .line 865
    .line 866
    invoke-virtual {v7, v3}, Lp4/s;->q(I)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v13

    .line 870
    goto :goto_12

    .line 871
    :cond_2a
    const v3, 0x64617461

    .line 872
    .line 873
    .line 874
    if-ne v11, v3, :cond_2b

    .line 875
    .line 876
    move v0, v15

    .line 877
    move/from16 v37, v21

    .line 878
    .line 879
    :cond_2b
    add-int/lit8 v11, v21, -0xc

    .line 880
    .line 881
    invoke-virtual {v7, v11}, Lp4/s;->H(I)V

    .line 882
    .line 883
    .line 884
    :goto_13
    move/from16 v3, v37

    .line 885
    .line 886
    const/4 v11, 0x0

    .line 887
    goto :goto_11

    .line 888
    :cond_2c
    move/from16 v37, v3

    .line 889
    .line 890
    const v3, 0x64617461

    .line 891
    .line 892
    .line 893
    if-eqz v12, :cond_2e

    .line 894
    .line 895
    if-eqz v13, :cond_2e

    .line 896
    .line 897
    const/4 v11, -0x1

    .line 898
    if-ne v0, v11, :cond_2d

    .line 899
    .line 900
    goto :goto_14

    .line 901
    :cond_2d
    invoke-virtual {v7, v0}, Lp4/s;->G(I)V

    .line 902
    .line 903
    .line 904
    const/16 v0, 0x10

    .line 905
    .line 906
    invoke-virtual {v7, v0}, Lp4/s;->H(I)V

    .line 907
    .line 908
    .line 909
    add-int/lit8 v0, v37, -0x10

    .line 910
    .line 911
    invoke-virtual {v7, v0}, Lp4/s;->q(I)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    new-instance v11, Lf6/k;

    .line 916
    .line 917
    invoke-direct {v11, v12, v13, v0}, Lf6/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 918
    .line 919
    .line 920
    goto :goto_15

    .line 921
    :cond_2e
    :goto_14
    const/4 v11, 0x0

    .line 922
    :goto_15
    invoke-virtual {v7, v14}, Lp4/s;->G(I)V

    .line 923
    .line 924
    .line 925
    move-object v3, v11

    .line 926
    goto/16 :goto_19

    .line 927
    .line 928
    :goto_16
    const v11, 0xffffff

    .line 929
    .line 930
    .line 931
    and-int/2addr v11, v0

    .line 932
    const v3, 0x636d74

    .line 933
    .line 934
    .line 935
    if-ne v11, v3, :cond_2f

    .line 936
    .line 937
    :try_start_2
    invoke-static {v0, v7}, Ll6/p;->e(ILp4/s;)Lf6/e;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    goto/16 :goto_10

    .line 942
    .line 943
    :cond_2f
    const v3, 0x6e616d

    .line 944
    .line 945
    .line 946
    if-eq v11, v3, :cond_3a

    .line 947
    .line 948
    const v3, 0x74726b

    .line 949
    .line 950
    .line 951
    if-ne v11, v3, :cond_30

    .line 952
    .line 953
    goto/16 :goto_18

    .line 954
    .line 955
    :cond_30
    const v3, 0x636f6d

    .line 956
    .line 957
    .line 958
    if-eq v11, v3, :cond_39

    .line 959
    .line 960
    const v3, 0x777274

    .line 961
    .line 962
    .line 963
    if-ne v11, v3, :cond_31

    .line 964
    .line 965
    goto/16 :goto_17

    .line 966
    .line 967
    :cond_31
    const v3, 0x646179

    .line 968
    .line 969
    .line 970
    if-ne v11, v3, :cond_32

    .line 971
    .line 972
    const-string v3, "TDRC"

    .line 973
    .line 974
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 975
    .line 976
    .line 977
    move-result-object v3

    .line 978
    goto/16 :goto_10

    .line 979
    .line 980
    :cond_32
    const v3, 0x415254

    .line 981
    .line 982
    .line 983
    if-ne v11, v3, :cond_33

    .line 984
    .line 985
    const-string v3, "TPE1"

    .line 986
    .line 987
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 988
    .line 989
    .line 990
    move-result-object v3

    .line 991
    goto/16 :goto_10

    .line 992
    .line 993
    :cond_33
    const v3, 0x746f6f

    .line 994
    .line 995
    .line 996
    if-ne v11, v3, :cond_34

    .line 997
    .line 998
    const-string v3, "TSSE"

    .line 999
    .line 1000
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v3

    .line 1004
    goto/16 :goto_10

    .line 1005
    .line 1006
    :cond_34
    const v3, 0x616c62

    .line 1007
    .line 1008
    .line 1009
    if-ne v11, v3, :cond_35

    .line 1010
    .line 1011
    const-string v3, "TALB"

    .line 1012
    .line 1013
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v3

    .line 1017
    goto/16 :goto_10

    .line 1018
    .line 1019
    :cond_35
    const v3, 0x6c7972

    .line 1020
    .line 1021
    .line 1022
    if-ne v11, v3, :cond_36

    .line 1023
    .line 1024
    const-string v3, "USLT"

    .line 1025
    .line 1026
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v3

    .line 1030
    goto/16 :goto_10

    .line 1031
    .line 1032
    :cond_36
    const v3, 0x67656e

    .line 1033
    .line 1034
    .line 1035
    if-ne v11, v3, :cond_37

    .line 1036
    .line 1037
    invoke-static {v0, v13, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v3

    .line 1041
    goto/16 :goto_10

    .line 1042
    .line 1043
    :cond_37
    const v3, 0x677270

    .line 1044
    .line 1045
    .line 1046
    if-ne v11, v3, :cond_38

    .line 1047
    .line 1048
    const-string v3, "TIT1"

    .line 1049
    .line 1050
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v3

    .line 1054
    goto/16 :goto_10

    .line 1055
    .line 1056
    :cond_38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    invoke-direct {v3, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-static {v0}, Lq4/d;->c(I)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    invoke-static {v12, v0}, Lp4/c;->l(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v7, v14}, Lp4/s;->G(I)V

    .line 1076
    .line 1077
    .line 1078
    const/4 v3, 0x0

    .line 1079
    goto :goto_19

    .line 1080
    :cond_39
    :goto_17
    :try_start_3
    const-string v3, "TCOM"

    .line 1081
    .line 1082
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v3

    .line 1086
    goto/16 :goto_10

    .line 1087
    .line 1088
    :cond_3a
    :goto_18
    const-string v3, "TIT2"

    .line 1089
    .line 1090
    invoke-static {v0, v3, v7}, Ll6/p;->l(ILjava/lang/String;Lp4/s;)Lf6/n;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1094
    goto/16 :goto_10

    .line 1095
    .line 1096
    :goto_19
    if-eqz v3, :cond_3b

    .line 1097
    .line 1098
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    :cond_3b
    move/from16 v3, v33

    .line 1102
    .line 1103
    move/from16 v11, v34

    .line 1104
    .line 1105
    move/from16 v12, v35

    .line 1106
    .line 1107
    move-object/from16 v13, v36

    .line 1108
    .line 1109
    const v0, 0x696c7374

    .line 1110
    .line 1111
    .line 1112
    const/16 v31, 0x1

    .line 1113
    .line 1114
    goto/16 :goto_f

    .line 1115
    .line 1116
    :goto_1a
    invoke-virtual {v7, v14}, Lp4/s;->G(I)V

    .line 1117
    .line 1118
    .line 1119
    throw v0

    .line 1120
    :cond_3c
    move/from16 v34, v11

    .line 1121
    .line 1122
    move/from16 v35, v12

    .line 1123
    .line 1124
    move-object/from16 v36, v13

    .line 1125
    .line 1126
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    if-eqz v0, :cond_3d

    .line 1131
    .line 1132
    const/4 v0, 0x0

    .line 1133
    :goto_1b
    const v30, 0x64617461

    .line 1134
    .line 1135
    .line 1136
    goto :goto_1c

    .line 1137
    :cond_3d
    new-instance v0, Lm4/n0;

    .line 1138
    .line 1139
    invoke-direct {v0, v8}, Lm4/n0;-><init>(Ljava/util/List;)V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_1b

    .line 1143
    :cond_3e
    move/from16 v34, v11

    .line 1144
    .line 1145
    move/from16 v35, v12

    .line 1146
    .line 1147
    move-object/from16 v36, v13

    .line 1148
    .line 1149
    const v30, 0x64617461

    .line 1150
    .line 1151
    .line 1152
    add-int/2addr v3, v8

    .line 1153
    invoke-virtual {v7, v3}, Lp4/s;->G(I)V

    .line 1154
    .line 1155
    .line 1156
    move-object/from16 v0, v32

    .line 1157
    .line 1158
    const v14, 0x68646c72    # 4.3148E24f

    .line 1159
    .line 1160
    .line 1161
    const/16 v31, 0x1

    .line 1162
    .line 1163
    goto/16 :goto_e

    .line 1164
    .line 1165
    :cond_3f
    move-object/from16 v32, v0

    .line 1166
    .line 1167
    move/from16 v34, v11

    .line 1168
    .line 1169
    move/from16 v35, v12

    .line 1170
    .line 1171
    move-object/from16 v36, v13

    .line 1172
    .line 1173
    const v30, 0x64617461

    .line 1174
    .line 1175
    .line 1176
    const/4 v0, 0x0

    .line 1177
    :goto_1c
    invoke-virtual {v9, v0}, Lm4/n0;->b(Lm4/n0;)Lm4/n0;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    move-object v9, v0

    .line 1182
    const/16 v8, 0x8

    .line 1183
    .line 1184
    const/4 v11, 0x4

    .line 1185
    const/16 v14, 0xc

    .line 1186
    .line 1187
    goto/16 :goto_27

    .line 1188
    .line 1189
    :cond_40
    move-object/from16 v32, v0

    .line 1190
    .line 1191
    move/from16 v34, v11

    .line 1192
    .line 1193
    move/from16 v35, v12

    .line 1194
    .line 1195
    move-object/from16 v36, v13

    .line 1196
    .line 1197
    const v30, 0x64617461

    .line 1198
    .line 1199
    .line 1200
    const v0, 0x736d7461

    .line 1201
    .line 1202
    .line 1203
    if-ne v15, v0, :cond_4f

    .line 1204
    .line 1205
    invoke-virtual {v7, v10}, Lp4/s;->G(I)V

    .line 1206
    .line 1207
    .line 1208
    add-int v12, v10, v35

    .line 1209
    .line 1210
    const/16 v0, 0xc

    .line 1211
    .line 1212
    invoke-virtual {v7, v0}, Lp4/s;->H(I)V

    .line 1213
    .line 1214
    .line 1215
    :goto_1d
    iget v0, v7, Lp4/s;->b:I

    .line 1216
    .line 1217
    if-ge v0, v12, :cond_4e

    .line 1218
    .line 1219
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 1220
    .line 1221
    .line 1222
    move-result v3

    .line 1223
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 1224
    .line 1225
    .line 1226
    move-result v8

    .line 1227
    const v11, 0x73617574

    .line 1228
    .line 1229
    .line 1230
    if-ne v8, v11, :cond_4d

    .line 1231
    .line 1232
    const/16 v8, 0x10

    .line 1233
    .line 1234
    if-ge v3, v8, :cond_41

    .line 1235
    .line 1236
    const/4 v3, 0x0

    .line 1237
    const/16 v8, 0x8

    .line 1238
    .line 1239
    const/4 v11, 0x4

    .line 1240
    const/16 v14, 0xc

    .line 1241
    .line 1242
    goto/16 :goto_24

    .line 1243
    .line 1244
    :cond_41
    const/4 v11, 0x4

    .line 1245
    invoke-virtual {v7, v11}, Lp4/s;->H(I)V

    .line 1246
    .line 1247
    .line 1248
    const/4 v0, -0x1

    .line 1249
    const/4 v3, 0x0

    .line 1250
    const/4 v13, 0x0

    .line 1251
    :goto_1e
    const/4 v14, 0x2

    .line 1252
    if-ge v3, v14, :cond_44

    .line 1253
    .line 1254
    invoke-virtual {v7}, Lp4/s;->u()I

    .line 1255
    .line 1256
    .line 1257
    move-result v14

    .line 1258
    invoke-virtual {v7}, Lp4/s;->u()I

    .line 1259
    .line 1260
    .line 1261
    move-result v15

    .line 1262
    if-nez v14, :cond_42

    .line 1263
    .line 1264
    move v0, v15

    .line 1265
    goto :goto_1f

    .line 1266
    :cond_42
    const/4 v8, 0x1

    .line 1267
    if-ne v14, v8, :cond_43

    .line 1268
    .line 1269
    move v13, v15

    .line 1270
    :cond_43
    :goto_1f
    add-int/lit8 v3, v3, 0x1

    .line 1271
    .line 1272
    const/16 v8, 0x10

    .line 1273
    .line 1274
    goto :goto_1e

    .line 1275
    :cond_44
    const v3, -0x7fffffff

    .line 1276
    .line 1277
    .line 1278
    const/16 v8, 0xc

    .line 1279
    .line 1280
    if-ne v0, v8, :cond_45

    .line 1281
    .line 1282
    const/16 v0, 0xf0

    .line 1283
    .line 1284
    :goto_20
    const/16 v8, 0x8

    .line 1285
    .line 1286
    const/16 v14, 0xc

    .line 1287
    .line 1288
    goto :goto_22

    .line 1289
    :cond_45
    const/16 v8, 0xd

    .line 1290
    .line 1291
    if-ne v0, v8, :cond_46

    .line 1292
    .line 1293
    const/16 v0, 0x78

    .line 1294
    .line 1295
    goto :goto_20

    .line 1296
    :cond_46
    const/16 v8, 0x15

    .line 1297
    .line 1298
    if-eq v0, v8, :cond_47

    .line 1299
    .line 1300
    const v0, -0x7fffffff

    .line 1301
    .line 1302
    .line 1303
    goto :goto_20

    .line 1304
    :cond_47
    invoke-virtual {v7}, Lp4/s;->a()I

    .line 1305
    .line 1306
    .line 1307
    move-result v0

    .line 1308
    const/16 v8, 0x8

    .line 1309
    .line 1310
    if-lt v0, v8, :cond_48

    .line 1311
    .line 1312
    iget v0, v7, Lp4/s;->b:I

    .line 1313
    .line 1314
    add-int/2addr v0, v8

    .line 1315
    if-le v0, v12, :cond_49

    .line 1316
    .line 1317
    :cond_48
    const/16 v14, 0xc

    .line 1318
    .line 1319
    goto :goto_21

    .line 1320
    :cond_49
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 1321
    .line 1322
    .line 1323
    move-result v0

    .line 1324
    invoke-virtual {v7}, Lp4/s;->g()I

    .line 1325
    .line 1326
    .line 1327
    move-result v12

    .line 1328
    const/16 v14, 0xc

    .line 1329
    .line 1330
    if-lt v0, v14, :cond_4b

    .line 1331
    .line 1332
    const v0, 0x73726672

    .line 1333
    .line 1334
    .line 1335
    if-eq v12, v0, :cond_4a

    .line 1336
    .line 1337
    goto :goto_21

    .line 1338
    :cond_4a
    invoke-virtual {v7}, Lp4/s;->v()I

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    goto :goto_22

    .line 1343
    :cond_4b
    :goto_21
    const v0, -0x7fffffff

    .line 1344
    .line 1345
    .line 1346
    :goto_22
    if-ne v0, v3, :cond_4c

    .line 1347
    .line 1348
    :goto_23
    const/4 v3, 0x0

    .line 1349
    goto :goto_24

    .line 1350
    :cond_4c
    new-instance v3, Lm4/n0;

    .line 1351
    .line 1352
    new-instance v12, Lg6/d;

    .line 1353
    .line 1354
    int-to-float v0, v0

    .line 1355
    invoke-direct {v12, v0, v13}, Lg6/d;-><init>(FI)V

    .line 1356
    .line 1357
    .line 1358
    const/4 v0, 0x1

    .line 1359
    new-array v13, v0, [Lm4/m0;

    .line 1360
    .line 1361
    const/16 v28, 0x0

    .line 1362
    .line 1363
    aput-object v12, v13, v28

    .line 1364
    .line 1365
    invoke-direct {v3, v13}, Lm4/n0;-><init>([Lm4/m0;)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_24

    .line 1369
    :cond_4d
    const/16 v8, 0x8

    .line 1370
    .line 1371
    const/4 v11, 0x4

    .line 1372
    const/16 v14, 0xc

    .line 1373
    .line 1374
    add-int/2addr v0, v3

    .line 1375
    invoke-virtual {v7, v0}, Lp4/s;->G(I)V

    .line 1376
    .line 1377
    .line 1378
    goto/16 :goto_1d

    .line 1379
    .line 1380
    :cond_4e
    const/16 v8, 0x8

    .line 1381
    .line 1382
    const/4 v11, 0x4

    .line 1383
    const/16 v14, 0xc

    .line 1384
    .line 1385
    goto :goto_23

    .line 1386
    :goto_24
    invoke-virtual {v9, v3}, Lm4/n0;->b(Lm4/n0;)Lm4/n0;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    :goto_25
    move-object v9, v0

    .line 1391
    goto :goto_27

    .line 1392
    :cond_4f
    const/16 v8, 0x8

    .line 1393
    .line 1394
    const/4 v11, 0x4

    .line 1395
    const/16 v14, 0xc

    .line 1396
    .line 1397
    const v0, -0x56878686

    .line 1398
    .line 1399
    .line 1400
    if-ne v15, v0, :cond_50

    .line 1401
    .line 1402
    invoke-virtual {v7}, Lp4/s;->r()S

    .line 1403
    .line 1404
    .line 1405
    move-result v0

    .line 1406
    const/4 v3, 0x2

    .line 1407
    invoke-virtual {v7, v3}, Lp4/s;->H(I)V

    .line 1408
    .line 1409
    .line 1410
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1411
    .line 1412
    invoke-virtual {v7, v0, v3}, Lp4/s;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v0

    .line 1416
    const/16 v3, 0x2b

    .line 1417
    .line 1418
    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1419
    .line 1420
    .line 1421
    move-result v3

    .line 1422
    const/16 v12, 0x2d

    .line 1423
    .line 1424
    invoke-virtual {v0, v12}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1425
    .line 1426
    .line 1427
    move-result v12

    .line 1428
    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    .line 1429
    .line 1430
    .line 1431
    move-result v3

    .line 1432
    const/4 v13, 0x0

    .line 1433
    :try_start_4
    invoke-virtual {v0, v13, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v12

    .line 1437
    invoke-static {v12}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1438
    .line 1439
    .line 1440
    move-result v12

    .line 1441
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1442
    .line 1443
    .line 1444
    move-result v13

    .line 1445
    const/4 v15, 0x1

    .line 1446
    sub-int/2addr v13, v15

    .line 1447
    invoke-virtual {v0, v3, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1452
    .line 1453
    .line 1454
    move-result v0

    .line 1455
    new-instance v3, Lm4/n0;

    .line 1456
    .line 1457
    new-instance v13, Lq4/e;

    .line 1458
    .line 1459
    invoke-direct {v13, v12, v0}, Lq4/e;-><init>(FF)V

    .line 1460
    .line 1461
    .line 1462
    new-array v0, v15, [Lm4/m0;

    .line 1463
    .line 1464
    const/16 v28, 0x0

    .line 1465
    .line 1466
    aput-object v13, v0, v28

    .line 1467
    .line 1468
    invoke-direct {v3, v0}, Lm4/n0;-><init>([Lm4/m0;)V
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    .line 1469
    .line 1470
    .line 1471
    goto :goto_26

    .line 1472
    :catch_0
    const/4 v3, 0x0

    .line 1473
    :goto_26
    invoke-virtual {v9, v3}, Lm4/n0;->b(Lm4/n0;)Lm4/n0;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    goto :goto_25

    .line 1478
    :cond_50
    :goto_27
    add-int v10, v10, v35

    .line 1479
    .line 1480
    invoke-virtual {v7, v10}, Lp4/s;->G(I)V

    .line 1481
    .line 1482
    .line 1483
    move-object/from16 v0, v32

    .line 1484
    .line 1485
    move/from16 v11, v34

    .line 1486
    .line 1487
    move-object/from16 v13, v36

    .line 1488
    .line 1489
    const/4 v3, 0x0

    .line 1490
    const/4 v14, 0x1

    .line 1491
    goto/16 :goto_d

    .line 1492
    .line 1493
    :cond_51
    move-object/from16 v32, v0

    .line 1494
    .line 1495
    move/from16 v34, v11

    .line 1496
    .line 1497
    move-object/from16 v36, v13

    .line 1498
    .line 1499
    invoke-virtual {v6, v9}, Lr5/v;->b(Lm4/n0;)V

    .line 1500
    .line 1501
    .line 1502
    move-object v0, v9

    .line 1503
    goto :goto_28

    .line 1504
    :cond_52
    move-object/from16 v32, v0

    .line 1505
    .line 1506
    move/from16 v34, v11

    .line 1507
    .line 1508
    move-object/from16 v36, v13

    .line 1509
    .line 1510
    const/4 v0, 0x0

    .line 1511
    :goto_28
    new-instance v3, Lm4/n0;

    .line 1512
    .line 1513
    const v7, 0x6d766864

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v5, v7}, Lq4/b;->i(I)Lq4/c;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v7

    .line 1520
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1521
    .line 1522
    .line 1523
    iget-object v7, v7, Lq4/c;->c:Lp4/s;

    .line 1524
    .line 1525
    invoke-static {v7}, Ll6/e;->d(Lp4/s;)Lq4/f;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v7

    .line 1529
    const/4 v12, 0x1

    .line 1530
    new-array v8, v12, [Lm4/m0;

    .line 1531
    .line 1532
    const/16 v28, 0x0

    .line 1533
    .line 1534
    aput-object v7, v8, v28

    .line 1535
    .line 1536
    invoke-direct {v3, v8}, Lm4/n0;-><init>([Lm4/m0;)V

    .line 1537
    .line 1538
    .line 1539
    and-int/lit8 v7, v20, 0x1

    .line 1540
    .line 1541
    if-eqz v7, :cond_53

    .line 1542
    .line 1543
    const/4 v10, 0x1

    .line 1544
    goto :goto_29

    .line 1545
    :cond_53
    const/4 v10, 0x0

    .line 1546
    :goto_29
    new-instance v12, Lb7/c3;

    .line 1547
    .line 1548
    const/16 v7, 0x18

    .line 1549
    .line 1550
    invoke-direct {v12, v7}, Lb7/c3;-><init>(I)V

    .line 1551
    .line 1552
    .line 1553
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    const/4 v9, 0x0

    .line 1559
    move/from16 v11, v34

    .line 1560
    .line 1561
    const/16 v21, 0x0

    .line 1562
    .line 1563
    invoke-static/range {v5 .. v12}, Ll6/e;->g(Lq4/b;Lr5/v;JLm4/n;ZZLxa/d;)Ljava/util/ArrayList;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v5

    .line 1567
    iget-boolean v7, v1, Ll6/m;->x:Z

    .line 1568
    .line 1569
    if-eqz v7, :cond_55

    .line 1570
    .line 1571
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1572
    .line 1573
    .line 1574
    move-result v7

    .line 1575
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1576
    .line 1577
    .line 1578
    move-result v8

    .line 1579
    if-ne v7, v8, :cond_54

    .line 1580
    .line 1581
    const/4 v7, 0x1

    .line 1582
    goto :goto_2a

    .line 1583
    :cond_54
    const/4 v7, 0x0

    .line 1584
    :goto_2a
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1585
    .line 1586
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1587
    .line 1588
    .line 1589
    move-result v8

    .line 1590
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1591
    .line 1592
    .line 1593
    move-result v9

    .line 1594
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1595
    .line 1596
    const-string v11, "The number of auxiliary track types from metadata ("

    .line 1597
    .line 1598
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1602
    .line 1603
    .line 1604
    const-string v8, ") is not same as the number of auxiliary tracks ("

    .line 1605
    .line 1606
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1610
    .line 1611
    .line 1612
    const-string v8, ")"

    .line 1613
    .line 1614
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v8

    .line 1621
    invoke-static {v8, v7}, Lp4/c;->h(Ljava/lang/String;Z)V

    .line 1622
    .line 1623
    .line 1624
    :cond_55
    invoke-static {v5}, Ll6/p;->c(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v7

    .line 1628
    const/4 v10, 0x0

    .line 1629
    const/4 v11, -0x1

    .line 1630
    const/4 v12, 0x0

    .line 1631
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    :goto_2b
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1637
    .line 1638
    .line 1639
    move-result v15

    .line 1640
    if-ge v10, v15, :cond_68

    .line 1641
    .line 1642
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v15

    .line 1646
    check-cast v15, Ll6/t;

    .line 1647
    .line 1648
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    iget v8, v15, Ll6/t;->b:I

    .line 1654
    .line 1655
    iget v9, v15, Ll6/t;->e:I

    .line 1656
    .line 1657
    if-nez v8, :cond_56

    .line 1658
    .line 1659
    move-object/from16 v19, v0

    .line 1660
    .line 1661
    move-object/from16 v30, v2

    .line 1662
    .line 1663
    move-object/from16 v24, v3

    .line 1664
    .line 1665
    move-object/from16 v26, v5

    .line 1666
    .line 1667
    move-object/from16 v27, v7

    .line 1668
    .line 1669
    move-object/from16 v2, v36

    .line 1670
    .line 1671
    const/4 v3, -0x1

    .line 1672
    const/4 v9, 0x3

    .line 1673
    goto/16 :goto_38

    .line 1674
    .line 1675
    :cond_56
    iget-object v8, v15, Ll6/t;->a:Ll6/q;

    .line 1676
    .line 1677
    move-object/from16 v19, v0

    .line 1678
    .line 1679
    new-instance v0, Ll6/l;

    .line 1680
    .line 1681
    move-object/from16 v24, v3

    .line 1682
    .line 1683
    iget-object v3, v1, Ll6/m;->z:Lr5/q;

    .line 1684
    .line 1685
    add-int/lit8 v25, v12, 0x1

    .line 1686
    .line 1687
    move-object/from16 v26, v5

    .line 1688
    .line 1689
    iget v5, v8, Ll6/q;->b:I

    .line 1690
    .line 1691
    move-object/from16 v27, v7

    .line 1692
    .line 1693
    iget-object v7, v8, Ll6/q;->g:Lm4/q;

    .line 1694
    .line 1695
    invoke-interface {v3, v12, v5}, Lr5/q;->u(II)Lr5/h0;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v3

    .line 1699
    invoke-direct {v0, v8, v15, v3}, Ll6/l;-><init>(Ll6/q;Ll6/t;Lr5/h0;)V

    .line 1700
    .line 1701
    .line 1702
    move v12, v9

    .line 1703
    iget-wide v8, v8, Ll6/q;->e:J

    .line 1704
    .line 1705
    cmp-long v30, v8, v22

    .line 1706
    .line 1707
    if-eqz v30, :cond_57

    .line 1708
    .line 1709
    goto :goto_2c

    .line 1710
    :cond_57
    iget-wide v8, v15, Ll6/t;->h:J

    .line 1711
    .line 1712
    :goto_2c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1713
    .line 1714
    .line 1715
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 1716
    .line 1717
    .line 1718
    move-result-wide v13

    .line 1719
    const-string v3, "audio/true-hd"

    .line 1720
    .line 1721
    move/from16 v30, v12

    .line 1722
    .line 1723
    iget-object v12, v7, Lm4/q;->n:Ljava/lang/String;

    .line 1724
    .line 1725
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1726
    .line 1727
    .line 1728
    move-result v3

    .line 1729
    if-eqz v3, :cond_58

    .line 1730
    .line 1731
    mul-int/lit8 v3, v30, 0x10

    .line 1732
    .line 1733
    goto :goto_2d

    .line 1734
    :cond_58
    add-int/lit8 v3, v30, 0x1e

    .line 1735
    .line 1736
    :goto_2d
    invoke-virtual {v7}, Lm4/q;->a()Lm4/p;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v12

    .line 1740
    iput v3, v12, Lm4/p;->n:I

    .line 1741
    .line 1742
    const/4 v3, 0x2

    .line 1743
    if-ne v5, v3, :cond_5d

    .line 1744
    .line 1745
    iget v3, v7, Lm4/q;->f:I

    .line 1746
    .line 1747
    and-int/lit8 v30, v20, 0x8

    .line 1748
    .line 1749
    if-eqz v30, :cond_5a

    .line 1750
    .line 1751
    move/from16 v30, v3

    .line 1752
    .line 1753
    const/4 v3, -0x1

    .line 1754
    if-ne v11, v3, :cond_59

    .line 1755
    .line 1756
    const/4 v3, 0x1

    .line 1757
    goto :goto_2e

    .line 1758
    :cond_59
    const/4 v3, 0x2

    .line 1759
    :goto_2e
    or-int v3, v30, v3

    .line 1760
    .line 1761
    goto :goto_2f

    .line 1762
    :cond_5a
    move/from16 v30, v3

    .line 1763
    .line 1764
    :goto_2f
    iget v7, v7, Lm4/q;->w:F

    .line 1765
    .line 1766
    const/high16 v30, -0x40800000    # -1.0f

    .line 1767
    .line 1768
    cmpl-float v7, v7, v30

    .line 1769
    .line 1770
    if-nez v7, :cond_5b

    .line 1771
    .line 1772
    cmp-long v7, v8, v16

    .line 1773
    .line 1774
    if-lez v7, :cond_5b

    .line 1775
    .line 1776
    iget v7, v15, Ll6/t;->b:I

    .line 1777
    .line 1778
    if-lez v7, :cond_5b

    .line 1779
    .line 1780
    int-to-float v7, v7

    .line 1781
    long-to-float v8, v8

    .line 1782
    const v9, 0x49742400    # 1000000.0f

    .line 1783
    .line 1784
    .line 1785
    div-float/2addr v8, v9

    .line 1786
    div-float/2addr v7, v8

    .line 1787
    iput v7, v12, Lm4/p;->v:F

    .line 1788
    .line 1789
    :cond_5b
    iget-boolean v7, v1, Ll6/m;->x:Z

    .line 1790
    .line 1791
    if-eqz v7, :cond_5c

    .line 1792
    .line 1793
    const v7, 0x8000

    .line 1794
    .line 1795
    .line 1796
    or-int/2addr v3, v7

    .line 1797
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v7

    .line 1801
    check-cast v7, Ljava/lang/Integer;

    .line 1802
    .line 1803
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1804
    .line 1805
    .line 1806
    move-result v7

    .line 1807
    iput v7, v12, Lm4/p;->g:I

    .line 1808
    .line 1809
    :cond_5c
    iput v3, v12, Lm4/p;->f:I

    .line 1810
    .line 1811
    :cond_5d
    const/4 v15, 0x1

    .line 1812
    if-ne v5, v15, :cond_5e

    .line 1813
    .line 1814
    iget v3, v6, Lr5/v;->a:I

    .line 1815
    .line 1816
    const/4 v7, -0x1

    .line 1817
    if-eq v3, v7, :cond_5e

    .line 1818
    .line 1819
    iget v8, v6, Lr5/v;->b:I

    .line 1820
    .line 1821
    if-eq v8, v7, :cond_5e

    .line 1822
    .line 1823
    iput v3, v12, Lm4/p;->F:I

    .line 1824
    .line 1825
    iput v8, v12, Lm4/p;->G:I

    .line 1826
    .line 1827
    :cond_5e
    iget-object v3, v1, Ll6/m;->i:Ljava/util/ArrayList;

    .line 1828
    .line 1829
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1830
    .line 1831
    .line 1832
    move-result v7

    .line 1833
    if-eqz v7, :cond_5f

    .line 1834
    .line 1835
    move-object/from16 v7, v21

    .line 1836
    .line 1837
    :goto_30
    const/4 v9, 0x3

    .line 1838
    goto :goto_31

    .line 1839
    :cond_5f
    new-instance v7, Lm4/n0;

    .line 1840
    .line 1841
    invoke-direct {v7, v3}, Lm4/n0;-><init>(Ljava/util/List;)V

    .line 1842
    .line 1843
    .line 1844
    goto :goto_30

    .line 1845
    :goto_31
    new-array v3, v9, [Lm4/n0;

    .line 1846
    .line 1847
    const/4 v8, 0x0

    .line 1848
    aput-object v7, v3, v8

    .line 1849
    .line 1850
    const/16 v31, 0x1

    .line 1851
    .line 1852
    aput-object v19, v3, v31

    .line 1853
    .line 1854
    const/16 v29, 0x2

    .line 1855
    .line 1856
    aput-object v24, v3, v29

    .line 1857
    .line 1858
    new-instance v7, Lm4/n0;

    .line 1859
    .line 1860
    new-array v9, v8, [Lm4/m0;

    .line 1861
    .line 1862
    invoke-direct {v7, v9}, Lm4/n0;-><init>([Lm4/m0;)V

    .line 1863
    .line 1864
    .line 1865
    if-eqz v2, :cond_63

    .line 1866
    .line 1867
    const/4 v8, 0x0

    .line 1868
    :goto_32
    iget-object v9, v2, Lm4/n0;->a:[Lm4/m0;

    .line 1869
    .line 1870
    array-length v15, v9

    .line 1871
    if-ge v8, v15, :cond_63

    .line 1872
    .line 1873
    aget-object v9, v9, v8

    .line 1874
    .line 1875
    instance-of v15, v9, Lq4/a;

    .line 1876
    .line 1877
    if-eqz v15, :cond_62

    .line 1878
    .line 1879
    check-cast v9, Lq4/a;

    .line 1880
    .line 1881
    iget-object v15, v9, Lq4/a;->a:Ljava/lang/String;

    .line 1882
    .line 1883
    move-object/from16 v30, v2

    .line 1884
    .line 1885
    const-string v2, "com.android.capture.fps"

    .line 1886
    .line 1887
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1888
    .line 1889
    .line 1890
    move-result v2

    .line 1891
    if-eqz v2, :cond_61

    .line 1892
    .line 1893
    const/4 v2, 0x2

    .line 1894
    if-ne v5, v2, :cond_60

    .line 1895
    .line 1896
    const/4 v15, 0x1

    .line 1897
    new-array v2, v15, [Lm4/m0;

    .line 1898
    .line 1899
    const/16 v28, 0x0

    .line 1900
    .line 1901
    aput-object v9, v2, v28

    .line 1902
    .line 1903
    invoke-virtual {v7, v2}, Lm4/n0;->a([Lm4/m0;)Lm4/n0;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v2

    .line 1907
    :goto_33
    move-object v7, v2

    .line 1908
    goto :goto_34

    .line 1909
    :cond_60
    const/16 v28, 0x0

    .line 1910
    .line 1911
    goto :goto_34

    .line 1912
    :cond_61
    const/4 v15, 0x1

    .line 1913
    const/16 v28, 0x0

    .line 1914
    .line 1915
    new-array v2, v15, [Lm4/m0;

    .line 1916
    .line 1917
    aput-object v9, v2, v28

    .line 1918
    .line 1919
    invoke-virtual {v7, v2}, Lm4/n0;->a([Lm4/m0;)Lm4/n0;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v2

    .line 1923
    goto :goto_33

    .line 1924
    :cond_62
    move-object/from16 v30, v2

    .line 1925
    .line 1926
    :goto_34
    add-int/lit8 v8, v8, 0x1

    .line 1927
    .line 1928
    move-object/from16 v2, v30

    .line 1929
    .line 1930
    goto :goto_32

    .line 1931
    :cond_63
    move-object/from16 v30, v2

    .line 1932
    .line 1933
    const/4 v2, 0x0

    .line 1934
    const/4 v9, 0x3

    .line 1935
    :goto_35
    if-ge v2, v9, :cond_64

    .line 1936
    .line 1937
    aget-object v8, v3, v2

    .line 1938
    .line 1939
    invoke-virtual {v7, v8}, Lm4/n0;->b(Lm4/n0;)Lm4/n0;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v7

    .line 1943
    add-int/lit8 v2, v2, 0x1

    .line 1944
    .line 1945
    goto :goto_35

    .line 1946
    :cond_64
    iget-object v2, v7, Lm4/n0;->a:[Lm4/m0;

    .line 1947
    .line 1948
    array-length v2, v2

    .line 1949
    if-lez v2, :cond_65

    .line 1950
    .line 1951
    iput-object v7, v12, Lm4/p;->k:Lm4/n0;

    .line 1952
    .line 1953
    :cond_65
    invoke-static/range {v27 .. v27}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v2

    .line 1957
    iput-object v2, v12, Lm4/p;->l:Ljava/lang/String;

    .line 1958
    .line 1959
    iget-object v2, v0, Ll6/l;->c:Lr5/h0;

    .line 1960
    .line 1961
    invoke-static {v12, v2}, La0/c;->O(Lm4/p;Lr5/h0;)V

    .line 1962
    .line 1963
    .line 1964
    const/4 v3, 0x2

    .line 1965
    if-ne v5, v3, :cond_67

    .line 1966
    .line 1967
    const/4 v3, -0x1

    .line 1968
    if-ne v11, v3, :cond_66

    .line 1969
    .line 1970
    invoke-virtual/range {v36 .. v36}, Ljava/util/ArrayList;->size()I

    .line 1971
    .line 1972
    .line 1973
    move-result v11

    .line 1974
    :cond_66
    :goto_36
    move-object/from16 v2, v36

    .line 1975
    .line 1976
    goto :goto_37

    .line 1977
    :cond_67
    const/4 v3, -0x1

    .line 1978
    goto :goto_36

    .line 1979
    :goto_37
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1980
    .line 1981
    .line 1982
    move/from16 v12, v25

    .line 1983
    .line 1984
    :goto_38
    add-int/lit8 v10, v10, 0x1

    .line 1985
    .line 1986
    move-object/from16 v36, v2

    .line 1987
    .line 1988
    move-object/from16 v0, v19

    .line 1989
    .line 1990
    move-object/from16 v3, v24

    .line 1991
    .line 1992
    move-object/from16 v5, v26

    .line 1993
    .line 1994
    move-object/from16 v7, v27

    .line 1995
    .line 1996
    move-object/from16 v2, v30

    .line 1997
    .line 1998
    goto/16 :goto_2b

    .line 1999
    .line 2000
    :cond_68
    move-object/from16 v2, v36

    .line 2001
    .line 2002
    const/4 v3, -0x1

    .line 2003
    iput v11, v1, Ll6/m;->C:I

    .line 2004
    .line 2005
    iput-wide v13, v1, Ll6/m;->D:J

    .line 2006
    .line 2007
    const/4 v13, 0x0

    .line 2008
    new-array v0, v13, [Ll6/l;

    .line 2009
    .line 2010
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v0

    .line 2014
    check-cast v0, [Ll6/l;

    .line 2015
    .line 2016
    iput-object v0, v1, Ll6/m;->A:[Ll6/l;

    .line 2017
    .line 2018
    array-length v2, v0

    .line 2019
    new-array v2, v2, [[J

    .line 2020
    .line 2021
    array-length v4, v0

    .line 2022
    new-array v4, v4, [I

    .line 2023
    .line 2024
    array-length v5, v0

    .line 2025
    new-array v5, v5, [J

    .line 2026
    .line 2027
    array-length v6, v0

    .line 2028
    new-array v6, v6, [Z

    .line 2029
    .line 2030
    const/4 v13, 0x0

    .line 2031
    :goto_39
    array-length v7, v0

    .line 2032
    if-ge v13, v7, :cond_69

    .line 2033
    .line 2034
    aget-object v7, v0, v13

    .line 2035
    .line 2036
    iget-object v7, v7, Ll6/l;->b:Ll6/t;

    .line 2037
    .line 2038
    iget v7, v7, Ll6/t;->b:I

    .line 2039
    .line 2040
    new-array v7, v7, [J

    .line 2041
    .line 2042
    aput-object v7, v2, v13

    .line 2043
    .line 2044
    aget-object v7, v0, v13

    .line 2045
    .line 2046
    iget-object v7, v7, Ll6/l;->b:Ll6/t;

    .line 2047
    .line 2048
    iget-object v7, v7, Ll6/t;->f:[J

    .line 2049
    .line 2050
    const/16 v28, 0x0

    .line 2051
    .line 2052
    aget-wide v8, v7, v28

    .line 2053
    .line 2054
    aput-wide v8, v5, v13

    .line 2055
    .line 2056
    add-int/lit8 v13, v13, 0x1

    .line 2057
    .line 2058
    goto :goto_39

    .line 2059
    :cond_69
    const/4 v13, 0x0

    .line 2060
    :goto_3a
    array-length v7, v0

    .line 2061
    if-ge v13, v7, :cond_6d

    .line 2062
    .line 2063
    const-wide v7, 0x7fffffffffffffffL

    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    const/4 v9, 0x0

    .line 2069
    const/4 v11, -0x1

    .line 2070
    :goto_3b
    array-length v10, v0

    .line 2071
    if-ge v9, v10, :cond_6b

    .line 2072
    .line 2073
    aget-boolean v10, v6, v9

    .line 2074
    .line 2075
    if-nez v10, :cond_6a

    .line 2076
    .line 2077
    aget-wide v14, v5, v9

    .line 2078
    .line 2079
    cmp-long v10, v14, v7

    .line 2080
    .line 2081
    if-gtz v10, :cond_6a

    .line 2082
    .line 2083
    move v11, v9

    .line 2084
    move-wide v7, v14

    .line 2085
    :cond_6a
    add-int/lit8 v9, v9, 0x1

    .line 2086
    .line 2087
    goto :goto_3b

    .line 2088
    :cond_6b
    aget v7, v4, v11

    .line 2089
    .line 2090
    aget-object v8, v2, v11

    .line 2091
    .line 2092
    aput-wide v16, v8, v7

    .line 2093
    .line 2094
    aget-object v9, v0, v11

    .line 2095
    .line 2096
    iget-object v9, v9, Ll6/l;->b:Ll6/t;

    .line 2097
    .line 2098
    iget-object v10, v9, Ll6/t;->d:[I

    .line 2099
    .line 2100
    aget v10, v10, v7

    .line 2101
    .line 2102
    int-to-long v14, v10

    .line 2103
    add-long v16, v16, v14

    .line 2104
    .line 2105
    const/16 v31, 0x1

    .line 2106
    .line 2107
    add-int/lit8 v7, v7, 0x1

    .line 2108
    .line 2109
    aput v7, v4, v11

    .line 2110
    .line 2111
    array-length v8, v8

    .line 2112
    if-ge v7, v8, :cond_6c

    .line 2113
    .line 2114
    iget-object v8, v9, Ll6/t;->f:[J

    .line 2115
    .line 2116
    aget-wide v7, v8, v7

    .line 2117
    .line 2118
    aput-wide v7, v5, v11

    .line 2119
    .line 2120
    goto :goto_3a

    .line 2121
    :cond_6c
    aput-boolean v31, v6, v11

    .line 2122
    .line 2123
    add-int/lit8 v13, v13, 0x1

    .line 2124
    .line 2125
    goto :goto_3a

    .line 2126
    :cond_6d
    iput-object v2, v1, Ll6/m;->B:[[J

    .line 2127
    .line 2128
    iget-object v0, v1, Ll6/m;->z:Lr5/q;

    .line 2129
    .line 2130
    invoke-interface {v0}, Lr5/q;->n()V

    .line 2131
    .line 2132
    .line 2133
    iget-object v0, v1, Ll6/m;->z:Lr5/q;

    .line 2134
    .line 2135
    invoke-interface {v0, v1}, Lr5/q;->a(Lr5/b0;)V

    .line 2136
    .line 2137
    .line 2138
    :goto_3c
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->clear()V

    .line 2139
    .line 2140
    .line 2141
    iget-boolean v0, v1, Ll6/m;->v:Z

    .line 2142
    .line 2143
    if-nez v0, :cond_0

    .line 2144
    .line 2145
    const/4 v3, 0x2

    .line 2146
    iput v3, v1, Ll6/m;->k:I

    .line 2147
    .line 2148
    goto/16 :goto_0

    .line 2149
    .line 2150
    :cond_6e
    move-object/from16 v32, v0

    .line 2151
    .line 2152
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2153
    .line 2154
    .line 2155
    move-result v0

    .line 2156
    if-nez v0, :cond_0

    .line 2157
    .line 2158
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v0

    .line 2162
    check-cast v0, Lq4/b;

    .line 2163
    .line 2164
    iget-object v0, v0, Lq4/b;->e:Ljava/util/ArrayList;

    .line 2165
    .line 2166
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2167
    .line 2168
    .line 2169
    goto/16 :goto_0

    .line 2170
    .line 2171
    :cond_6f
    iget v0, v1, Ll6/m;->k:I

    .line 2172
    .line 2173
    const/4 v3, 0x2

    .line 2174
    if-eq v0, v3, :cond_70

    .line 2175
    .line 2176
    const/4 v13, 0x0

    .line 2177
    iput v13, v1, Ll6/m;->k:I

    .line 2178
    .line 2179
    iput v13, v1, Ll6/m;->n:I

    .line 2180
    .line 2181
    :cond_70
    return-void
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
.end method
