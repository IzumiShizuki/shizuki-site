.class public final Ld0/w;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lg2/w0;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lu/e1;

.field public final f:I

.field public final g:I

.field public final h:Ld0/j;

.field public final i:Ld0/j;

.field public final j:F

.field public final k:I

.field public final l:Z

.field public final m:Lv/k;

.field public final n:Lg2/w0;

.field public final o:Z

.field public final p:Ljava/util/List;

.field public final q:Ljava/util/List;

.field public final r:Lhf/y;


# direct methods
.method public synthetic constructor <init>(IIIIILv/k;Lg2/w0;Lhf/y;)V
    .locals 19

    const/4 v12, 0x0

    const/4 v15, 0x0

    .line 1
    sget-object v1, Lvb/r;->a:Lvb/r;

    sget-object v5, Lu/e1;->b:Lu/e1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v16, v1

    move-object/from16 v17, v1

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v13, p6

    move-object/from16 v14, p7

    move-object/from16 v18, p8

    invoke-direct/range {v0 .. v18}, Ld0/w;-><init>(Ljava/util/List;IIILu/e1;IILd0/j;Ld0/j;FIZLv/k;Lg2/w0;ZLjava/util/List;Ljava/util/List;Lhf/y;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;IIILu/e1;IILd0/j;Ld0/j;FIZLv/k;Lg2/w0;ZLjava/util/List;Ljava/util/List;Lhf/y;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ld0/w;->a:Ljava/util/List;

    .line 4
    iput p2, p0, Ld0/w;->b:I

    .line 5
    iput p3, p0, Ld0/w;->c:I

    .line 6
    iput p4, p0, Ld0/w;->d:I

    .line 7
    iput-object p5, p0, Ld0/w;->e:Lu/e1;

    .line 8
    iput p6, p0, Ld0/w;->f:I

    .line 9
    iput p7, p0, Ld0/w;->g:I

    .line 10
    iput-object p8, p0, Ld0/w;->h:Ld0/j;

    .line 11
    iput-object p9, p0, Ld0/w;->i:Ld0/j;

    .line 12
    iput p10, p0, Ld0/w;->j:F

    .line 13
    iput p11, p0, Ld0/w;->k:I

    .line 14
    iput-boolean p12, p0, Ld0/w;->l:Z

    .line 15
    iput-object p13, p0, Ld0/w;->m:Lv/k;

    .line 16
    iput-object p14, p0, Ld0/w;->n:Lg2/w0;

    .line 17
    iput-boolean p15, p0, Ld0/w;->o:Z

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Ld0/w;->p:Ljava/util/List;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Ld0/w;->q:Ljava/util/List;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Ld0/w;->r:Lhf/y;

    return-void
.end method


# virtual methods
.method public final a(I)Ld0/w;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ld0/w;->b:I

    .line 6
    .line 7
    iget v3, v0, Ld0/w;->c:I

    .line 8
    .line 9
    add-int/2addr v2, v3

    .line 10
    iget-boolean v3, v0, Ld0/w;->o:Z

    .line 11
    .line 12
    if-nez v3, :cond_8

    .line 13
    .line 14
    iget-object v3, v0, Ld0/w;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_8

    .line 21
    .line 22
    iget-object v4, v0, Ld0/w;->h:Ld0/j;

    .line 23
    .line 24
    if-eqz v4, :cond_8

    .line 25
    .line 26
    iget v4, v0, Ld0/w;->k:I

    .line 27
    .line 28
    sub-int/2addr v4, v1

    .line 29
    if-ltz v4, :cond_8

    .line 30
    .line 31
    if-ge v4, v2, :cond_8

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    int-to-float v5, v1

    .line 36
    int-to-float v6, v2

    .line 37
    div-float/2addr v5, v6

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v5, 0x0

    .line 40
    :goto_0
    iget v6, v0, Ld0/w;->j:F

    .line 41
    .line 42
    sub-float v15, v6, v5

    .line 43
    .line 44
    iget-object v5, v0, Ld0/w;->i:Ld0/j;

    .line 45
    .line 46
    if-eqz v5, :cond_8

    .line 47
    .line 48
    const/high16 v5, 0x3f000000    # 0.5f

    .line 49
    .line 50
    cmpl-float v5, v15, v5

    .line 51
    .line 52
    if-gez v5, :cond_8

    .line 53
    .line 54
    const/high16 v5, -0x41000000    # -0.5f

    .line 55
    .line 56
    cmpg-float v5, v15, v5

    .line 57
    .line 58
    if-gtz v5, :cond_1

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    invoke-static {v3}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ld0/j;

    .line 67
    .line 68
    invoke-static {v3}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ld0/j;

    .line 73
    .line 74
    iget v7, v0, Ld0/w;->g:I

    .line 75
    .line 76
    iget v8, v0, Ld0/w;->f:I

    .line 77
    .line 78
    if-gez v1, :cond_2

    .line 79
    .line 80
    iget v5, v5, Ld0/j;->l:I

    .line 81
    .line 82
    add-int/2addr v5, v2

    .line 83
    sub-int/2addr v5, v8

    .line 84
    iget v6, v6, Ld0/j;->l:I

    .line 85
    .line 86
    add-int/2addr v6, v2

    .line 87
    sub-int/2addr v6, v7

    .line 88
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    neg-int v5, v1

    .line 93
    if-le v2, v5, :cond_8

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget v2, v5, Ld0/j;->l:I

    .line 97
    .line 98
    sub-int/2addr v8, v2

    .line 99
    iget v2, v6, Ld0/j;->l:I

    .line 100
    .line 101
    sub-int/2addr v7, v2

    .line 102
    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-le v2, v1, :cond_8

    .line 107
    .line 108
    :goto_1
    move-object v2, v3

    .line 109
    check-cast v2, Ljava/util/Collection;

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    :goto_2
    if-ge v6, v2, :cond_3

    .line 118
    .line 119
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, Ld0/j;

    .line 124
    .line 125
    invoke-virtual {v7, v1}, Ld0/j;->a(I)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v6, v6, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_3
    iget-object v2, v0, Ld0/w;->p:Ljava/util/List;

    .line 132
    .line 133
    move-object v3, v2

    .line 134
    check-cast v3, Ljava/util/Collection;

    .line 135
    .line 136
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    const/4 v6, 0x0

    .line 141
    :goto_3
    if-ge v6, v3, :cond_4

    .line 142
    .line 143
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    check-cast v7, Ld0/j;

    .line 148
    .line 149
    invoke-virtual {v7, v1}, Ld0/j;->a(I)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v6, v6, 0x1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    iget-object v2, v0, Ld0/w;->q:Ljava/util/List;

    .line 156
    .line 157
    move-object v3, v2

    .line 158
    check-cast v3, Ljava/util/Collection;

    .line 159
    .line 160
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    const/4 v6, 0x0

    .line 165
    :goto_4
    if-ge v6, v3, :cond_5

    .line 166
    .line 167
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    check-cast v7, Ld0/j;

    .line 172
    .line 173
    invoke-virtual {v7, v1}, Ld0/j;->a(I)V

    .line 174
    .line 175
    .line 176
    add-int/lit8 v6, v6, 0x1

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_5
    new-instance v2, Ld0/w;

    .line 180
    .line 181
    iget-boolean v3, v0, Ld0/w;->l:Z

    .line 182
    .line 183
    if-nez v3, :cond_7

    .line 184
    .line 185
    if-lez v1, :cond_6

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_6
    const/16 v17, 0x0

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_7
    :goto_5
    const/4 v5, 0x1

    .line 192
    const/16 v17, 0x1

    .line 193
    .line 194
    :goto_6
    iget-object v1, v0, Ld0/w;->q:Ljava/util/List;

    .line 195
    .line 196
    iget-object v3, v0, Ld0/w;->r:Lhf/y;

    .line 197
    .line 198
    iget-object v6, v0, Ld0/w;->a:Ljava/util/List;

    .line 199
    .line 200
    iget v7, v0, Ld0/w;->b:I

    .line 201
    .line 202
    iget v8, v0, Ld0/w;->c:I

    .line 203
    .line 204
    iget v9, v0, Ld0/w;->d:I

    .line 205
    .line 206
    iget-object v10, v0, Ld0/w;->e:Lu/e1;

    .line 207
    .line 208
    iget v11, v0, Ld0/w;->f:I

    .line 209
    .line 210
    iget v12, v0, Ld0/w;->g:I

    .line 211
    .line 212
    iget-object v13, v0, Ld0/w;->h:Ld0/j;

    .line 213
    .line 214
    iget-object v14, v0, Ld0/w;->i:Ld0/j;

    .line 215
    .line 216
    iget-object v5, v0, Ld0/w;->m:Lv/k;

    .line 217
    .line 218
    move-object/from16 v22, v1

    .line 219
    .line 220
    iget-object v1, v0, Ld0/w;->n:Lg2/w0;

    .line 221
    .line 222
    move-object/from16 v19, v1

    .line 223
    .line 224
    iget-boolean v1, v0, Ld0/w;->o:Z

    .line 225
    .line 226
    move/from16 v20, v1

    .line 227
    .line 228
    iget-object v1, v0, Ld0/w;->p:Ljava/util/List;

    .line 229
    .line 230
    move-object/from16 v21, v1

    .line 231
    .line 232
    move-object/from16 v23, v3

    .line 233
    .line 234
    move/from16 v16, v4

    .line 235
    .line 236
    move-object/from16 v18, v5

    .line 237
    .line 238
    move-object v5, v2

    .line 239
    invoke-direct/range {v5 .. v23}, Ld0/w;-><init>(Ljava/util/List;IIILu/e1;IILd0/j;Ld0/j;FIZLv/k;Lg2/w0;ZLjava/util/List;Ljava/util/List;Lhf/y;)V

    .line 240
    .line 241
    .line 242
    return-object v5

    .line 243
    :cond_8
    :goto_7
    const/4 v1, 0x0

    .line 244
    return-object v1
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

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/w;->n:Lg2/w0;

    .line 2
    .line 3
    invoke-interface {v0}, Lg2/w0;->b()I

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

.method public final c()J
    .locals 7

    .line 1
    iget-object v0, p0, Ld0/w;->n:Lg2/w0;

    .line 2
    .line 3
    invoke-interface {v0}, Lg2/w0;->h()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0}, Lg2/w0;->b()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v1, v1

    .line 12
    const/16 v3, 0x20

    .line 13
    .line 14
    shl-long/2addr v1, v3

    .line 15
    int-to-long v3, v0

    .line 16
    const-wide v5, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v3, v5

    .line 22
    or-long/2addr v1, v3

    .line 23
    return-wide v1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final h()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/w;->n:Lg2/w0;

    .line 2
    .line 3
    invoke-interface {v0}, Lg2/w0;->h()I

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

.method public final i()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/w;->n:Lg2/w0;

    .line 2
    .line 3
    invoke-interface {v0}, Lg2/w0;->i()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/w;->n:Lg2/w0;

    .line 2
    .line 3
    invoke-interface {v0}, Lg2/w0;->j()V

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
.end method

.method public final k()Lic/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/w;->n:Lg2/w0;

    .line 2
    .line 3
    invoke-interface {v0}, Lg2/w0;->k()Lic/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
