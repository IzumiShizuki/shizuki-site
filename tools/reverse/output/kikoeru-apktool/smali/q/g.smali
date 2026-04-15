.class public final Lq/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lg2/v0;


# instance fields
.field public final a:Lq/m;


# direct methods
.method public constructor <init>(Lq/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/g;->a:Lq/m;

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
.method public final c(Lg2/y;Ljava/util/List;I)I
    .locals 5

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lg2/u0;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Lg2/u0;->t(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lud/b;->r(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lg2/u0;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Lg2/u0;->t(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
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

.method public final f(Lg2/y;Ljava/util/List;I)I
    .locals 5

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lg2/u0;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Lg2/u0;->m(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lud/b;->r(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lg2/u0;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Lg2/u0;->m(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
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

.method public final g(Lg2/y;Ljava/util/List;I)I
    .locals 5

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lg2/u0;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Lg2/u0;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lud/b;->r(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lg2/u0;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Lg2/u0;->L(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
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

.method public final h(Lg2/x0;Ljava/util/List;J)Lg2/w0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    new-array v5, v4, [Lg2/g1;

    .line 12
    .line 13
    move-object v6, v1

    .line 14
    check-cast v6, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const-wide/16 v8, 0x0

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    :goto_0
    const/4 v15, 0x0

    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    const/4 v10, 0x1

    .line 27
    if-ge v11, v7, :cond_2

    .line 28
    .line 29
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v17

    .line 33
    const-wide v18, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    move-object/from16 v12, v17

    .line 39
    .line 40
    check-cast v12, Lg2/u0;

    .line 41
    .line 42
    invoke-interface {v12}, Lg2/u0;->A()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v13

    .line 46
    const/16 v17, 0x20

    .line 47
    .line 48
    instance-of v14, v13, Lq/i;

    .line 49
    .line 50
    if-eqz v14, :cond_0

    .line 51
    .line 52
    move-object v15, v13

    .line 53
    check-cast v15, Lq/i;

    .line 54
    .line 55
    :cond_0
    if-eqz v15, :cond_1

    .line 56
    .line 57
    iget-object v13, v15, Lq/i;->a:Lx0/e1;

    .line 58
    .line 59
    invoke-virtual {v13}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    check-cast v13, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    if-ne v13, v10, :cond_1

    .line 70
    .line 71
    invoke-interface {v12, v2, v3}, Lg2/u0;->v(J)Lg2/g1;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    iget v9, v8, Lg2/g1;->a:I

    .line 76
    .line 77
    iget v10, v8, Lg2/g1;->b:I

    .line 78
    .line 79
    int-to-long v12, v9

    .line 80
    shl-long v12, v12, v17

    .line 81
    .line 82
    int-to-long v9, v10

    .line 83
    and-long v9, v9, v18

    .line 84
    .line 85
    or-long/2addr v9, v12

    .line 86
    aput-object v8, v5, v11

    .line 87
    .line 88
    move-wide v8, v9

    .line 89
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const/16 v17, 0x20

    .line 93
    .line 94
    const-wide v18, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    const/4 v7, 0x0

    .line 104
    :goto_1
    if-ge v7, v6, :cond_4

    .line 105
    .line 106
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    check-cast v11, Lg2/u0;

    .line 111
    .line 112
    aget-object v12, v5, v7

    .line 113
    .line 114
    if-nez v12, :cond_3

    .line 115
    .line 116
    invoke-interface {v11, v2, v3}, Lg2/u0;->v(J)Lg2/g1;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    aput-object v11, v5, v7

    .line 121
    .line 122
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-interface/range {p1 .. p1}, Lg2/y;->O()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    shr-long v1, v8, v17

    .line 132
    .line 133
    long-to-int v2, v1

    .line 134
    goto :goto_6

    .line 135
    :cond_5
    if-nez v4, :cond_6

    .line 136
    .line 137
    move-object v1, v15

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    aget-object v1, v5, v16

    .line 140
    .line 141
    add-int/lit8 v2, v4, -0x1

    .line 142
    .line 143
    if-nez v2, :cond_7

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    if-eqz v1, :cond_8

    .line 147
    .line 148
    iget v3, v1, Lg2/g1;->a:I

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_8
    const/4 v3, 0x0

    .line 152
    :goto_2
    new-instance v6, Loc/d;

    .line 153
    .line 154
    invoke-direct {v6, v10, v2, v10}, Loc/b;-><init>(III)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Loc/b;->a()Loc/c;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    :cond_9
    :goto_3
    iget-boolean v6, v2, Loc/c;->c:Z

    .line 162
    .line 163
    if-eqz v6, :cond_b

    .line 164
    .line 165
    invoke-virtual {v2}, Loc/c;->nextInt()I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    aget-object v6, v5, v6

    .line 170
    .line 171
    if-eqz v6, :cond_a

    .line 172
    .line 173
    iget v7, v6, Lg2/g1;->a:I

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_a
    const/4 v7, 0x0

    .line 177
    :goto_4
    if-ge v3, v7, :cond_9

    .line 178
    .line 179
    move-object v1, v6

    .line 180
    move v3, v7

    .line 181
    goto :goto_3

    .line 182
    :cond_b
    :goto_5
    if-eqz v1, :cond_c

    .line 183
    .line 184
    iget v2, v1, Lg2/g1;->a:I

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_c
    const/4 v2, 0x0

    .line 188
    :goto_6
    invoke-interface/range {p1 .. p1}, Lg2/y;->O()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_d

    .line 193
    .line 194
    and-long v3, v8, v18

    .line 195
    .line 196
    long-to-int v10, v3

    .line 197
    goto :goto_b

    .line 198
    :cond_d
    if-nez v4, :cond_e

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_e
    aget-object v15, v5, v16

    .line 202
    .line 203
    sub-int/2addr v4, v10

    .line 204
    if-nez v4, :cond_f

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_f
    if-eqz v15, :cond_10

    .line 208
    .line 209
    iget v1, v15, Lg2/g1;->b:I

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_10
    const/4 v1, 0x0

    .line 213
    :goto_7
    new-instance v3, Loc/d;

    .line 214
    .line 215
    invoke-direct {v3, v10, v4, v10}, Loc/b;-><init>(III)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Loc/b;->a()Loc/c;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    :cond_11
    :goto_8
    iget-boolean v4, v3, Loc/c;->c:Z

    .line 223
    .line 224
    if-eqz v4, :cond_13

    .line 225
    .line 226
    invoke-virtual {v3}, Loc/c;->nextInt()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    aget-object v4, v5, v4

    .line 231
    .line 232
    if-eqz v4, :cond_12

    .line 233
    .line 234
    iget v6, v4, Lg2/g1;->b:I

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_12
    const/4 v6, 0x0

    .line 238
    :goto_9
    if-ge v1, v6, :cond_11

    .line 239
    .line 240
    move-object v15, v4

    .line 241
    move v1, v6

    .line 242
    goto :goto_8

    .line 243
    :cond_13
    :goto_a
    if-eqz v15, :cond_14

    .line 244
    .line 245
    iget v10, v15, Lg2/g1;->b:I

    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_14
    const/4 v10, 0x0

    .line 249
    :goto_b
    invoke-interface/range {p1 .. p1}, Lg2/y;->O()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-nez v1, :cond_15

    .line 254
    .line 255
    int-to-long v3, v2

    .line 256
    shl-long v3, v3, v17

    .line 257
    .line 258
    int-to-long v6, v10

    .line 259
    and-long v6, v6, v18

    .line 260
    .line 261
    or-long/2addr v3, v6

    .line 262
    iget-object v1, v0, Lq/g;->a:Lq/m;

    .line 263
    .line 264
    iget-object v1, v1, Lq/m;->c:Lx0/e1;

    .line 265
    .line 266
    new-instance v6, Lf3/l;

    .line 267
    .line 268
    invoke-direct {v6, v3, v4}, Lf3/l;-><init>(J)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v6}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_15
    new-instance v1, Lq/f;

    .line 275
    .line 276
    invoke-direct {v1, v5, v0, v2, v10}, Lq/f;-><init>([Lg2/g1;Lq/g;II)V

    .line 277
    .line 278
    .line 279
    sget-object v3, Lvb/s;->a:Lvb/s;

    .line 280
    .line 281
    move-object/from16 v4, p1

    .line 282
    .line 283
    invoke-interface {v4, v2, v10, v3, v1}, Lg2/x0;->b0(IILjava/util/Map;Lic/k;)Lg2/w0;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    return-object v1
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
.end method

.method public final i(Lg2/y;Ljava/util/List;I)I
    .locals 5

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lg2/u0;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Lg2/u0;->b(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lud/b;->r(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lg2/u0;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Lg2/u0;->b(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
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
