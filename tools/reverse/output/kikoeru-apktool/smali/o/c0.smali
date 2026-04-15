.class public final Lo/c0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:[J

.field public b:[J

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 9
    invoke-direct {p0, v0}, Lo/c0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lo/s0;->a:[J

    iput-object v0, p0, Lo/c0;->a:[J

    .line 3
    sget-object v0, Lo/r;->a:[J

    .line 4
    iput-object v0, p0, Lo/c0;->b:[J

    .line 5
    sget-object v0, Lp/a;->c:[Ljava/lang/Object;

    iput-object v0, p0, Lo/c0;->c:[Ljava/lang/Object;

    if-ltz p1, :cond_0

    .line 6
    invoke-static {p1}, Lo/s0;->d(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lo/c0;->f(I)V

    return-void

    .line 7
    :cond_0
    const-string p1, "Capacity must be a positive value."

    .line 8
    invoke-static {p1}, Lp/a;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lo/c0;->e:I

    .line 3
    .line 4
    iget-object v1, p0, Lo/c0;->a:[J

    .line 5
    .line 6
    sget-object v2, Lo/s0;->a:[J

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Lvb/l;->r0([JJ)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lo/c0;->a:[J

    .line 19
    .line 20
    iget v2, p0, Lo/c0;->d:I

    .line 21
    .line 22
    shr-int/lit8 v3, v2, 0x3

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x7

    .line 25
    .line 26
    shl-int/lit8 v2, v2, 0x3

    .line 27
    .line 28
    aget-wide v4, v1, v3

    .line 29
    .line 30
    const-wide/16 v6, 0xff

    .line 31
    .line 32
    shl-long/2addr v6, v2

    .line 33
    not-long v8, v6

    .line 34
    and-long/2addr v4, v8

    .line 35
    or-long/2addr v4, v6

    .line 36
    aput-wide v4, v1, v3

    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, Lo/c0;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    iget v2, p0, Lo/c0;->d:I

    .line 41
    .line 42
    invoke-static {v0, v2, v1}, Lvb/l;->p0(II[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lo/c0;->d:I

    .line 46
    .line 47
    invoke-static {v0}, Lo/s0;->a(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget v1, p0, Lo/c0;->e:I

    .line 52
    .line 53
    sub-int/2addr v0, v1

    .line 54
    iput v0, p0, Lo/c0;->f:I

    .line 55
    .line 56
    return-void
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
.end method

.method public final b(J)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    ushr-long v1, p1, v1

    .line 6
    .line 7
    xor-long v1, p1, v1

    .line 8
    .line 9
    long-to-int v2, v1

    .line 10
    const v1, -0x3361d2af    # -8.293031E7f

    .line 11
    .line 12
    .line 13
    mul-int v2, v2, v1

    .line 14
    .line 15
    shl-int/lit8 v1, v2, 0x10

    .line 16
    .line 17
    xor-int/2addr v1, v2

    .line 18
    and-int/lit8 v2, v1, 0x7f

    .line 19
    .line 20
    iget v3, v0, Lo/c0;->d:I

    .line 21
    .line 22
    ushr-int/lit8 v1, v1, 0x7

    .line 23
    .line 24
    and-int/2addr v1, v3

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    :goto_0
    iget-object v6, v0, Lo/c0;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v7, v1, 0x3

    .line 30
    .line 31
    and-int/lit8 v8, v1, 0x7

    .line 32
    .line 33
    shl-int/lit8 v8, v8, 0x3

    .line 34
    .line 35
    aget-wide v9, v6, v7

    .line 36
    .line 37
    ushr-long/2addr v9, v8

    .line 38
    const/4 v11, 0x1

    .line 39
    add-int/2addr v7, v11

    .line 40
    aget-wide v12, v6, v7

    .line 41
    .line 42
    rsub-int/lit8 v6, v8, 0x40

    .line 43
    .line 44
    shl-long v6, v12, v6

    .line 45
    .line 46
    int-to-long v12, v8

    .line 47
    neg-long v12, v12

    .line 48
    const/16 v8, 0x3f

    .line 49
    .line 50
    shr-long/2addr v12, v8

    .line 51
    and-long/2addr v6, v12

    .line 52
    or-long/2addr v6, v9

    .line 53
    int-to-long v8, v2

    .line 54
    const-wide v12, 0x101010101010101L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-long v8, v8, v12

    .line 60
    .line 61
    xor-long/2addr v8, v6

    .line 62
    sub-long v12, v8, v12

    .line 63
    .line 64
    not-long v8, v8

    .line 65
    and-long/2addr v8, v12

    .line 66
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v8, v12

    .line 72
    :goto_1
    const-wide/16 v14, 0x0

    .line 73
    .line 74
    cmp-long v10, v8, v14

    .line 75
    .line 76
    if-eqz v10, :cond_1

    .line 77
    .line 78
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    shr-int/lit8 v10, v10, 0x3

    .line 83
    .line 84
    add-int/2addr v10, v1

    .line 85
    and-int/2addr v10, v3

    .line 86
    iget-object v14, v0, Lo/c0;->b:[J

    .line 87
    .line 88
    aget-wide v15, v14, v10

    .line 89
    .line 90
    cmp-long v14, v15, p1

    .line 91
    .line 92
    if-nez v14, :cond_0

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_0
    const-wide/16 v14, 0x1

    .line 96
    .line 97
    sub-long v14, v8, v14

    .line 98
    .line 99
    and-long/2addr v8, v14

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    not-long v8, v6

    .line 102
    const/4 v10, 0x6

    .line 103
    shl-long/2addr v8, v10

    .line 104
    and-long/2addr v6, v8

    .line 105
    and-long/2addr v6, v12

    .line 106
    cmp-long v8, v6, v14

    .line 107
    .line 108
    if-eqz v8, :cond_3

    .line 109
    .line 110
    const/4 v10, -0x1

    .line 111
    :goto_2
    if-ltz v10, :cond_2

    .line 112
    .line 113
    return v11

    .line 114
    :cond_2
    return v4

    .line 115
    :cond_3
    add-int/lit8 v5, v5, 0x8

    .line 116
    .line 117
    add-int/2addr v1, v5

    .line 118
    and-int/2addr v1, v3

    .line 119
    goto :goto_0
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

.method public final c(J)I
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    ushr-long v2, p1, v1

    .line 6
    .line 7
    xor-long v2, p1, v2

    .line 8
    .line 9
    long-to-int v3, v2

    .line 10
    const v2, -0x3361d2af    # -8.293031E7f

    .line 11
    .line 12
    .line 13
    mul-int v3, v3, v2

    .line 14
    .line 15
    shl-int/lit8 v4, v3, 0x10

    .line 16
    .line 17
    xor-int/2addr v3, v4

    .line 18
    ushr-int/lit8 v4, v3, 0x7

    .line 19
    .line 20
    and-int/lit8 v3, v3, 0x7f

    .line 21
    .line 22
    iget v5, v0, Lo/c0;->d:I

    .line 23
    .line 24
    and-int v6, v4, v5

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    :goto_0
    iget-object v9, v0, Lo/c0;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v10, v6, 0x3

    .line 30
    .line 31
    and-int/lit8 v11, v6, 0x7

    .line 32
    .line 33
    shl-int/lit8 v11, v11, 0x3

    .line 34
    .line 35
    aget-wide v12, v9, v10

    .line 36
    .line 37
    ushr-long/2addr v12, v11

    .line 38
    const/4 v14, 0x1

    .line 39
    add-int/2addr v10, v14

    .line 40
    aget-wide v15, v9, v10

    .line 41
    .line 42
    rsub-int/lit8 v9, v11, 0x40

    .line 43
    .line 44
    shl-long v9, v15, v9

    .line 45
    .line 46
    const/16 v15, 0x20

    .line 47
    .line 48
    const v16, -0x3361d2af    # -8.293031E7f

    .line 49
    .line 50
    .line 51
    int-to-long v1, v11

    .line 52
    neg-long v1, v1

    .line 53
    const/16 v11, 0x3f

    .line 54
    .line 55
    shr-long/2addr v1, v11

    .line 56
    and-long/2addr v1, v9

    .line 57
    or-long/2addr v1, v12

    .line 58
    int-to-long v9, v3

    .line 59
    const-wide v11, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long v17, v9, v11

    .line 65
    .line 66
    move/from16 v19, v8

    .line 67
    .line 68
    const/4 v13, 0x0

    .line 69
    xor-long v7, v1, v17

    .line 70
    .line 71
    sub-long v11, v7, v11

    .line 72
    .line 73
    not-long v7, v7

    .line 74
    and-long/2addr v7, v11

    .line 75
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr v7, v11

    .line 81
    :goto_1
    const-wide/16 v17, 0x0

    .line 82
    .line 83
    cmp-long v20, v7, v17

    .line 84
    .line 85
    if-eqz v20, :cond_1

    .line 86
    .line 87
    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 88
    .line 89
    .line 90
    move-result v17

    .line 91
    shr-int/lit8 v17, v17, 0x3

    .line 92
    .line 93
    add-int v17, v6, v17

    .line 94
    .line 95
    and-int v17, v17, v5

    .line 96
    .line 97
    move-wide/from16 v20, v11

    .line 98
    .line 99
    iget-object v11, v0, Lo/c0;->b:[J

    .line 100
    .line 101
    aget-wide v22, v11, v17

    .line 102
    .line 103
    cmp-long v11, v22, p1

    .line 104
    .line 105
    if-nez v11, :cond_0

    .line 106
    .line 107
    return v17

    .line 108
    :cond_0
    const-wide/16 v11, 0x1

    .line 109
    .line 110
    sub-long v11, v7, v11

    .line 111
    .line 112
    and-long/2addr v7, v11

    .line 113
    move-wide/from16 v11, v20

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    move-wide/from16 v20, v11

    .line 117
    .line 118
    not-long v7, v1

    .line 119
    const/4 v11, 0x6

    .line 120
    shl-long/2addr v7, v11

    .line 121
    and-long/2addr v1, v7

    .line 122
    and-long v1, v1, v20

    .line 123
    .line 124
    const/16 v7, 0x8

    .line 125
    .line 126
    cmp-long v8, v1, v17

    .line 127
    .line 128
    if-eqz v8, :cond_f

    .line 129
    .line 130
    invoke-virtual {v0, v4}, Lo/c0;->d(I)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    iget v2, v0, Lo/c0;->f:I

    .line 135
    .line 136
    const-wide/16 v11, 0xff

    .line 137
    .line 138
    if-nez v2, :cond_2

    .line 139
    .line 140
    iget-object v2, v0, Lo/c0;->a:[J

    .line 141
    .line 142
    shr-int/lit8 v8, v1, 0x3

    .line 143
    .line 144
    aget-wide v22, v2, v8

    .line 145
    .line 146
    and-int/lit8 v2, v1, 0x7

    .line 147
    .line 148
    shl-int/lit8 v2, v2, 0x3

    .line 149
    .line 150
    shr-long v22, v22, v2

    .line 151
    .line 152
    and-long v22, v22, v11

    .line 153
    .line 154
    const-wide/16 v24, 0xfe

    .line 155
    .line 156
    cmp-long v2, v22, v24

    .line 157
    .line 158
    if-nez v2, :cond_3

    .line 159
    .line 160
    :cond_2
    move-wide/from16 v26, v11

    .line 161
    .line 162
    const-wide/16 p1, 0x80

    .line 163
    .line 164
    const/16 v19, 0x7

    .line 165
    .line 166
    const/16 v31, 0x0

    .line 167
    .line 168
    const/16 v33, 0x1

    .line 169
    .line 170
    goto/16 :goto_c

    .line 171
    .line 172
    :cond_3
    iget v1, v0, Lo/c0;->d:I

    .line 173
    .line 174
    if-le v1, v7, :cond_b

    .line 175
    .line 176
    iget v2, v0, Lo/c0;->e:I

    .line 177
    .line 178
    const-wide/16 p1, 0x80

    .line 179
    .line 180
    int-to-long v5, v2

    .line 181
    const-wide/16 v22, 0x20

    .line 182
    .line 183
    mul-long v5, v5, v22

    .line 184
    .line 185
    int-to-long v1, v1

    .line 186
    const-wide/16 v22, 0x19

    .line 187
    .line 188
    mul-long v1, v1, v22

    .line 189
    .line 190
    const-wide/high16 v22, -0x8000000000000000L

    .line 191
    .line 192
    xor-long v5, v5, v22

    .line 193
    .line 194
    xor-long v1, v1, v22

    .line 195
    .line 196
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-gtz v1, :cond_a

    .line 201
    .line 202
    iget-object v1, v0, Lo/c0;->a:[J

    .line 203
    .line 204
    iget v2, v0, Lo/c0;->d:I

    .line 205
    .line 206
    iget-object v5, v0, Lo/c0;->b:[J

    .line 207
    .line 208
    iget-object v6, v0, Lo/c0;->c:[Ljava/lang/Object;

    .line 209
    .line 210
    add-int/lit8 v8, v2, 0x7

    .line 211
    .line 212
    shr-int/lit8 v8, v8, 0x3

    .line 213
    .line 214
    const/4 v3, 0x0

    .line 215
    const/16 v19, 0x7

    .line 216
    .line 217
    :goto_2
    if-ge v3, v8, :cond_4

    .line 218
    .line 219
    aget-wide v26, v1, v3

    .line 220
    .line 221
    move/from16 v29, v8

    .line 222
    .line 223
    const/16 v28, 0x8

    .line 224
    .line 225
    and-long v7, v26, v20

    .line 226
    .line 227
    move-wide/from16 v26, v11

    .line 228
    .line 229
    not-long v11, v7

    .line 230
    ushr-long v7, v7, v19

    .line 231
    .line 232
    add-long/2addr v11, v7

    .line 233
    const-wide v7, -0x101010101010102L

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    and-long/2addr v7, v11

    .line 239
    aput-wide v7, v1, v3

    .line 240
    .line 241
    add-int/lit8 v3, v3, 0x1

    .line 242
    .line 243
    move-wide/from16 v11, v26

    .line 244
    .line 245
    move/from16 v8, v29

    .line 246
    .line 247
    const/16 v7, 0x8

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_4
    move-wide/from16 v26, v11

    .line 251
    .line 252
    const/16 v28, 0x8

    .line 253
    .line 254
    invoke-static {v1}, Lvb/l;->x0([J)I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    add-int/lit8 v7, v3, -0x1

    .line 259
    .line 260
    aget-wide v11, v1, v7

    .line 261
    .line 262
    const-wide v20, 0xffffffffffffffL

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    and-long v11, v11, v20

    .line 268
    .line 269
    const-wide/high16 v29, -0x100000000000000L

    .line 270
    .line 271
    or-long v11, v11, v29

    .line 272
    .line 273
    aput-wide v11, v1, v7

    .line 274
    .line 275
    aget-wide v7, v1, v13

    .line 276
    .line 277
    aput-wide v7, v1, v3

    .line 278
    .line 279
    const/4 v3, 0x0

    .line 280
    :goto_3
    if-eq v3, v2, :cond_9

    .line 281
    .line 282
    shr-int/lit8 v7, v3, 0x3

    .line 283
    .line 284
    aget-wide v11, v1, v7

    .line 285
    .line 286
    and-int/lit8 v8, v3, 0x7

    .line 287
    .line 288
    shl-int/lit8 v8, v8, 0x3

    .line 289
    .line 290
    shr-long/2addr v11, v8

    .line 291
    and-long v11, v11, v26

    .line 292
    .line 293
    cmp-long v29, v11, p1

    .line 294
    .line 295
    if-nez v29, :cond_5

    .line 296
    .line 297
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_5
    cmp-long v29, v11, v24

    .line 301
    .line 302
    if-eqz v29, :cond_6

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_6
    aget-wide v11, v5, v3

    .line 306
    .line 307
    ushr-long v29, v11, v15

    .line 308
    .line 309
    xor-long v11, v11, v29

    .line 310
    .line 311
    long-to-int v12, v11

    .line 312
    mul-int v12, v12, v16

    .line 313
    .line 314
    shl-int/lit8 v11, v12, 0x10

    .line 315
    .line 316
    xor-int/2addr v11, v12

    .line 317
    ushr-int/lit8 v12, v11, 0x7

    .line 318
    .line 319
    invoke-virtual {v0, v12}, Lo/c0;->d(I)I

    .line 320
    .line 321
    .line 322
    move-result v29

    .line 323
    and-int/2addr v12, v2

    .line 324
    sub-int v30, v29, v12

    .line 325
    .line 326
    and-int v30, v30, v2

    .line 327
    .line 328
    const/16 v31, 0x0

    .line 329
    .line 330
    div-int/lit8 v13, v30, 0x8

    .line 331
    .line 332
    sub-int v12, v3, v12

    .line 333
    .line 334
    and-int/2addr v12, v2

    .line 335
    div-int/lit8 v12, v12, 0x8

    .line 336
    .line 337
    if-ne v13, v12, :cond_7

    .line 338
    .line 339
    and-int/lit8 v11, v11, 0x7f

    .line 340
    .line 341
    int-to-long v11, v11

    .line 342
    aget-wide v29, v1, v7

    .line 343
    .line 344
    const/4 v13, 0x1

    .line 345
    const/16 v32, 0x20

    .line 346
    .line 347
    shl-long v14, v26, v8

    .line 348
    .line 349
    not-long v14, v14

    .line 350
    and-long v14, v29, v14

    .line 351
    .line 352
    shl-long/2addr v11, v8

    .line 353
    or-long/2addr v11, v14

    .line 354
    aput-wide v11, v1, v7

    .line 355
    .line 356
    array-length v7, v1

    .line 357
    sub-int/2addr v7, v13

    .line 358
    aget-wide v11, v1, v31

    .line 359
    .line 360
    and-long v11, v11, v20

    .line 361
    .line 362
    or-long v11, v11, v22

    .line 363
    .line 364
    aput-wide v11, v1, v7

    .line 365
    .line 366
    add-int/lit8 v3, v3, 0x1

    .line 367
    .line 368
    :goto_5
    const/4 v13, 0x0

    .line 369
    const/4 v14, 0x1

    .line 370
    const/16 v15, 0x20

    .line 371
    .line 372
    goto :goto_3

    .line 373
    :cond_7
    const/4 v13, 0x1

    .line 374
    const/16 v32, 0x20

    .line 375
    .line 376
    shr-int/lit8 v12, v29, 0x3

    .line 377
    .line 378
    aget-wide v14, v1, v12

    .line 379
    .line 380
    and-int/lit8 v30, v29, 0x7

    .line 381
    .line 382
    shl-int/lit8 v30, v30, 0x3

    .line 383
    .line 384
    shr-long v33, v14, v30

    .line 385
    .line 386
    and-long v33, v33, v26

    .line 387
    .line 388
    cmp-long v35, v33, p1

    .line 389
    .line 390
    if-nez v35, :cond_8

    .line 391
    .line 392
    and-int/lit8 v11, v11, 0x7f

    .line 393
    .line 394
    move-wide/from16 v34, v14

    .line 395
    .line 396
    const/16 v33, 0x1

    .line 397
    .line 398
    int-to-long v13, v11

    .line 399
    move v15, v2

    .line 400
    move/from16 v36, v3

    .line 401
    .line 402
    shl-long v2, v26, v30

    .line 403
    .line 404
    not-long v2, v2

    .line 405
    and-long v2, v34, v2

    .line 406
    .line 407
    shl-long v13, v13, v30

    .line 408
    .line 409
    or-long/2addr v2, v13

    .line 410
    aput-wide v2, v1, v12

    .line 411
    .line 412
    aget-wide v2, v1, v7

    .line 413
    .line 414
    shl-long v11, v26, v8

    .line 415
    .line 416
    not-long v11, v11

    .line 417
    and-long/2addr v2, v11

    .line 418
    shl-long v11, p1, v8

    .line 419
    .line 420
    or-long/2addr v2, v11

    .line 421
    aput-wide v2, v1, v7

    .line 422
    .line 423
    aget-wide v2, v5, v36

    .line 424
    .line 425
    aput-wide v2, v5, v29

    .line 426
    .line 427
    aput-wide v17, v5, v36

    .line 428
    .line 429
    aget-object v2, v6, v36

    .line 430
    .line 431
    aput-object v2, v6, v29

    .line 432
    .line 433
    const/4 v2, 0x0

    .line 434
    aput-object v2, v6, v36

    .line 435
    .line 436
    move/from16 v3, v36

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_8
    move/from16 v36, v3

    .line 440
    .line 441
    move-wide/from16 v34, v14

    .line 442
    .line 443
    const/16 v33, 0x1

    .line 444
    .line 445
    move v15, v2

    .line 446
    and-int/lit8 v2, v11, 0x7f

    .line 447
    .line 448
    int-to-long v2, v2

    .line 449
    shl-long v7, v26, v30

    .line 450
    .line 451
    not-long v7, v7

    .line 452
    and-long v7, v34, v7

    .line 453
    .line 454
    shl-long v2, v2, v30

    .line 455
    .line 456
    or-long/2addr v2, v7

    .line 457
    aput-wide v2, v1, v12

    .line 458
    .line 459
    aget-wide v2, v5, v29

    .line 460
    .line 461
    aget-wide v7, v5, v36

    .line 462
    .line 463
    aput-wide v7, v5, v29

    .line 464
    .line 465
    aput-wide v2, v5, v36

    .line 466
    .line 467
    aget-object v2, v6, v29

    .line 468
    .line 469
    aget-object v3, v6, v36

    .line 470
    .line 471
    aput-object v3, v6, v29

    .line 472
    .line 473
    aput-object v2, v6, v36

    .line 474
    .line 475
    add-int/lit8 v3, v36, -0x1

    .line 476
    .line 477
    :goto_6
    array-length v2, v1

    .line 478
    add-int/lit8 v2, v2, -0x1

    .line 479
    .line 480
    aget-wide v7, v1, v31

    .line 481
    .line 482
    and-long v7, v7, v20

    .line 483
    .line 484
    or-long v7, v7, v22

    .line 485
    .line 486
    aput-wide v7, v1, v2

    .line 487
    .line 488
    add-int/lit8 v3, v3, 0x1

    .line 489
    .line 490
    move v2, v15

    .line 491
    goto :goto_5

    .line 492
    :cond_9
    const/16 v31, 0x0

    .line 493
    .line 494
    const/16 v33, 0x1

    .line 495
    .line 496
    iget v1, v0, Lo/c0;->d:I

    .line 497
    .line 498
    invoke-static {v1}, Lo/s0;->a(I)I

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    iget v2, v0, Lo/c0;->e:I

    .line 503
    .line 504
    sub-int/2addr v1, v2

    .line 505
    iput v1, v0, Lo/c0;->f:I

    .line 506
    .line 507
    goto/16 :goto_b

    .line 508
    .line 509
    :cond_a
    :goto_7
    move-wide/from16 v26, v11

    .line 510
    .line 511
    const/16 v19, 0x7

    .line 512
    .line 513
    const/16 v31, 0x0

    .line 514
    .line 515
    const/16 v32, 0x20

    .line 516
    .line 517
    const/16 v33, 0x1

    .line 518
    .line 519
    goto :goto_8

    .line 520
    :cond_b
    const-wide/16 p1, 0x80

    .line 521
    .line 522
    goto :goto_7

    .line 523
    :goto_8
    iget v1, v0, Lo/c0;->d:I

    .line 524
    .line 525
    invoke-static {v1}, Lo/s0;->b(I)I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    iget-object v2, v0, Lo/c0;->a:[J

    .line 530
    .line 531
    iget-object v3, v0, Lo/c0;->b:[J

    .line 532
    .line 533
    iget-object v5, v0, Lo/c0;->c:[Ljava/lang/Object;

    .line 534
    .line 535
    iget v6, v0, Lo/c0;->d:I

    .line 536
    .line 537
    invoke-virtual {v0, v1}, Lo/c0;->f(I)V

    .line 538
    .line 539
    .line 540
    iget-object v1, v0, Lo/c0;->a:[J

    .line 541
    .line 542
    iget-object v7, v0, Lo/c0;->b:[J

    .line 543
    .line 544
    iget-object v8, v0, Lo/c0;->c:[Ljava/lang/Object;

    .line 545
    .line 546
    iget v11, v0, Lo/c0;->d:I

    .line 547
    .line 548
    const/4 v12, 0x0

    .line 549
    :goto_9
    if-ge v12, v6, :cond_d

    .line 550
    .line 551
    shr-int/lit8 v13, v12, 0x3

    .line 552
    .line 553
    aget-wide v13, v2, v13

    .line 554
    .line 555
    and-int/lit8 v15, v12, 0x7

    .line 556
    .line 557
    shl-int/lit8 v15, v15, 0x3

    .line 558
    .line 559
    shr-long/2addr v13, v15

    .line 560
    and-long v13, v13, v26

    .line 561
    .line 562
    cmp-long v15, v13, p1

    .line 563
    .line 564
    if-gez v15, :cond_c

    .line 565
    .line 566
    aget-wide v13, v3, v12

    .line 567
    .line 568
    ushr-long v17, v13, v32

    .line 569
    .line 570
    move-object/from16 v20, v1

    .line 571
    .line 572
    move-object v15, v2

    .line 573
    xor-long v1, v13, v17

    .line 574
    .line 575
    long-to-int v2, v1

    .line 576
    mul-int v2, v2, v16

    .line 577
    .line 578
    shl-int/lit8 v1, v2, 0x10

    .line 579
    .line 580
    xor-int/2addr v1, v2

    .line 581
    ushr-int/lit8 v2, v1, 0x7

    .line 582
    .line 583
    invoke-virtual {v0, v2}, Lo/c0;->d(I)I

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    and-int/lit8 v1, v1, 0x7f

    .line 588
    .line 589
    move/from16 v17, v2

    .line 590
    .line 591
    int-to-long v1, v1

    .line 592
    shr-int/lit8 v18, v17, 0x3

    .line 593
    .line 594
    and-int/lit8 v21, v17, 0x7

    .line 595
    .line 596
    shl-int/lit8 v21, v21, 0x3

    .line 597
    .line 598
    aget-wide v22, v20, v18

    .line 599
    .line 600
    move-wide/from16 v24, v1

    .line 601
    .line 602
    shl-long v1, v26, v21

    .line 603
    .line 604
    not-long v1, v1

    .line 605
    and-long v1, v22, v1

    .line 606
    .line 607
    shl-long v21, v24, v21

    .line 608
    .line 609
    or-long v1, v1, v21

    .line 610
    .line 611
    aput-wide v1, v20, v18

    .line 612
    .line 613
    add-int/lit8 v18, v17, -0x7

    .line 614
    .line 615
    and-int v18, v18, v11

    .line 616
    .line 617
    and-int/lit8 v21, v11, 0x7

    .line 618
    .line 619
    add-int v18, v18, v21

    .line 620
    .line 621
    shr-int/lit8 v18, v18, 0x3

    .line 622
    .line 623
    aput-wide v1, v20, v18

    .line 624
    .line 625
    aput-wide v13, v7, v17

    .line 626
    .line 627
    aget-object v1, v5, v12

    .line 628
    .line 629
    aput-object v1, v8, v17

    .line 630
    .line 631
    goto :goto_a

    .line 632
    :cond_c
    move-object/from16 v20, v1

    .line 633
    .line 634
    move-object v15, v2

    .line 635
    :goto_a
    add-int/lit8 v12, v12, 0x1

    .line 636
    .line 637
    move-object v2, v15

    .line 638
    move-object/from16 v1, v20

    .line 639
    .line 640
    goto :goto_9

    .line 641
    :cond_d
    :goto_b
    invoke-virtual {v0, v4}, Lo/c0;->d(I)I

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    :goto_c
    iget v2, v0, Lo/c0;->e:I

    .line 646
    .line 647
    add-int/lit8 v2, v2, 0x1

    .line 648
    .line 649
    iput v2, v0, Lo/c0;->e:I

    .line 650
    .line 651
    iget v2, v0, Lo/c0;->f:I

    .line 652
    .line 653
    iget-object v3, v0, Lo/c0;->a:[J

    .line 654
    .line 655
    shr-int/lit8 v4, v1, 0x3

    .line 656
    .line 657
    aget-wide v5, v3, v4

    .line 658
    .line 659
    and-int/lit8 v7, v1, 0x7

    .line 660
    .line 661
    shl-int/lit8 v7, v7, 0x3

    .line 662
    .line 663
    shr-long v11, v5, v7

    .line 664
    .line 665
    and-long v11, v11, v26

    .line 666
    .line 667
    cmp-long v8, v11, p1

    .line 668
    .line 669
    if-nez v8, :cond_e

    .line 670
    .line 671
    const/16 v31, 0x1

    .line 672
    .line 673
    :cond_e
    sub-int v2, v2, v31

    .line 674
    .line 675
    iput v2, v0, Lo/c0;->f:I

    .line 676
    .line 677
    iget v2, v0, Lo/c0;->d:I

    .line 678
    .line 679
    shl-long v11, v26, v7

    .line 680
    .line 681
    not-long v11, v11

    .line 682
    and-long/2addr v5, v11

    .line 683
    shl-long v7, v9, v7

    .line 684
    .line 685
    or-long/2addr v5, v7

    .line 686
    aput-wide v5, v3, v4

    .line 687
    .line 688
    add-int/lit8 v4, v1, -0x7

    .line 689
    .line 690
    and-int/2addr v4, v2

    .line 691
    and-int/lit8 v2, v2, 0x7

    .line 692
    .line 693
    add-int/2addr v4, v2

    .line 694
    shr-int/lit8 v2, v4, 0x3

    .line 695
    .line 696
    aput-wide v5, v3, v2

    .line 697
    .line 698
    return v1

    .line 699
    :cond_f
    const/16 v28, 0x8

    .line 700
    .line 701
    const/16 v31, 0x0

    .line 702
    .line 703
    const/16 v32, 0x20

    .line 704
    .line 705
    add-int/lit8 v8, v19, 0x8

    .line 706
    .line 707
    add-int/2addr v6, v8

    .line 708
    and-int/2addr v6, v5

    .line 709
    const/16 v1, 0x20

    .line 710
    .line 711
    const v2, -0x3361d2af    # -8.293031E7f

    .line 712
    .line 713
    .line 714
    goto/16 :goto_0
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

.method public final d(I)I
    .locals 9

    .line 1
    iget v0, p0, Lo/c0;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lo/c0;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v6, v2, v4

    .line 44
    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    shr-int/lit8 v1, v1, 0x3

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    and-int/2addr p1, v0

    .line 55
    return p1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    and-int/2addr p1, v0

    .line 60
    goto :goto_0
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

.method public final e(J)Ljava/lang/Object;
    .locals 14

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v0, p1, v0

    .line 4
    .line 5
    xor-long/2addr v0, p1

    .line 6
    long-to-int v1, v0

    .line 7
    const v0, -0x3361d2af    # -8.293031E7f

    .line 8
    .line 9
    .line 10
    mul-int v1, v1, v0

    .line 11
    .line 12
    shl-int/lit8 v0, v1, 0x10

    .line 13
    .line 14
    xor-int/2addr v0, v1

    .line 15
    and-int/lit8 v1, v0, 0x7f

    .line 16
    .line 17
    iget v2, p0, Lo/c0;->d:I

    .line 18
    .line 19
    ushr-int/lit8 v0, v0, 0x7

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    iget-object v4, p0, Lo/c0;->a:[J

    .line 24
    .line 25
    shr-int/lit8 v5, v0, 0x3

    .line 26
    .line 27
    and-int/lit8 v6, v0, 0x7

    .line 28
    .line 29
    shl-int/lit8 v6, v6, 0x3

    .line 30
    .line 31
    aget-wide v7, v4, v5

    .line 32
    .line 33
    ushr-long/2addr v7, v6

    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    aget-wide v9, v4, v5

    .line 37
    .line 38
    rsub-int/lit8 v4, v6, 0x40

    .line 39
    .line 40
    shl-long v4, v9, v4

    .line 41
    .line 42
    int-to-long v9, v6

    .line 43
    neg-long v9, v9

    .line 44
    const/16 v6, 0x3f

    .line 45
    .line 46
    shr-long/2addr v9, v6

    .line 47
    and-long/2addr v4, v9

    .line 48
    or-long/2addr v4, v7

    .line 49
    int-to-long v6, v1

    .line 50
    const-wide v8, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long v6, v6, v8

    .line 56
    .line 57
    xor-long/2addr v6, v4

    .line 58
    sub-long v8, v6, v8

    .line 59
    .line 60
    not-long v6, v6

    .line 61
    and-long/2addr v6, v8

    .line 62
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v6, v8

    .line 68
    :goto_1
    const-wide/16 v10, 0x0

    .line 69
    .line 70
    cmp-long v12, v6, v10

    .line 71
    .line 72
    if-eqz v12, :cond_1

    .line 73
    .line 74
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    shr-int/lit8 v10, v10, 0x3

    .line 79
    .line 80
    add-int/2addr v10, v0

    .line 81
    and-int/2addr v10, v2

    .line 82
    iget-object v11, p0, Lo/c0;->b:[J

    .line 83
    .line 84
    aget-wide v12, v11, v10

    .line 85
    .line 86
    cmp-long v11, v12, p1

    .line 87
    .line 88
    if-nez v11, :cond_0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_0
    const-wide/16 v10, 0x1

    .line 92
    .line 93
    sub-long v10, v6, v10

    .line 94
    .line 95
    and-long/2addr v6, v10

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    not-long v6, v4

    .line 98
    const/4 v12, 0x6

    .line 99
    shl-long/2addr v6, v12

    .line 100
    and-long/2addr v4, v6

    .line 101
    and-long/2addr v4, v8

    .line 102
    cmp-long v6, v4, v10

    .line 103
    .line 104
    if-eqz v6, :cond_3

    .line 105
    .line 106
    const/4 v10, -0x1

    .line 107
    :goto_2
    if-ltz v10, :cond_2

    .line 108
    .line 109
    iget-object v0, p0, Lo/c0;->c:[Ljava/lang/Object;

    .line 110
    .line 111
    aget-object v0, v0, v10

    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_2
    const/4 v0, 0x0

    .line 115
    return-object v0

    .line 116
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 117
    .line 118
    add-int/2addr v0, v3

    .line 119
    and-int/2addr v0, v2

    .line 120
    goto :goto_0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, Lo/c0;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    check-cast v1, Lo/c0;

    .line 16
    .line 17
    iget v3, v1, Lo/c0;->e:I

    .line 18
    .line 19
    iget v5, v0, Lo/c0;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, Lo/c0;->b:[J

    .line 25
    .line 26
    iget-object v5, v0, Lo/c0;->c:[Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v6, v0, Lo/c0;->a:[J

    .line 29
    .line 30
    array-length v7, v6

    .line 31
    add-int/lit8 v7, v7, -0x2

    .line 32
    .line 33
    if-ltz v7, :cond_9

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    :goto_0
    aget-wide v9, v6, v8

    .line 37
    .line 38
    not-long v11, v9

    .line 39
    const/4 v13, 0x7

    .line 40
    shl-long/2addr v11, v13

    .line 41
    and-long/2addr v11, v9

    .line 42
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v11, v13

    .line 48
    cmp-long v15, v11, v13

    .line 49
    .line 50
    if-eqz v15, :cond_8

    .line 51
    .line 52
    sub-int v11, v8, v7

    .line 53
    .line 54
    not-int v11, v11

    .line 55
    ushr-int/lit8 v11, v11, 0x1f

    .line 56
    .line 57
    const/16 v12, 0x8

    .line 58
    .line 59
    rsub-int/lit8 v11, v11, 0x8

    .line 60
    .line 61
    const/4 v13, 0x0

    .line 62
    :goto_1
    if-ge v13, v11, :cond_7

    .line 63
    .line 64
    const-wide/16 v14, 0xff

    .line 65
    .line 66
    and-long/2addr v14, v9

    .line 67
    const-wide/16 v16, 0x80

    .line 68
    .line 69
    cmp-long v18, v14, v16

    .line 70
    .line 71
    if-gez v18, :cond_5

    .line 72
    .line 73
    shl-int/lit8 v14, v8, 0x3

    .line 74
    .line 75
    add-int/2addr v14, v13

    .line 76
    move-object/from16 v16, v3

    .line 77
    .line 78
    const/4 v15, 0x1

    .line 79
    aget-wide v2, v16, v14

    .line 80
    .line 81
    aget-object v14, v5, v14

    .line 82
    .line 83
    if-nez v14, :cond_4

    .line 84
    .line 85
    invoke-virtual {v1, v2, v3}, Lo/c0;->e(J)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    if-nez v14, :cond_3

    .line 90
    .line 91
    invoke-virtual {v1, v2, v3}, Lo/c0;->b(J)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_6

    .line 96
    .line 97
    :cond_3
    return v4

    .line 98
    :cond_4
    invoke-virtual {v1, v2, v3}, Lo/c0;->e(J)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v14, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_6

    .line 107
    .line 108
    return v4

    .line 109
    :cond_5
    move-object/from16 v16, v3

    .line 110
    .line 111
    const/4 v15, 0x1

    .line 112
    :cond_6
    shr-long/2addr v9, v12

    .line 113
    add-int/lit8 v13, v13, 0x1

    .line 114
    .line 115
    move-object/from16 v3, v16

    .line 116
    .line 117
    const/4 v2, 0x1

    .line 118
    goto :goto_1

    .line 119
    :cond_7
    move-object/from16 v16, v3

    .line 120
    .line 121
    const/4 v15, 0x1

    .line 122
    if-ne v11, v12, :cond_a

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_8
    move-object/from16 v16, v3

    .line 126
    .line 127
    const/4 v15, 0x1

    .line 128
    :goto_2
    if-eq v8, v7, :cond_a

    .line 129
    .line 130
    add-int/lit8 v8, v8, 0x1

    .line 131
    .line 132
    move-object/from16 v3, v16

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    goto :goto_0

    .line 136
    :cond_9
    const/4 v15, 0x1

    .line 137
    :cond_a
    return v15
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

.method public final f(I)V
    .locals 9

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lo/s0;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x7

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Lo/c0;->d:I

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    sget-object v0, Lo/s0;->a:[J

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v0, p1, 0xf

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x8

    .line 24
    .line 25
    shr-int/lit8 v0, v0, 0x3

    .line 26
    .line 27
    new-array v0, v0, [J

    .line 28
    .line 29
    const-wide v1, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lvb/l;->r0([JJ)V

    .line 35
    .line 36
    .line 37
    :goto_1
    iput-object v0, p0, Lo/c0;->a:[J

    .line 38
    .line 39
    shr-int/lit8 v1, p1, 0x3

    .line 40
    .line 41
    and-int/lit8 v2, p1, 0x7

    .line 42
    .line 43
    shl-int/lit8 v2, v2, 0x3

    .line 44
    .line 45
    aget-wide v3, v0, v1

    .line 46
    .line 47
    const-wide/16 v5, 0xff

    .line 48
    .line 49
    shl-long/2addr v5, v2

    .line 50
    not-long v7, v5

    .line 51
    and-long/2addr v3, v7

    .line 52
    or-long/2addr v3, v5

    .line 53
    aput-wide v3, v0, v1

    .line 54
    .line 55
    iget v0, p0, Lo/c0;->d:I

    .line 56
    .line 57
    invoke-static {v0}, Lo/s0;->a(I)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v1, p0, Lo/c0;->e:I

    .line 62
    .line 63
    sub-int/2addr v0, v1

    .line 64
    iput v0, p0, Lo/c0;->f:I

    .line 65
    .line 66
    new-array v0, p1, [J

    .line 67
    .line 68
    iput-object v0, p0, Lo/c0;->b:[J

    .line 69
    .line 70
    new-array p1, p1, [Ljava/lang/Object;

    .line 71
    .line 72
    iput-object p1, p0, Lo/c0;->c:[Ljava/lang/Object;

    .line 73
    .line 74
    return-void
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

.method public final g(J)Ljava/lang/Object;
    .locals 14

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v0, p1, v0

    .line 4
    .line 5
    xor-long/2addr v0, p1

    .line 6
    long-to-int v1, v0

    .line 7
    const v0, -0x3361d2af    # -8.293031E7f

    .line 8
    .line 9
    .line 10
    mul-int v1, v1, v0

    .line 11
    .line 12
    shl-int/lit8 v0, v1, 0x10

    .line 13
    .line 14
    xor-int/2addr v0, v1

    .line 15
    and-int/lit8 v1, v0, 0x7f

    .line 16
    .line 17
    iget v2, p0, Lo/c0;->d:I

    .line 18
    .line 19
    ushr-int/lit8 v0, v0, 0x7

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    iget-object v4, p0, Lo/c0;->a:[J

    .line 24
    .line 25
    shr-int/lit8 v5, v0, 0x3

    .line 26
    .line 27
    and-int/lit8 v6, v0, 0x7

    .line 28
    .line 29
    shl-int/lit8 v6, v6, 0x3

    .line 30
    .line 31
    aget-wide v7, v4, v5

    .line 32
    .line 33
    ushr-long/2addr v7, v6

    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    aget-wide v9, v4, v5

    .line 37
    .line 38
    rsub-int/lit8 v4, v6, 0x40

    .line 39
    .line 40
    shl-long v4, v9, v4

    .line 41
    .line 42
    int-to-long v9, v6

    .line 43
    neg-long v9, v9

    .line 44
    const/16 v6, 0x3f

    .line 45
    .line 46
    shr-long/2addr v9, v6

    .line 47
    and-long/2addr v4, v9

    .line 48
    or-long/2addr v4, v7

    .line 49
    int-to-long v6, v1

    .line 50
    const-wide v8, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long v6, v6, v8

    .line 56
    .line 57
    xor-long/2addr v6, v4

    .line 58
    sub-long v8, v6, v8

    .line 59
    .line 60
    not-long v6, v6

    .line 61
    and-long/2addr v6, v8

    .line 62
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v6, v8

    .line 68
    :goto_1
    const-wide/16 v10, 0x0

    .line 69
    .line 70
    cmp-long v12, v6, v10

    .line 71
    .line 72
    if-eqz v12, :cond_1

    .line 73
    .line 74
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    shr-int/lit8 v10, v10, 0x3

    .line 79
    .line 80
    add-int/2addr v10, v0

    .line 81
    and-int/2addr v10, v2

    .line 82
    iget-object v11, p0, Lo/c0;->b:[J

    .line 83
    .line 84
    aget-wide v12, v11, v10

    .line 85
    .line 86
    cmp-long v11, v12, p1

    .line 87
    .line 88
    if-nez v11, :cond_0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_0
    const-wide/16 v10, 0x1

    .line 92
    .line 93
    sub-long v10, v6, v10

    .line 94
    .line 95
    and-long/2addr v6, v10

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    not-long v6, v4

    .line 98
    const/4 v12, 0x6

    .line 99
    shl-long/2addr v6, v12

    .line 100
    and-long/2addr v4, v6

    .line 101
    and-long/2addr v4, v8

    .line 102
    cmp-long v6, v4, v10

    .line 103
    .line 104
    if-eqz v6, :cond_3

    .line 105
    .line 106
    const/4 v10, -0x1

    .line 107
    :goto_2
    const/4 v0, 0x0

    .line 108
    if-ltz v10, :cond_2

    .line 109
    .line 110
    iget v1, p0, Lo/c0;->e:I

    .line 111
    .line 112
    add-int/lit8 v1, v1, -0x1

    .line 113
    .line 114
    iput v1, p0, Lo/c0;->e:I

    .line 115
    .line 116
    iget-object v1, p0, Lo/c0;->a:[J

    .line 117
    .line 118
    iget v2, p0, Lo/c0;->d:I

    .line 119
    .line 120
    shr-int/lit8 v3, v10, 0x3

    .line 121
    .line 122
    and-int/lit8 v4, v10, 0x7

    .line 123
    .line 124
    shl-int/lit8 v4, v4, 0x3

    .line 125
    .line 126
    aget-wide v5, v1, v3

    .line 127
    .line 128
    const-wide/16 v7, 0xff

    .line 129
    .line 130
    shl-long/2addr v7, v4

    .line 131
    not-long v7, v7

    .line 132
    and-long/2addr v5, v7

    .line 133
    const-wide/16 v7, 0xfe

    .line 134
    .line 135
    shl-long/2addr v7, v4

    .line 136
    or-long/2addr v5, v7

    .line 137
    aput-wide v5, v1, v3

    .line 138
    .line 139
    add-int/lit8 v3, v10, -0x7

    .line 140
    .line 141
    and-int/2addr v3, v2

    .line 142
    and-int/lit8 v2, v2, 0x7

    .line 143
    .line 144
    add-int/2addr v3, v2

    .line 145
    shr-int/lit8 v2, v3, 0x3

    .line 146
    .line 147
    aput-wide v5, v1, v2

    .line 148
    .line 149
    iget-object v1, p0, Lo/c0;->c:[Ljava/lang/Object;

    .line 150
    .line 151
    aget-object v2, v1, v10

    .line 152
    .line 153
    aput-object v0, v1, v10

    .line 154
    .line 155
    return-object v2

    .line 156
    :cond_2
    return-object v0

    .line 157
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 158
    .line 159
    add-int/2addr v0, v3

    .line 160
    and-int/2addr v0, v2

    .line 161
    goto/16 :goto_0
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

.method public final h(JLjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lo/c0;->c(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lo/c0;->b:[J

    .line 6
    .line 7
    aput-wide p1, v1, v0

    .line 8
    .line 9
    iget-object p1, p0, Lo/c0;->c:[Ljava/lang/Object;

    .line 10
    .line 11
    aput-object p3, p1, v0

    .line 12
    .line 13
    return-void
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

.method public final hashCode()I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lo/c0;->b:[J

    .line 4
    .line 5
    iget-object v2, v0, Lo/c0;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Lo/c0;->a:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-ltz v4, :cond_6

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    :goto_0
    aget-wide v8, v3, v6

    .line 18
    .line 19
    not-long v10, v8

    .line 20
    const/4 v12, 0x7

    .line 21
    shl-long/2addr v10, v12

    .line 22
    and-long/2addr v10, v8

    .line 23
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v10, v12

    .line 29
    cmp-long v14, v10, v12

    .line 30
    .line 31
    if-eqz v14, :cond_4

    .line 32
    .line 33
    sub-int v10, v6, v4

    .line 34
    .line 35
    not-int v10, v10

    .line 36
    ushr-int/lit8 v10, v10, 0x1f

    .line 37
    .line 38
    const/16 v11, 0x8

    .line 39
    .line 40
    rsub-int/lit8 v10, v10, 0x8

    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    :goto_1
    if-ge v12, v10, :cond_2

    .line 44
    .line 45
    const-wide/16 v13, 0xff

    .line 46
    .line 47
    and-long/2addr v13, v8

    .line 48
    const-wide/16 v15, 0x80

    .line 49
    .line 50
    cmp-long v17, v13, v15

    .line 51
    .line 52
    if-gez v17, :cond_1

    .line 53
    .line 54
    shl-int/lit8 v13, v6, 0x3

    .line 55
    .line 56
    add-int/2addr v13, v12

    .line 57
    aget-wide v14, v1, v13

    .line 58
    .line 59
    aget-object v13, v2, v13

    .line 60
    .line 61
    const/16 v16, 0x20

    .line 62
    .line 63
    ushr-long v16, v14, v16

    .line 64
    .line 65
    xor-long v14, v14, v16

    .line 66
    .line 67
    long-to-int v15, v14

    .line 68
    if-eqz v13, :cond_0

    .line 69
    .line 70
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    goto :goto_2

    .line 75
    :cond_0
    const/4 v13, 0x0

    .line 76
    :goto_2
    xor-int/2addr v13, v15

    .line 77
    add-int/2addr v7, v13

    .line 78
    :cond_1
    shr-long/2addr v8, v11

    .line 79
    add-int/lit8 v12, v12, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    if-ne v10, v11, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    return v7

    .line 86
    :cond_4
    :goto_3
    if-eq v6, v4, :cond_5

    .line 87
    .line 88
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    return v7

    .line 92
    :cond_6
    return v5
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public final toString()Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lo/c0;->e:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v1, "{}"

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "{"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lo/c0;->b:[J

    .line 18
    .line 19
    iget-object v3, v0, Lo/c0;->c:[Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v4, v0, Lo/c0;->a:[J

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    add-int/lit8 v5, v5, -0x2

    .line 25
    .line 26
    if-ltz v5, :cond_6

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    :goto_0
    aget-wide v9, v4, v7

    .line 31
    .line 32
    not-long v11, v9

    .line 33
    const/4 v13, 0x7

    .line 34
    shl-long/2addr v11, v13

    .line 35
    and-long/2addr v11, v9

    .line 36
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v11, v13

    .line 42
    cmp-long v15, v11, v13

    .line 43
    .line 44
    if-eqz v15, :cond_5

    .line 45
    .line 46
    sub-int v11, v7, v5

    .line 47
    .line 48
    not-int v11, v11

    .line 49
    ushr-int/lit8 v11, v11, 0x1f

    .line 50
    .line 51
    const/16 v12, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v11, v11, 0x8

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    :goto_1
    if-ge v13, v11, :cond_4

    .line 57
    .line 58
    const-wide/16 v14, 0xff

    .line 59
    .line 60
    and-long/2addr v14, v9

    .line 61
    const-wide/16 v16, 0x80

    .line 62
    .line 63
    cmp-long v18, v14, v16

    .line 64
    .line 65
    if-gez v18, :cond_2

    .line 66
    .line 67
    shl-int/lit8 v14, v7, 0x3

    .line 68
    .line 69
    add-int/2addr v14, v13

    .line 70
    move/from16 v16, v7

    .line 71
    .line 72
    aget-wide v6, v2, v14

    .line 73
    .line 74
    aget-object v14, v3, v14

    .line 75
    .line 76
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v6, "="

    .line 80
    .line 81
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    if-ne v14, v0, :cond_1

    .line 85
    .line 86
    const-string v14, "(this)"

    .line 87
    .line 88
    :cond_1
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    iget v6, v0, Lo/c0;->e:I

    .line 94
    .line 95
    if-ge v8, v6, :cond_3

    .line 96
    .line 97
    const-string v6, ", "

    .line 98
    .line 99
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    move/from16 v16, v7

    .line 104
    .line 105
    :cond_3
    :goto_2
    shr-long/2addr v9, v12

    .line 106
    add-int/lit8 v13, v13, 0x1

    .line 107
    .line 108
    move/from16 v7, v16

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    move/from16 v16, v7

    .line 112
    .line 113
    if-ne v11, v12, :cond_6

    .line 114
    .line 115
    move/from16 v6, v16

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move v6, v7

    .line 119
    :goto_3
    if-eq v6, v5, :cond_6

    .line 120
    .line 121
    add-int/lit8 v7, v6, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    const/16 v2, 0x7d

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v2, "toString(...)"

    .line 134
    .line 135
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v1
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
