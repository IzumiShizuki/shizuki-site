.class public final Lr/h0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr/u;


# instance fields
.field public final a:Lr/g0;


# direct methods
.method public constructor <init>(Lr/g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/h0;->a:Lr/g0;

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


# virtual methods
.method public final bridge synthetic a(Lr/v1;)Lr/a2;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lr/h0;->f(Lr/v1;)Lr/e2;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic a(Lr/v1;)Lr/x1;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/h0;->f(Lr/v1;)Lr/e2;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lr/v1;)Lr/e2;
    .locals 21

    .line 1
    new-instance v0, Lo/x;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Lr/h0;->a:Lr/g0;

    .line 6
    .line 7
    iget-object v3, v2, Lr/g0;->b:Lo/y;

    .line 8
    .line 9
    iget v4, v3, Lo/m;->e:I

    .line 10
    .line 11
    add-int/lit8 v4, v4, 0x2

    .line 12
    .line 13
    invoke-direct {v0, v4}, Lo/x;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lo/y;

    .line 17
    .line 18
    iget v5, v3, Lo/m;->e:I

    .line 19
    .line 20
    invoke-direct {v4, v5}, Lo/y;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v5, v3, Lo/m;->b:[I

    .line 24
    .line 25
    iget-object v6, v3, Lo/m;->c:[Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v7, v3, Lo/m;->a:[J

    .line 28
    .line 29
    array-length v8, v7

    .line 30
    add-int/lit8 v8, v8, -0x2

    .line 31
    .line 32
    if-ltz v8, :cond_2

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    :goto_0
    aget-wide v11, v7, v10

    .line 36
    .line 37
    not-long v13, v11

    .line 38
    const/4 v15, 0x7

    .line 39
    shl-long/2addr v13, v15

    .line 40
    and-long/2addr v13, v11

    .line 41
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v13, v15

    .line 47
    cmp-long v17, v13, v15

    .line 48
    .line 49
    if-eqz v17, :cond_3

    .line 50
    .line 51
    sub-int v13, v10, v8

    .line 52
    .line 53
    not-int v13, v13

    .line 54
    ushr-int/lit8 v13, v13, 0x1f

    .line 55
    .line 56
    const/16 v14, 0x8

    .line 57
    .line 58
    rsub-int/lit8 v13, v13, 0x8

    .line 59
    .line 60
    const/4 v15, 0x0

    .line 61
    :goto_1
    if-ge v15, v13, :cond_1

    .line 62
    .line 63
    const-wide/16 v16, 0xff

    .line 64
    .line 65
    and-long v16, v11, v16

    .line 66
    .line 67
    const-wide/16 v18, 0x80

    .line 68
    .line 69
    cmp-long v20, v16, v18

    .line 70
    .line 71
    if-gez v20, :cond_0

    .line 72
    .line 73
    shl-int/lit8 v16, v10, 0x3

    .line 74
    .line 75
    add-int v16, v16, v15

    .line 76
    .line 77
    aget v9, v5, v16

    .line 78
    .line 79
    aget-object v16, v6, v16

    .line 80
    .line 81
    const/16 v18, 0x8

    .line 82
    .line 83
    move-object/from16 v14, v16

    .line 84
    .line 85
    check-cast v14, Lr/f0;

    .line 86
    .line 87
    invoke-virtual {v0, v9}, Lo/x;->a(I)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Lr/d2;

    .line 91
    .line 92
    move-object/from16 v16, v5

    .line 93
    .line 94
    move-object/from16 v19, v6

    .line 95
    .line 96
    move-object/from16 v5, p1

    .line 97
    .line 98
    iget-object v6, v5, Lr/v1;->a:Lic/k;

    .line 99
    .line 100
    iget-object v5, v14, Lr/f0;->a:Ljava/lang/Float;

    .line 101
    .line 102
    invoke-interface {v6, v5}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Lr/p;

    .line 107
    .line 108
    iget-object v6, v14, Lr/f0;->b:Lr/v;

    .line 109
    .line 110
    invoke-direct {v1, v5, v6}, Lr/d2;-><init>(Lr/p;Lr/v;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v9, v1}, Lo/y;->h(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_0
    move-object/from16 v16, v5

    .line 118
    .line 119
    move-object/from16 v19, v6

    .line 120
    .line 121
    const/16 v18, 0x8

    .line 122
    .line 123
    :goto_2
    shr-long v11, v11, v18

    .line 124
    .line 125
    add-int/lit8 v15, v15, 0x1

    .line 126
    .line 127
    move-object/from16 v1, p0

    .line 128
    .line 129
    move-object/from16 v5, v16

    .line 130
    .line 131
    move-object/from16 v6, v19

    .line 132
    .line 133
    const/16 v14, 0x8

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_1
    move-object/from16 v16, v5

    .line 137
    .line 138
    move-object/from16 v19, v6

    .line 139
    .line 140
    const/16 v1, 0x8

    .line 141
    .line 142
    if-ne v13, v1, :cond_2

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_2
    const/4 v1, 0x0

    .line 146
    goto :goto_4

    .line 147
    :cond_3
    move-object/from16 v16, v5

    .line 148
    .line 149
    move-object/from16 v19, v6

    .line 150
    .line 151
    :goto_3
    if-eq v10, v8, :cond_2

    .line 152
    .line 153
    add-int/lit8 v10, v10, 0x1

    .line 154
    .line 155
    move-object/from16 v1, p0

    .line 156
    .line 157
    move-object/from16 v5, v16

    .line 158
    .line 159
    move-object/from16 v6, v19

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :goto_4
    invoke-virtual {v3, v1}, Lo/m;->a(I)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-nez v5, :cond_6

    .line 167
    .line 168
    iget v5, v0, Lo/x;->b:I

    .line 169
    .line 170
    if-ltz v5, :cond_5

    .line 171
    .line 172
    const/4 v6, 0x1

    .line 173
    add-int/2addr v5, v6

    .line 174
    invoke-virtual {v0, v5}, Lo/x;->b(I)V

    .line 175
    .line 176
    .line 177
    iget-object v5, v0, Lo/x;->a:[I

    .line 178
    .line 179
    iget v7, v0, Lo/x;->b:I

    .line 180
    .line 181
    if-eqz v7, :cond_4

    .line 182
    .line 183
    invoke-static {v6, v1, v7, v5, v5}, Lvb/l;->h0(III[I[I)V

    .line 184
    .line 185
    .line 186
    :cond_4
    aput v1, v5, v1

    .line 187
    .line 188
    iget v1, v0, Lo/x;->b:I

    .line 189
    .line 190
    add-int/2addr v1, v6

    .line 191
    iput v1, v0, Lo/x;->b:I

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_5
    const-string v0, "Index must be between 0 and size"

    .line 195
    .line 196
    invoke-static {v0}, Lp/a;->d(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    throw v0

    .line 201
    :cond_6
    :goto_5
    iget v1, v2, Lr/g0;->a:I

    .line 202
    .line 203
    invoke-virtual {v3, v1}, Lo/m;->a(I)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_7

    .line 208
    .line 209
    iget v1, v2, Lr/g0;->a:I

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lo/x;->a(I)V

    .line 212
    .line 213
    .line 214
    :cond_7
    iget v1, v0, Lo/x;->b:I

    .line 215
    .line 216
    if-nez v1, :cond_8

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_8
    iget-object v3, v0, Lo/x;->a:[I

    .line 220
    .line 221
    const-string v5, "<this>"

    .line 222
    .line 223
    invoke-static {v3, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const/4 v5, 0x0

    .line 227
    invoke-static {v3, v5, v1}, Ljava/util/Arrays;->sort([III)V

    .line 228
    .line 229
    .line 230
    :goto_6
    new-instance v1, Lr/e2;

    .line 231
    .line 232
    iget v2, v2, Lr/g0;->a:I

    .line 233
    .line 234
    sget-object v3, Lr/w;->d:Lm4/d1;

    .line 235
    .line 236
    invoke-direct {v1, v0, v4, v2, v3}, Lr/e2;-><init>(Lo/x;Lo/y;ILr/v;)V

    .line 237
    .line 238
    .line 239
    return-object v1
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
