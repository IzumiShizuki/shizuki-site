.class public final Lb7/a2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lm4/w0;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lb7/c2;Lb7/z3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb7/a2;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    return-void
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
.method public final B(IZ)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p0

    .line 13
    .line 14
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lb7/z3;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v1

    .line 65
    .line 66
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 67
    .line 68
    move-object/from16 v20, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 71
    .line 72
    move/from16 v23, v1

    .line 73
    .line 74
    iget v1, v2, Lb7/v3;->u:I

    .line 75
    .line 76
    move/from16 v24, v1

    .line 77
    .line 78
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 79
    .line 80
    move/from16 v27, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 83
    .line 84
    move/from16 v28, v1

    .line 85
    .line 86
    iget v1, v2, Lb7/v3;->x:I

    .line 87
    .line 88
    move/from16 v25, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->y:I

    .line 91
    .line 92
    move/from16 v26, v1

    .line 93
    .line 94
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 95
    .line 96
    move-object/from16 v21, v3

    .line 97
    .line 98
    move-object/from16 v16, v4

    .line 99
    .line 100
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 101
    .line 102
    move-wide/from16 v30, v3

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 105
    .line 106
    move-wide/from16 v32, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 109
    .line 110
    move-object/from16 v29, v1

    .line 111
    .line 112
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 113
    .line 114
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 115
    .line 116
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 117
    .line 118
    .line 119
    move-result v22

    .line 120
    move-object/from16 v36, v1

    .line 121
    .line 122
    if-nez v22, :cond_3

    .line 123
    .line 124
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 125
    .line 126
    iget v1, v1, Lm4/x0;->b:I

    .line 127
    .line 128
    move-object/from16 v37, v2

    .line 129
    .line 130
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-ge v1, v2, :cond_2

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_2
    const/4 v1, 0x0

    .line 138
    goto :goto_1

    .line 139
    :cond_3
    move-object/from16 v37, v2

    .line 140
    .line 141
    :goto_0
    const/4 v1, 0x1

    .line 142
    :goto_1
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 143
    .line 144
    .line 145
    move-wide/from16 v34, v3

    .line 146
    .line 147
    new-instance v3, Lb7/v3;

    .line 148
    .line 149
    move/from16 v22, p2

    .line 150
    .line 151
    move-object/from16 v4, v16

    .line 152
    .line 153
    move-object/from16 v16, v21

    .line 154
    .line 155
    move/from16 v21, p1

    .line 156
    .line 157
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 158
    .line 159
    .line 160
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 161
    .line 162
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 163
    .line 164
    const/4 v2, 0x1

    .line 165
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 166
    .line 167
    .line 168
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 169
    .line 170
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 171
    .line 172
    iget-object v0, v0, Lb7/l2;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lb7/o2;

    .line 175
    .line 176
    iget-object v0, v0, Lb7/o2;->n:Lb7/x3;

    .line 177
    .line 178
    if-eqz v0, :cond_5

    .line 179
    .line 180
    if-eqz p2, :cond_4

    .line 181
    .line 182
    const/4 v1, 0x0

    .line 183
    goto :goto_2

    .line 184
    :cond_4
    move/from16 v1, p1

    .line 185
    .line 186
    :goto_2
    iput v1, v0, Lb7/x3;->d:I

    .line 187
    .line 188
    invoke-virtual {v0}, Lb7/x3;->a()Landroid/media/VolumeProvider;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, v1}, Landroid/media/VolumeProvider;->setCurrentVolume(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    .line 194
    .line 195
    :cond_5
    :goto_3
    return-void

    .line 196
    :catch_0
    move-exception v0

    .line 197
    const-string v1, "MediaSessionImpl"

    .line 198
    .line 199
    const-string v2, "Exception in using media1 API"

    .line 200
    .line 201
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    return-void
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

.method public final C(J)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v1

    .line 65
    .line 66
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 67
    .line 68
    move-object/from16 v20, v1

    .line 69
    .line 70
    iget v1, v2, Lb7/v3;->r:I

    .line 71
    .line 72
    move/from16 v21, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 75
    .line 76
    move/from16 v22, v1

    .line 77
    .line 78
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 79
    .line 80
    move/from16 v23, v1

    .line 81
    .line 82
    iget v1, v2, Lb7/v3;->u:I

    .line 83
    .line 84
    move/from16 v24, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 87
    .line 88
    move/from16 v27, v1

    .line 89
    .line 90
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 91
    .line 92
    move/from16 v28, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->x:I

    .line 95
    .line 96
    move/from16 v25, v1

    .line 97
    .line 98
    iget v1, v2, Lb7/v3;->y:I

    .line 99
    .line 100
    move/from16 v26, v1

    .line 101
    .line 102
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 103
    .line 104
    move-object/from16 v29, v3

    .line 105
    .line 106
    move-object/from16 v16, v4

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v30, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v31

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v31, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v29

    .line 156
    .line 157
    move-object/from16 v29, v30

    .line 158
    .line 159
    move-wide/from16 v30, p1

    .line 160
    .line 161
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 165
    .line 166
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 173
    .line 174
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :catch_0
    move-exception v0

    .line 181
    const-string v1, "MediaSessionImpl"

    .line 182
    .line 183
    const-string v2, "Exception in using media1 API"

    .line 184
    .line 185
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    return-void
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

.method public final D(Lm4/i0;I)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 31
    .line 32
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 33
    .line 34
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 35
    .line 36
    iget v9, v2, Lb7/v3;->f:I

    .line 37
    .line 38
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 39
    .line 40
    iget v11, v2, Lb7/v3;->h:I

    .line 41
    .line 42
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 43
    .line 44
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 45
    .line 46
    iget v15, v2, Lb7/v3;->k:I

    .line 47
    .line 48
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 49
    .line 50
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 51
    .line 52
    iget v5, v2, Lb7/v3;->n:F

    .line 53
    .line 54
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 55
    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 59
    .line 60
    move-object/from16 v19, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v17, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v17

    .line 156
    .line 157
    move/from16 v17, v5

    .line 158
    .line 159
    move/from16 v5, p2

    .line 160
    .line 161
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 165
    .line 166
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 173
    .line 174
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 175
    .line 176
    move-object/from16 v1, p1

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lb7/l2;->l(Lm4/i0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :catch_0
    move-exception v0

    .line 183
    const-string v1, "MediaSessionImpl"

    .line 184
    .line 185
    const-string v2, "Exception in using media1 API"

    .line 186
    .line 187
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    return-void
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

.method public final E(J)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v1

    .line 65
    .line 66
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 67
    .line 68
    move-object/from16 v20, v1

    .line 69
    .line 70
    iget v1, v2, Lb7/v3;->r:I

    .line 71
    .line 72
    move/from16 v21, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 75
    .line 76
    move/from16 v22, v1

    .line 77
    .line 78
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 79
    .line 80
    move/from16 v23, v1

    .line 81
    .line 82
    iget v1, v2, Lb7/v3;->u:I

    .line 83
    .line 84
    move/from16 v24, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 87
    .line 88
    move/from16 v27, v1

    .line 89
    .line 90
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 91
    .line 92
    move/from16 v28, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->x:I

    .line 95
    .line 96
    move/from16 v25, v1

    .line 97
    .line 98
    iget v1, v2, Lb7/v3;->y:I

    .line 99
    .line 100
    move/from16 v26, v1

    .line 101
    .line 102
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 103
    .line 104
    move-object/from16 v29, v3

    .line 105
    .line 106
    move-object/from16 v16, v4

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 109
    .line 110
    move-wide/from16 v30, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v32, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v33

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v33, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v29

    .line 156
    .line 157
    move-object/from16 v29, v32

    .line 158
    .line 159
    move-wide/from16 v32, p1

    .line 160
    .line 161
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 165
    .line 166
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 173
    .line 174
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :catch_0
    move-exception v0

    .line 181
    const-string v1, "MediaSessionImpl"

    .line 182
    .line 183
    const-string v2, "Exception in using media1 API"

    .line 184
    .line 185
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    return-void
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

.method public final F(Lm4/u1;)V
    .locals 37

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 12
    .line 13
    iget-object v3, v1, Lb7/v3;->a:Lm4/r0;

    .line 14
    .line 15
    iget v4, v1, Lb7/v3;->b:I

    .line 16
    .line 17
    iget-object v5, v1, Lb7/v3;->c:Lb7/h4;

    .line 18
    .line 19
    iget-object v6, v1, Lb7/v3;->d:Lm4/x0;

    .line 20
    .line 21
    iget-object v7, v1, Lb7/v3;->e:Lm4/x0;

    .line 22
    .line 23
    iget v8, v1, Lb7/v3;->f:I

    .line 24
    .line 25
    iget-object v9, v1, Lb7/v3;->g:Lm4/s0;

    .line 26
    .line 27
    iget v10, v1, Lb7/v3;->h:I

    .line 28
    .line 29
    iget-boolean v11, v1, Lb7/v3;->i:Z

    .line 30
    .line 31
    iget-object v13, v1, Lb7/v3;->j:Lm4/i1;

    .line 32
    .line 33
    iget v14, v1, Lb7/v3;->k:I

    .line 34
    .line 35
    iget-object v15, v1, Lb7/v3;->m:Lm4/l0;

    .line 36
    .line 37
    iget v2, v1, Lb7/v3;->n:F

    .line 38
    .line 39
    iget-object v12, v1, Lb7/v3;->o:Lm4/d;

    .line 40
    .line 41
    move/from16 v16, v2

    .line 42
    .line 43
    iget-object v2, v1, Lb7/v3;->p:Lo4/c;

    .line 44
    .line 45
    move-object/from16 v18, v2

    .line 46
    .line 47
    iget-object v2, v1, Lb7/v3;->q:Lm4/k;

    .line 48
    .line 49
    move-object/from16 v19, v2

    .line 50
    .line 51
    iget v2, v1, Lb7/v3;->r:I

    .line 52
    .line 53
    move/from16 v20, v2

    .line 54
    .line 55
    iget-boolean v2, v1, Lb7/v3;->s:Z

    .line 56
    .line 57
    move/from16 v21, v2

    .line 58
    .line 59
    iget-boolean v2, v1, Lb7/v3;->t:Z

    .line 60
    .line 61
    move/from16 v22, v2

    .line 62
    .line 63
    iget v2, v1, Lb7/v3;->u:I

    .line 64
    .line 65
    move/from16 v23, v2

    .line 66
    .line 67
    iget-boolean v2, v1, Lb7/v3;->v:Z

    .line 68
    .line 69
    move/from16 v26, v2

    .line 70
    .line 71
    iget-boolean v2, v1, Lb7/v3;->w:Z

    .line 72
    .line 73
    move/from16 v27, v2

    .line 74
    .line 75
    iget v2, v1, Lb7/v3;->x:I

    .line 76
    .line 77
    move/from16 v24, v2

    .line 78
    .line 79
    iget v2, v1, Lb7/v3;->y:I

    .line 80
    .line 81
    move/from16 v25, v2

    .line 82
    .line 83
    iget-object v2, v1, Lb7/v3;->z:Lm4/l0;

    .line 84
    .line 85
    move-object/from16 v28, v2

    .line 86
    .line 87
    move-object/from16 v17, v3

    .line 88
    .line 89
    iget-wide v2, v1, Lb7/v3;->A:J

    .line 90
    .line 91
    move-wide/from16 v29, v2

    .line 92
    .line 93
    iget-wide v2, v1, Lb7/v3;->B:J

    .line 94
    .line 95
    move-wide/from16 v31, v2

    .line 96
    .line 97
    iget-wide v2, v1, Lb7/v3;->C:J

    .line 98
    .line 99
    move-wide/from16 v33, v2

    .line 100
    .line 101
    iget-object v2, v1, Lb7/v3;->D:Lm4/q1;

    .line 102
    .line 103
    iget-object v1, v1, Lb7/v3;->E:Lm4/o1;

    .line 104
    .line 105
    invoke-virtual {v13}, Lm4/i1;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    move-object/from16 v36, v1

    .line 110
    .line 111
    if-nez v3, :cond_2

    .line 112
    .line 113
    iget-object v3, v5, Lb7/h4;->a:Lm4/x0;

    .line 114
    .line 115
    iget v3, v3, Lm4/x0;->b:I

    .line 116
    .line 117
    invoke-virtual {v13}, Lm4/i1;->o()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-ge v3, v1, :cond_1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    const/4 v1, 0x0

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 127
    :goto_1
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 128
    .line 129
    .line 130
    move-object/from16 v35, v2

    .line 131
    .line 132
    new-instance v2, Lb7/v3;

    .line 133
    .line 134
    move-object/from16 v3, v17

    .line 135
    .line 136
    move-object/from16 v17, v12

    .line 137
    .line 138
    move-object/from16 v12, p1

    .line 139
    .line 140
    invoke-direct/range {v2 .. v36}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 141
    .line 142
    .line 143
    iput-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 144
    .line 145
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 146
    .line 147
    const/4 v2, 0x1

    .line 148
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 149
    .line 150
    .line 151
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 152
    .line 153
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :catch_0
    move-exception v0

    .line 160
    const-string v1, "MediaSessionImpl"

    .line 161
    .line 162
    const-string v2, "Exception in using media1 API"

    .line 163
    .line 164
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    return-void
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

.method public final I()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lb5/a;

    .line 12
    .line 13
    const/16 v2, 0xd

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lb7/c2;->c(Lb7/b2;)V

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
.end method

.method public final synthetic J(Z)V
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

.method public final synthetic K(Ljava/util/List;)V
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

.method public final synthetic L(IZ)V
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

.method public final synthetic M(Lm4/v0;)V
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

.method public final N(J)V
    .locals 40

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v1

    .line 65
    .line 66
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 67
    .line 68
    move-object/from16 v20, v1

    .line 69
    .line 70
    iget v1, v2, Lb7/v3;->r:I

    .line 71
    .line 72
    move/from16 v21, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 75
    .line 76
    move/from16 v22, v1

    .line 77
    .line 78
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 79
    .line 80
    move/from16 v23, v1

    .line 81
    .line 82
    iget v1, v2, Lb7/v3;->u:I

    .line 83
    .line 84
    move/from16 v24, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 87
    .line 88
    move/from16 v27, v1

    .line 89
    .line 90
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 91
    .line 92
    move/from16 v28, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->x:I

    .line 95
    .line 96
    move/from16 v25, v1

    .line 97
    .line 98
    iget v1, v2, Lb7/v3;->y:I

    .line 99
    .line 100
    move/from16 v26, v1

    .line 101
    .line 102
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 103
    .line 104
    move-object/from16 v29, v3

    .line 105
    .line 106
    move-object/from16 v16, v4

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 109
    .line 110
    move-wide/from16 v30, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 113
    .line 114
    move-object/from16 v32, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v33

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v33, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v38, v3

    .line 150
    .line 151
    move-object/from16 v4, v16

    .line 152
    .line 153
    move-object/from16 v16, v29

    .line 154
    .line 155
    move-object/from16 v29, v32

    .line 156
    .line 157
    move-wide/from16 v32, v38

    .line 158
    .line 159
    new-instance v3, Lb7/v3;

    .line 160
    .line 161
    move-wide/from16 v34, p1

    .line 162
    .line 163
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 164
    .line 165
    .line 166
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 167
    .line 168
    iget-object v0, v0, Lb7/c2;->c:Lb7/z1;

    .line 169
    .line 170
    const/4 v1, 0x1

    .line 171
    invoke-virtual {v0, v1, v1}, Lb7/z1;->a(ZZ)V

    .line 172
    .line 173
    .line 174
    return-void
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

.method public final synthetic O(Lm4/r0;)V
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

.method public final synthetic P(II)V
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

.method public final synthetic Q(Lm4/n0;)V
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

.method public final R(Lm4/d;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 59
    .line 60
    move-object/from16 v19, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v18, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v18

    .line 156
    .line 157
    move-object/from16 v18, p1

    .line 158
    .line 159
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 160
    .line 161
    .line 162
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 163
    .line 164
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 171
    .line 172
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 173
    .line 174
    move-object/from16 v1, p1

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lb7/l2;->j(Lm4/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :catch_0
    move-exception v0

    .line 181
    const-string v1, "MediaSessionImpl"

    .line 182
    .line 183
    const-string v2, "Exception in using media1 API"

    .line 184
    .line 185
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    return-void
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

.method public final S(Lm4/o1;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lb7/v3;->h(Lm4/o1;)Lb7/v3;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 29
    .line 30
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lb5/a;

    .line 37
    .line 38
    const/16 v2, 0xc

    .line 39
    .line 40
    invoke-direct {v1, v2, p1}, Lb5/a;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lb7/c2;->c(Lb7/b2;)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public final U(Z)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    move-object/from16 v2, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p0

    .line 14
    .line 15
    iget-object v0, v2, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lb7/z3;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v0, v1, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v0, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v0, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v0, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v0, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v0, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v0, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v0, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v0, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v0, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v0, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v0, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v0, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v0, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v2, v0, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v2

    .line 57
    .line 58
    iget-object v2, v0, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v2

    .line 61
    .line 62
    iget-object v2, v0, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v2

    .line 65
    .line 66
    iget-object v2, v0, Lb7/v3;->q:Lm4/k;

    .line 67
    .line 68
    move-object/from16 v20, v2

    .line 69
    .line 70
    iget v2, v0, Lb7/v3;->r:I

    .line 71
    .line 72
    move/from16 v21, v2

    .line 73
    .line 74
    iget-boolean v2, v0, Lb7/v3;->s:Z

    .line 75
    .line 76
    move/from16 v22, v2

    .line 77
    .line 78
    iget-boolean v2, v0, Lb7/v3;->t:Z

    .line 79
    .line 80
    move/from16 v23, v2

    .line 81
    .line 82
    iget v2, v0, Lb7/v3;->u:I

    .line 83
    .line 84
    move/from16 v24, v2

    .line 85
    .line 86
    iget-boolean v2, v0, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v2

    .line 89
    .line 90
    iget v2, v0, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v2

    .line 93
    .line 94
    iget v2, v0, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v2

    .line 97
    .line 98
    iget-object v2, v0, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v29, v2

    .line 101
    .line 102
    move-object/from16 v16, v3

    .line 103
    .line 104
    iget-wide v2, v0, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v2

    .line 107
    .line 108
    iget-wide v2, v0, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v2

    .line 111
    .line 112
    iget-wide v2, v0, Lb7/v3;->C:J

    .line 113
    .line 114
    move-wide/from16 v34, v2

    .line 115
    .line 116
    iget-object v2, v0, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v0, v0, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    move-object/from16 v37, v0

    .line 125
    .line 126
    if-nez v3, :cond_3

    .line 127
    .line 128
    iget-object v3, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v3, v3, Lm4/x0;->b:I

    .line 131
    .line 132
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-ge v3, v0, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    const/4 v0, 0x0

    .line 140
    goto :goto_2

    .line 141
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 142
    :goto_2
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 143
    .line 144
    .line 145
    new-instance v3, Lb7/v3;

    .line 146
    .line 147
    move/from16 v27, p1

    .line 148
    .line 149
    move-object/from16 v36, v2

    .line 150
    .line 151
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 152
    .line 153
    .line 154
    iput-object v3, v1, Lb7/c2;->s:Lb7/v3;

    .line 155
    .line 156
    iget-object v0, v1, Lb7/c2;->c:Lb7/z1;

    .line 157
    .line 158
    const/4 v2, 0x1

    .line 159
    invoke-virtual {v0, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 160
    .line 161
    .line 162
    :try_start_0
    iget-object v0, v1, Lb7/c2;->h:Lb7/o2;

    .line 163
    .line 164
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 165
    .line 166
    iget-object v0, v0, Lb7/l2;->e:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Lb7/o2;

    .line 169
    .line 170
    iget-object v2, v0, Lb7/o2;->g:Lb7/c2;

    .line 171
    .line 172
    iget-object v2, v2, Lb7/c2;->t:Lb7/z3;

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Lb7/o2;->M(Lb7/z3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :catch_0
    move-exception v0

    .line 179
    const-string v2, "MediaSessionImpl"

    .line 180
    .line 181
    const-string v3, "Exception in using media1 API"

    .line 182
    .line 183
    invoke-static {v2, v3, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :goto_3
    invoke-virtual {v1}, Lb7/c2;->s()V

    .line 187
    .line 188
    .line 189
    return-void
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

.method public final a()Lb7/c2;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/a2;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lb7/c2;

    .line 8
    .line 9
    return-object v0
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

.method public final b(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 23
    .line 24
    iget-boolean v2, v1, Lb7/v3;->t:Z

    .line 25
    .line 26
    iget v3, v1, Lb7/v3;->u:I

    .line 27
    .line 28
    invoke-virtual {v1, v3, p1, v2}, Lb7/v3;->b(IIZ)Lb7/v3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, v0, Lb7/c2;->s:Lb7/v3;

    .line 33
    .line 34
    iget-object p1, v0, Lb7/c2;->c:Lb7/z1;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {p1, v1, v1}, Lb7/z1;->a(ZZ)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    iget-object p1, v0, Lb7/c2;->h:Lb7/o2;

    .line 41
    .line 42
    iget-object p1, p1, Lb7/o2;->i:Lb7/l2;

    .line 43
    .line 44
    iget-object p1, p1, Lb7/l2;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lb7/o2;

    .line 47
    .line 48
    iget-object v0, p1, Lb7/o2;->g:Lb7/c2;

    .line 49
    .line 50
    iget-object v0, v0, Lb7/c2;->t:Lb7/z3;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lb7/o2;->M(Lb7/z3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p1

    .line 57
    const-string v0, "MediaSessionImpl"

    .line 58
    .line 59
    const-string v1, "Exception in using media1 API"

    .line 60
    .line 61
    invoke-static {v0, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-void
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

.method public final synthetic c(Z)V
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

.method public final d(I)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 43
    .line 44
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 45
    .line 46
    iget v15, v2, Lb7/v3;->k:I

    .line 47
    .line 48
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 49
    .line 50
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 51
    .line 52
    iget v11, v2, Lb7/v3;->n:F

    .line 53
    .line 54
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 55
    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 59
    .line 60
    move-object/from16 v19, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v17, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v17

    .line 156
    .line 157
    move/from16 v17, v11

    .line 158
    .line 159
    move/from16 v11, p1

    .line 160
    .line 161
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 165
    .line 166
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 173
    .line 174
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 175
    .line 176
    move/from16 v11, p1

    .line 177
    .line 178
    invoke-virtual {v0, v11}, Lb7/l2;->o(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :catch_0
    move-exception v0

    .line 183
    const-string v1, "MediaSessionImpl"

    .line 184
    .line 185
    const-string v2, "Exception in using media1 API"

    .line 186
    .line 187
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    return-void
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

.method public final synthetic e(I)V
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

.method public final f(Lm4/l0;)V
    .locals 37

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 12
    .line 13
    iget-object v3, v1, Lb7/v3;->a:Lm4/r0;

    .line 14
    .line 15
    iget v4, v1, Lb7/v3;->b:I

    .line 16
    .line 17
    iget-object v5, v1, Lb7/v3;->c:Lb7/h4;

    .line 18
    .line 19
    iget-object v6, v1, Lb7/v3;->d:Lm4/x0;

    .line 20
    .line 21
    iget-object v7, v1, Lb7/v3;->e:Lm4/x0;

    .line 22
    .line 23
    iget v8, v1, Lb7/v3;->f:I

    .line 24
    .line 25
    iget-object v9, v1, Lb7/v3;->g:Lm4/s0;

    .line 26
    .line 27
    iget v10, v1, Lb7/v3;->h:I

    .line 28
    .line 29
    iget-boolean v11, v1, Lb7/v3;->i:Z

    .line 30
    .line 31
    iget-object v13, v1, Lb7/v3;->j:Lm4/i1;

    .line 32
    .line 33
    iget v14, v1, Lb7/v3;->k:I

    .line 34
    .line 35
    iget-object v12, v1, Lb7/v3;->l:Lm4/u1;

    .line 36
    .line 37
    iget v2, v1, Lb7/v3;->n:F

    .line 38
    .line 39
    iget-object v15, v1, Lb7/v3;->o:Lm4/d;

    .line 40
    .line 41
    move/from16 v16, v2

    .line 42
    .line 43
    iget-object v2, v1, Lb7/v3;->p:Lo4/c;

    .line 44
    .line 45
    move-object/from16 v18, v2

    .line 46
    .line 47
    iget-object v2, v1, Lb7/v3;->q:Lm4/k;

    .line 48
    .line 49
    move-object/from16 v19, v2

    .line 50
    .line 51
    iget v2, v1, Lb7/v3;->r:I

    .line 52
    .line 53
    move/from16 v20, v2

    .line 54
    .line 55
    iget-boolean v2, v1, Lb7/v3;->s:Z

    .line 56
    .line 57
    move/from16 v21, v2

    .line 58
    .line 59
    iget-boolean v2, v1, Lb7/v3;->t:Z

    .line 60
    .line 61
    move/from16 v22, v2

    .line 62
    .line 63
    iget v2, v1, Lb7/v3;->u:I

    .line 64
    .line 65
    move/from16 v23, v2

    .line 66
    .line 67
    iget-boolean v2, v1, Lb7/v3;->v:Z

    .line 68
    .line 69
    move/from16 v26, v2

    .line 70
    .line 71
    iget-boolean v2, v1, Lb7/v3;->w:Z

    .line 72
    .line 73
    move/from16 v27, v2

    .line 74
    .line 75
    iget v2, v1, Lb7/v3;->x:I

    .line 76
    .line 77
    move/from16 v24, v2

    .line 78
    .line 79
    iget v2, v1, Lb7/v3;->y:I

    .line 80
    .line 81
    move/from16 v25, v2

    .line 82
    .line 83
    iget-object v2, v1, Lb7/v3;->z:Lm4/l0;

    .line 84
    .line 85
    move-object/from16 v28, v2

    .line 86
    .line 87
    move-object/from16 v17, v3

    .line 88
    .line 89
    iget-wide v2, v1, Lb7/v3;->A:J

    .line 90
    .line 91
    move-wide/from16 v29, v2

    .line 92
    .line 93
    iget-wide v2, v1, Lb7/v3;->B:J

    .line 94
    .line 95
    move-wide/from16 v31, v2

    .line 96
    .line 97
    iget-wide v2, v1, Lb7/v3;->C:J

    .line 98
    .line 99
    move-wide/from16 v33, v2

    .line 100
    .line 101
    iget-object v2, v1, Lb7/v3;->D:Lm4/q1;

    .line 102
    .line 103
    iget-object v1, v1, Lb7/v3;->E:Lm4/o1;

    .line 104
    .line 105
    invoke-virtual {v13}, Lm4/i1;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_2

    .line 110
    .line 111
    iget-object v3, v5, Lb7/h4;->a:Lm4/x0;

    .line 112
    .line 113
    iget v3, v3, Lm4/x0;->b:I

    .line 114
    .line 115
    move-object/from16 v36, v1

    .line 116
    .line 117
    invoke-virtual {v13}, Lm4/i1;->o()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-ge v3, v1, :cond_1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    const/4 v1, 0x0

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move-object/from16 v36, v1

    .line 127
    .line 128
    :goto_0
    const/4 v1, 0x1

    .line 129
    :goto_1
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 130
    .line 131
    .line 132
    move-object/from16 v35, v2

    .line 133
    .line 134
    new-instance v2, Lb7/v3;

    .line 135
    .line 136
    move-object/from16 v3, v17

    .line 137
    .line 138
    move-object/from16 v17, v15

    .line 139
    .line 140
    move-object/from16 v15, p1

    .line 141
    .line 142
    invoke-direct/range {v2 .. v36}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 143
    .line 144
    .line 145
    iput-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 146
    .line 147
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 148
    .line 149
    const/4 v2, 0x1

    .line 150
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 151
    .line 152
    .line 153
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 154
    .line 155
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 156
    .line 157
    move-object/from16 v15, p1

    .line 158
    .line 159
    invoke-virtual {v0, v15}, Lb7/l2;->n(Lm4/l0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :catch_0
    move-exception v0

    .line 164
    const-string v1, "MediaSessionImpl"

    .line 165
    .line 166
    const-string v2, "Exception in using media1 API"

    .line 167
    .line 168
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    return-void
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

.method public final g(Lm4/x0;Lm4/x0;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2, p3}, Lb7/v3;->d(Lm4/x0;Lm4/x0;I)Lb7/v3;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v0, Lb7/c2;->s:Lb7/v3;

    .line 29
    .line 30
    iget-object p1, v0, Lb7/c2;->c:Lb7/z1;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {p1, p2, p2}, Lb7/z1;->a(ZZ)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object p1, v0, Lb7/c2;->h:Lb7/o2;

    .line 37
    .line 38
    iget-object p1, p1, Lb7/o2;->i:Lb7/l2;

    .line 39
    .line 40
    iget-object p1, p1, Lb7/l2;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lb7/o2;

    .line 43
    .line 44
    iget-object p2, p1, Lb7/o2;->g:Lb7/c2;

    .line 45
    .line 46
    iget-object p2, p2, Lb7/c2;->t:Lb7/z3;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lb7/o2;->M(Lb7/z3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception p1

    .line 53
    const-string p2, "MediaSessionImpl"

    .line 54
    .line 55
    const-string p3, "Exception in using media1 API"

    .line 56
    .line 57
    invoke-static {p2, p3, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void
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

.method public final h(Lm4/l0;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v1

    .line 65
    .line 66
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 67
    .line 68
    move-object/from16 v20, v1

    .line 69
    .line 70
    iget v1, v2, Lb7/v3;->r:I

    .line 71
    .line 72
    move/from16 v21, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 75
    .line 76
    move/from16 v22, v1

    .line 77
    .line 78
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 79
    .line 80
    move/from16 v23, v1

    .line 81
    .line 82
    iget v1, v2, Lb7/v3;->u:I

    .line 83
    .line 84
    move/from16 v24, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 87
    .line 88
    move/from16 v27, v1

    .line 89
    .line 90
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 91
    .line 92
    move/from16 v28, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->x:I

    .line 95
    .line 96
    move/from16 v25, v1

    .line 97
    .line 98
    iget v1, v2, Lb7/v3;->y:I

    .line 99
    .line 100
    move-object/from16 v26, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v26

    .line 156
    .line 157
    move/from16 v26, v29

    .line 158
    .line 159
    move-object/from16 v29, p1

    .line 160
    .line 161
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 165
    .line 166
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 173
    .line 174
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 175
    .line 176
    invoke-virtual {v0}, Lb7/l2;->r()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :catch_0
    move-exception v0

    .line 181
    const-string v1, "MediaSessionImpl"

    .line 182
    .line 183
    const-string v2, "Exception in using media1 API"

    .line 184
    .line 185
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    return-void
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

.method public final i(Lm4/r0;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget v5, v2, Lb7/v3;->b:I

    .line 29
    .line 30
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 31
    .line 32
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 33
    .line 34
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 35
    .line 36
    iget v9, v2, Lb7/v3;->f:I

    .line 37
    .line 38
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 39
    .line 40
    iget v11, v2, Lb7/v3;->h:I

    .line 41
    .line 42
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 43
    .line 44
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 45
    .line 46
    iget v15, v2, Lb7/v3;->k:I

    .line 47
    .line 48
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 49
    .line 50
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 51
    .line 52
    iget v4, v2, Lb7/v3;->n:F

    .line 53
    .line 54
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 55
    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 59
    .line 60
    move-object/from16 v19, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v16, v3

    .line 101
    .line 102
    move/from16 v17, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, p1

    .line 154
    .line 155
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 156
    .line 157
    .line 158
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 159
    .line 160
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 161
    .line 162
    const/4 v2, 0x1

    .line 163
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 164
    .line 165
    .line 166
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 167
    .line 168
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 169
    .line 170
    iget-object v0, v0, Lb7/l2;->e:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Lb7/o2;

    .line 173
    .line 174
    iget-object v1, v0, Lb7/o2;->g:Lb7/c2;

    .line 175
    .line 176
    iget-object v1, v1, Lb7/c2;->t:Lb7/z3;

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lb7/o2;->M(Lb7/z3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :catch_0
    move-exception v0

    .line 183
    const-string v1, "MediaSessionImpl"

    .line 184
    .line 185
    const-string v2, "Exception in using media1 API"

    .line 186
    .line 187
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    return-void
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

.method public final j(Lm4/q1;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lb7/v3;->a(Lm4/q1;)Lb7/v3;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 29
    .line 30
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v1, v2, v3}, Lb7/z1;->a(ZZ)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lb5/a;

    .line 38
    .line 39
    const/16 v2, 0xb

    .line 40
    .line 41
    invoke-direct {v1, v2, p1}, Lb5/a;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lb7/c2;->c(Lb7/b2;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method public final l(Z)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    move-object/from16 v2, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p0

    .line 14
    .line 15
    iget-object v0, v2, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lb7/z3;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v0, v1, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v0, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v0, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v0, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v0, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v0, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v0, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v0, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v0, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v0, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v0, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v0, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v0, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v0, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v2, v0, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v2

    .line 57
    .line 58
    iget-object v2, v0, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v2

    .line 61
    .line 62
    iget-object v2, v0, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v2

    .line 65
    .line 66
    iget-object v2, v0, Lb7/v3;->q:Lm4/k;

    .line 67
    .line 68
    move-object/from16 v20, v2

    .line 69
    .line 70
    iget v2, v0, Lb7/v3;->r:I

    .line 71
    .line 72
    move/from16 v21, v2

    .line 73
    .line 74
    iget-boolean v2, v0, Lb7/v3;->s:Z

    .line 75
    .line 76
    move/from16 v22, v2

    .line 77
    .line 78
    iget-boolean v2, v0, Lb7/v3;->t:Z

    .line 79
    .line 80
    move/from16 v23, v2

    .line 81
    .line 82
    iget v2, v0, Lb7/v3;->u:I

    .line 83
    .line 84
    move/from16 v24, v2

    .line 85
    .line 86
    iget-boolean v2, v0, Lb7/v3;->v:Z

    .line 87
    .line 88
    move/from16 v27, v2

    .line 89
    .line 90
    iget v2, v0, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v2

    .line 93
    .line 94
    iget v2, v0, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v2

    .line 97
    .line 98
    iget-object v2, v0, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v29, v2

    .line 101
    .line 102
    move-object/from16 v16, v3

    .line 103
    .line 104
    iget-wide v2, v0, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v2

    .line 107
    .line 108
    iget-wide v2, v0, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v2

    .line 111
    .line 112
    iget-wide v2, v0, Lb7/v3;->C:J

    .line 113
    .line 114
    move-wide/from16 v34, v2

    .line 115
    .line 116
    iget-object v2, v0, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v0, v0, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    move-object/from16 v37, v0

    .line 125
    .line 126
    if-nez v3, :cond_3

    .line 127
    .line 128
    iget-object v3, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v3, v3, Lm4/x0;->b:I

    .line 131
    .line 132
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-ge v3, v0, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    const/4 v0, 0x0

    .line 140
    goto :goto_2

    .line 141
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 142
    :goto_2
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 143
    .line 144
    .line 145
    new-instance v3, Lb7/v3;

    .line 146
    .line 147
    move/from16 v28, p1

    .line 148
    .line 149
    move-object/from16 v36, v2

    .line 150
    .line 151
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 152
    .line 153
    .line 154
    iput-object v3, v1, Lb7/c2;->s:Lb7/v3;

    .line 155
    .line 156
    iget-object v0, v1, Lb7/c2;->c:Lb7/z1;

    .line 157
    .line 158
    const/4 v2, 0x1

    .line 159
    invoke-virtual {v0, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 160
    .line 161
    .line 162
    :try_start_0
    iget-object v0, v1, Lb7/c2;->h:Lb7/o2;

    .line 163
    .line 164
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :catch_0
    move-exception v0

    .line 171
    const-string v2, "MediaSessionImpl"

    .line 172
    .line 173
    const-string v3, "Exception in using media1 API"

    .line 174
    .line 175
    invoke-static {v2, v3, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    :goto_3
    invoke-virtual {v1}, Lb7/c2;->s()V

    .line 179
    .line 180
    .line 181
    return-void
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

.method public final m(Lm4/i1;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 23
    .line 24
    invoke-virtual {v1}, Lb7/z3;->g()Lb7/h4;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v2, p1, v1, p2}, Lb7/v3;->g(Lm4/i1;Lb7/h4;I)Lb7/v3;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, v0, Lb7/c2;->s:Lb7/v3;

    .line 33
    .line 34
    iget-object p2, v0, Lb7/c2;->c:Lb7/z1;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p2, v2, v1}, Lb7/z1;->a(ZZ)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object p2, v0, Lb7/c2;->h:Lb7/o2;

    .line 42
    .line 43
    iget-object p2, p2, Lb7/o2;->i:Lb7/l2;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lb7/l2;->q(Lm4/i1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p1

    .line 50
    const-string p2, "MediaSessionImpl"

    .line 51
    .line 52
    const-string v0, "Exception in using media1 API"

    .line 53
    .line 54
    invoke-static {p2, v0, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void
    .line 58
.end method

.method public final n(IZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 23
    .line 24
    iget v2, v1, Lb7/v3;->x:I

    .line 25
    .line 26
    invoke-virtual {v1, p1, v2, p2}, Lb7/v3;->b(IIZ)Lb7/v3;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, v0, Lb7/c2;->s:Lb7/v3;

    .line 31
    .line 32
    iget-object p1, v0, Lb7/c2;->c:Lb7/z1;

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-virtual {p1, p2, p2}, Lb7/z1;->a(ZZ)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget-object p1, v0, Lb7/c2;->h:Lb7/o2;

    .line 39
    .line 40
    iget-object p1, p1, Lb7/o2;->i:Lb7/l2;

    .line 41
    .line 42
    iget-object p1, p1, Lb7/l2;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lb7/o2;

    .line 45
    .line 46
    iget-object p2, p1, Lb7/o2;->g:Lb7/c2;

    .line 47
    .line 48
    iget-object p2, p2, Lb7/c2;->t:Lb7/z3;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lb7/o2;->M(Lb7/z3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p1

    .line 55
    const-string p2, "MediaSessionImpl"

    .line 56
    .line 57
    const-string v0, "Exception in using media1 API"

    .line 58
    .line 59
    invoke-static {p2, v0, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-void
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

.method public final o(Lm4/s0;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget v11, v2, Lb7/v3;->h:I

    .line 41
    .line 42
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 43
    .line 44
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 45
    .line 46
    iget v15, v2, Lb7/v3;->k:I

    .line 47
    .line 48
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 49
    .line 50
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 51
    .line 52
    iget v10, v2, Lb7/v3;->n:F

    .line 53
    .line 54
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 55
    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 59
    .line 60
    move-object/from16 v19, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v17, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v17

    .line 156
    .line 157
    move/from16 v17, v10

    .line 158
    .line 159
    move-object/from16 v10, p1

    .line 160
    .line 161
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 165
    .line 166
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 173
    .line 174
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 175
    .line 176
    iget-object v0, v0, Lb7/l2;->e:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lb7/o2;

    .line 179
    .line 180
    iget-object v1, v0, Lb7/o2;->g:Lb7/c2;

    .line 181
    .line 182
    iget-object v1, v1, Lb7/c2;->t:Lb7/z3;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lb7/o2;->M(Lb7/z3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :catch_0
    move-exception v0

    .line 189
    const-string v1, "MediaSessionImpl"

    .line 190
    .line 191
    const-string v2, "Exception in using media1 API"

    .line 192
    .line 193
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    return-void
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

.method public final p(F)V
    .locals 37

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lb7/c2;->s:Lb7/v3;

    .line 12
    .line 13
    iget-object v3, v1, Lb7/v3;->a:Lm4/r0;

    .line 14
    .line 15
    iget v4, v1, Lb7/v3;->b:I

    .line 16
    .line 17
    iget-object v5, v1, Lb7/v3;->c:Lb7/h4;

    .line 18
    .line 19
    iget-object v6, v1, Lb7/v3;->d:Lm4/x0;

    .line 20
    .line 21
    iget-object v7, v1, Lb7/v3;->e:Lm4/x0;

    .line 22
    .line 23
    iget v8, v1, Lb7/v3;->f:I

    .line 24
    .line 25
    iget-object v9, v1, Lb7/v3;->g:Lm4/s0;

    .line 26
    .line 27
    iget v10, v1, Lb7/v3;->h:I

    .line 28
    .line 29
    iget-boolean v11, v1, Lb7/v3;->i:Z

    .line 30
    .line 31
    iget-object v13, v1, Lb7/v3;->j:Lm4/i1;

    .line 32
    .line 33
    iget v14, v1, Lb7/v3;->k:I

    .line 34
    .line 35
    iget-object v12, v1, Lb7/v3;->l:Lm4/u1;

    .line 36
    .line 37
    iget-object v15, v1, Lb7/v3;->m:Lm4/l0;

    .line 38
    .line 39
    iget-object v2, v1, Lb7/v3;->o:Lm4/d;

    .line 40
    .line 41
    move-object/from16 v17, v2

    .line 42
    .line 43
    iget-object v2, v1, Lb7/v3;->p:Lo4/c;

    .line 44
    .line 45
    move-object/from16 v18, v2

    .line 46
    .line 47
    iget-object v2, v1, Lb7/v3;->q:Lm4/k;

    .line 48
    .line 49
    move-object/from16 v19, v2

    .line 50
    .line 51
    iget v2, v1, Lb7/v3;->r:I

    .line 52
    .line 53
    move/from16 v20, v2

    .line 54
    .line 55
    iget-boolean v2, v1, Lb7/v3;->s:Z

    .line 56
    .line 57
    move/from16 v21, v2

    .line 58
    .line 59
    iget-boolean v2, v1, Lb7/v3;->t:Z

    .line 60
    .line 61
    move/from16 v22, v2

    .line 62
    .line 63
    iget v2, v1, Lb7/v3;->u:I

    .line 64
    .line 65
    move/from16 v23, v2

    .line 66
    .line 67
    iget-boolean v2, v1, Lb7/v3;->v:Z

    .line 68
    .line 69
    move/from16 v26, v2

    .line 70
    .line 71
    iget-boolean v2, v1, Lb7/v3;->w:Z

    .line 72
    .line 73
    move/from16 v27, v2

    .line 74
    .line 75
    iget v2, v1, Lb7/v3;->x:I

    .line 76
    .line 77
    move/from16 v24, v2

    .line 78
    .line 79
    iget v2, v1, Lb7/v3;->y:I

    .line 80
    .line 81
    move/from16 v25, v2

    .line 82
    .line 83
    iget-object v2, v1, Lb7/v3;->z:Lm4/l0;

    .line 84
    .line 85
    move-object/from16 v28, v2

    .line 86
    .line 87
    move-object/from16 v16, v3

    .line 88
    .line 89
    iget-wide v2, v1, Lb7/v3;->A:J

    .line 90
    .line 91
    move-wide/from16 v29, v2

    .line 92
    .line 93
    iget-wide v2, v1, Lb7/v3;->B:J

    .line 94
    .line 95
    move-wide/from16 v31, v2

    .line 96
    .line 97
    iget-wide v2, v1, Lb7/v3;->C:J

    .line 98
    .line 99
    move-wide/from16 v33, v2

    .line 100
    .line 101
    iget-object v2, v1, Lb7/v3;->D:Lm4/q1;

    .line 102
    .line 103
    iget-object v1, v1, Lb7/v3;->E:Lm4/o1;

    .line 104
    .line 105
    invoke-virtual {v13}, Lm4/i1;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_2

    .line 110
    .line 111
    iget-object v3, v5, Lb7/h4;->a:Lm4/x0;

    .line 112
    .line 113
    iget v3, v3, Lm4/x0;->b:I

    .line 114
    .line 115
    move-object/from16 v36, v1

    .line 116
    .line 117
    invoke-virtual {v13}, Lm4/i1;->o()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-ge v3, v1, :cond_1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    const/4 v1, 0x0

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move-object/from16 v36, v1

    .line 127
    .line 128
    :goto_0
    const/4 v1, 0x1

    .line 129
    :goto_1
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 130
    .line 131
    .line 132
    move-object/from16 v35, v2

    .line 133
    .line 134
    new-instance v2, Lb7/v3;

    .line 135
    .line 136
    move-object/from16 v3, v16

    .line 137
    .line 138
    move/from16 v16, p1

    .line 139
    .line 140
    invoke-direct/range {v2 .. v36}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 141
    .line 142
    .line 143
    iput-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 144
    .line 145
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 146
    .line 147
    const/4 v2, 0x1

    .line 148
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 149
    .line 150
    .line 151
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 152
    .line 153
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :catch_0
    move-exception v0

    .line 160
    const-string v1, "MediaSessionImpl"

    .line 161
    .line 162
    const-string v2, "Exception in using media1 API"

    .line 163
    .line 164
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    return-void
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

.method public final r(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 23
    .line 24
    invoke-virtual {v1}, Lb7/z3;->B()Lm4/r0;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v2, p1, v3}, Lb7/v3;->c(ILm4/r0;)Lb7/v3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, v0, Lb7/c2;->s:Lb7/v3;

    .line 33
    .line 34
    iget-object p1, v0, Lb7/c2;->c:Lb7/z1;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {p1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    iget-object p1, v0, Lb7/c2;->h:Lb7/o2;

    .line 41
    .line 42
    iget-object p1, p1, Lb7/o2;->i:Lb7/l2;

    .line 43
    .line 44
    invoke-virtual {v1}, Lb7/z3;->B()Lm4/r0;

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, Lb7/l2;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lb7/o2;

    .line 50
    .line 51
    iget-object v0, p1, Lb7/o2;->g:Lb7/c2;

    .line 52
    .line 53
    iget-object v0, v0, Lb7/c2;->t:Lb7/z3;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lb7/o2;->M(Lb7/z3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catch_0
    move-exception p1

    .line 60
    const-string v0, "MediaSessionImpl"

    .line 61
    .line 62
    const-string v1, "Exception in using media1 API"

    .line 63
    .line 64
    invoke-static {v0, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public final s(Lo4/c;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v19, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v19

    .line 156
    .line 157
    move-object/from16 v19, p1

    .line 158
    .line 159
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 160
    .line 161
    .line 162
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 163
    .line 164
    iget-object v0, v0, Lb7/c2;->c:Lb7/z1;

    .line 165
    .line 166
    const/4 v1, 0x1

    .line 167
    invoke-virtual {v0, v1, v1}, Lb7/z1;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    return-void
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

.method public final t(Z)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 45
    .line 46
    iget v15, v2, Lb7/v3;->k:I

    .line 47
    .line 48
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 49
    .line 50
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 51
    .line 52
    iget v12, v2, Lb7/v3;->n:F

    .line 53
    .line 54
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 55
    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 59
    .line 60
    move-object/from16 v19, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->q:Lm4/k;

    .line 63
    .line 64
    move-object/from16 v20, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v17, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v17

    .line 156
    .line 157
    move/from16 v17, v12

    .line 158
    .line 159
    move/from16 v12, p1

    .line 160
    .line 161
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 165
    .line 166
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 170
    .line 171
    .line 172
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 173
    .line 174
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 175
    .line 176
    move/from16 v12, p1

    .line 177
    .line 178
    invoke-virtual {v0, v12}, Lb7/l2;->p(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :catch_0
    move-exception v0

    .line 183
    const-string v1, "MediaSessionImpl"

    .line 184
    .line 185
    const-string v2, "Exception in using media1 API"

    .line 186
    .line 187
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    return-void
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

.method public final u(Lm4/k;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object/from16 v1, p0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    .line 15
    iget-object v2, v1, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7/z3;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    iget-object v2, v0, Lb7/c2;->s:Lb7/v3;

    .line 27
    .line 28
    iget-object v4, v2, Lb7/v3;->a:Lm4/r0;

    .line 29
    .line 30
    iget v5, v2, Lb7/v3;->b:I

    .line 31
    .line 32
    iget-object v6, v2, Lb7/v3;->c:Lb7/h4;

    .line 33
    .line 34
    iget-object v7, v2, Lb7/v3;->d:Lm4/x0;

    .line 35
    .line 36
    iget-object v8, v2, Lb7/v3;->e:Lm4/x0;

    .line 37
    .line 38
    iget v9, v2, Lb7/v3;->f:I

    .line 39
    .line 40
    iget-object v10, v2, Lb7/v3;->g:Lm4/s0;

    .line 41
    .line 42
    iget v11, v2, Lb7/v3;->h:I

    .line 43
    .line 44
    iget-boolean v12, v2, Lb7/v3;->i:Z

    .line 45
    .line 46
    iget-object v14, v2, Lb7/v3;->j:Lm4/i1;

    .line 47
    .line 48
    iget v15, v2, Lb7/v3;->k:I

    .line 49
    .line 50
    iget-object v13, v2, Lb7/v3;->l:Lm4/u1;

    .line 51
    .line 52
    iget-object v3, v2, Lb7/v3;->m:Lm4/l0;

    .line 53
    .line 54
    iget v1, v2, Lb7/v3;->n:F

    .line 55
    .line 56
    move/from16 v17, v1

    .line 57
    .line 58
    iget-object v1, v2, Lb7/v3;->o:Lm4/d;

    .line 59
    .line 60
    move-object/from16 v18, v1

    .line 61
    .line 62
    iget-object v1, v2, Lb7/v3;->p:Lo4/c;

    .line 63
    .line 64
    move-object/from16 v19, v1

    .line 65
    .line 66
    iget v1, v2, Lb7/v3;->r:I

    .line 67
    .line 68
    move/from16 v21, v1

    .line 69
    .line 70
    iget-boolean v1, v2, Lb7/v3;->s:Z

    .line 71
    .line 72
    move/from16 v22, v1

    .line 73
    .line 74
    iget-boolean v1, v2, Lb7/v3;->t:Z

    .line 75
    .line 76
    move/from16 v23, v1

    .line 77
    .line 78
    iget v1, v2, Lb7/v3;->u:I

    .line 79
    .line 80
    move/from16 v24, v1

    .line 81
    .line 82
    iget-boolean v1, v2, Lb7/v3;->v:Z

    .line 83
    .line 84
    move/from16 v27, v1

    .line 85
    .line 86
    iget-boolean v1, v2, Lb7/v3;->w:Z

    .line 87
    .line 88
    move/from16 v28, v1

    .line 89
    .line 90
    iget v1, v2, Lb7/v3;->x:I

    .line 91
    .line 92
    move/from16 v25, v1

    .line 93
    .line 94
    iget v1, v2, Lb7/v3;->y:I

    .line 95
    .line 96
    move/from16 v26, v1

    .line 97
    .line 98
    iget-object v1, v2, Lb7/v3;->z:Lm4/l0;

    .line 99
    .line 100
    move-object/from16 v20, v3

    .line 101
    .line 102
    move-object/from16 v16, v4

    .line 103
    .line 104
    iget-wide v3, v2, Lb7/v3;->A:J

    .line 105
    .line 106
    move-wide/from16 v30, v3

    .line 107
    .line 108
    iget-wide v3, v2, Lb7/v3;->B:J

    .line 109
    .line 110
    move-wide/from16 v32, v3

    .line 111
    .line 112
    iget-wide v3, v2, Lb7/v3;->C:J

    .line 113
    .line 114
    move-object/from16 v29, v1

    .line 115
    .line 116
    iget-object v1, v2, Lb7/v3;->D:Lm4/q1;

    .line 117
    .line 118
    iget-object v2, v2, Lb7/v3;->E:Lm4/o1;

    .line 119
    .line 120
    invoke-virtual {v14}, Lm4/i1;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v34

    .line 124
    move-object/from16 v36, v1

    .line 125
    .line 126
    if-nez v34, :cond_3

    .line 127
    .line 128
    iget-object v1, v6, Lb7/h4;->a:Lm4/x0;

    .line 129
    .line 130
    iget v1, v1, Lm4/x0;->b:I

    .line 131
    .line 132
    move-object/from16 v37, v2

    .line 133
    .line 134
    invoke-virtual {v14}, Lm4/i1;->o()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v1, v2, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    move-object/from16 v37, v2

    .line 144
    .line 145
    :goto_1
    const/4 v1, 0x1

    .line 146
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 147
    .line 148
    .line 149
    move-wide/from16 v34, v3

    .line 150
    .line 151
    new-instance v3, Lb7/v3;

    .line 152
    .line 153
    move-object/from16 v4, v16

    .line 154
    .line 155
    move-object/from16 v16, v20

    .line 156
    .line 157
    move-object/from16 v20, p1

    .line 158
    .line 159
    invoke-direct/range {v3 .. v37}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 160
    .line 161
    .line 162
    iput-object v3, v0, Lb7/c2;->s:Lb7/v3;

    .line 163
    .line 164
    iget-object v1, v0, Lb7/c2;->c:Lb7/z1;

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    invoke-virtual {v1, v2, v2}, Lb7/z1;->a(ZZ)V

    .line 168
    .line 169
    .line 170
    :try_start_0
    iget-object v0, v0, Lb7/c2;->h:Lb7/o2;

    .line 171
    .line 172
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 173
    .line 174
    invoke-virtual {v0}, Lb7/l2;->k()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :catch_0
    move-exception v0

    .line 179
    const-string v1, "MediaSessionImpl"

    .line 180
    .line 181
    const-string v2, "Exception in using media1 API"

    .line 182
    .line 183
    invoke-static {v1, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    return-void
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

.method public final y(Lm4/u0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb7/a2;->a()Lb7/c2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lb7/c2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb7/a2;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lb7/z3;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Lb7/c2;->e(Lm4/u0;)V

    .line 23
    .line 24
    .line 25
    return-void
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
