.class public abstract Li2/n;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final o:I

.field public p:Lj1/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lj1/p;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Li2/h1;->e(Lj1/p;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Li2/n;->o:I

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final A0(Li2/g1;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lj1/p;->h:Li2/g1;

    .line 2
    .line 3
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 4
    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lj1/p;->A0(Li2/g1;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
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
.end method

.method public final B0(Li2/m;)Li2/m;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lj1/p;

    .line 3
    .line 4
    iget-object v0, v0, Lj1/p;->a:Lj1/p;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eq v0, p1, :cond_3

    .line 8
    .line 9
    instance-of v2, p1, Lj1/p;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    check-cast v2, Lj1/p;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    :goto_0
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v1, v2, Lj1/p;->e:Lj1/p;

    .line 21
    .line 22
    :cond_1
    iget-object v2, p0, Lj1/p;->a:Lj1/p;

    .line 23
    .line 24
    if-ne v0, v2, :cond_2

    .line 25
    .line 26
    invoke-static {v1, p0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "Cannot delegate to an already delegated node"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_3
    iget-boolean v2, v0, Lj1/p;->n:Z

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    const-string v2, "Cannot delegate to an already attached node"

    .line 47
    .line 48
    invoke-static {v2}, Lf2/a;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    iget-object v2, p0, Lj1/p;->a:Lj1/p;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lj1/p;->z0(Lj1/p;)V

    .line 54
    .line 55
    .line 56
    iget v2, p0, Lj1/p;->c:I

    .line 57
    .line 58
    invoke-static {v0}, Li2/h1;->f(Lj1/p;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, v0, Lj1/p;->c:I

    .line 63
    .line 64
    iget v4, p0, Lj1/p;->c:I

    .line 65
    .line 66
    and-int/lit8 v5, v3, 0x2

    .line 67
    .line 68
    if-eqz v5, :cond_5

    .line 69
    .line 70
    and-int/lit8 v4, v4, 0x2

    .line 71
    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    instance-of v4, p0, Li2/z;

    .line 75
    .line 76
    if-nez v4, :cond_5

    .line 77
    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v6, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "

    .line 81
    .line 82
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v6, "\nDelegate Node: "

    .line 89
    .line 90
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4}, Lf2/a;->b(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    iget-object v4, p0, Li2/n;->p:Lj1/p;

    .line 104
    .line 105
    iput-object v4, v0, Lj1/p;->f:Lj1/p;

    .line 106
    .line 107
    iput-object v0, p0, Li2/n;->p:Lj1/p;

    .line 108
    .line 109
    iput-object p0, v0, Lj1/p;->e:Lj1/p;

    .line 110
    .line 111
    iget v4, p0, Lj1/p;->c:I

    .line 112
    .line 113
    or-int/2addr v3, v4

    .line 114
    const/4 v4, 0x0

    .line 115
    invoke-virtual {p0, v3, v4}, Li2/n;->D0(IZ)V

    .line 116
    .line 117
    .line 118
    iget-boolean v3, p0, Lj1/p;->n:Z

    .line 119
    .line 120
    if-eqz v3, :cond_9

    .line 121
    .line 122
    if-eqz v5, :cond_7

    .line 123
    .line 124
    and-int/lit8 v2, v2, 0x2

    .line 125
    .line 126
    if-eqz v2, :cond_6

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iget-object v2, v2, Li2/j0;->F:Li2/d1;

    .line 134
    .line 135
    iget-object v3, p0, Lj1/p;->a:Lj1/p;

    .line 136
    .line 137
    invoke-virtual {v3, v1}, Lj1/p;->A0(Li2/g1;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Li2/d1;->g()V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    :goto_1
    iget-object v1, p0, Lj1/p;->h:Li2/g1;

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Li2/n;->A0(Li2/g1;)V

    .line 147
    .line 148
    .line 149
    :goto_2
    invoke-virtual {v0}, Lj1/p;->p0()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lj1/p;->x0()V

    .line 153
    .line 154
    .line 155
    iget-boolean v1, v0, Lj1/p;->n:Z

    .line 156
    .line 157
    if-nez v1, :cond_8

    .line 158
    .line 159
    const-string v1, "autoInvalidateInsertedNode called on unattached node"

    .line 160
    .line 161
    invoke-static {v1}, Lf2/a;->b(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    const/4 v1, -0x1

    .line 165
    const/4 v2, 0x1

    .line 166
    invoke-static {v0, v1, v2}, Li2/h1;->a(Lj1/p;II)V

    .line 167
    .line 168
    .line 169
    :cond_9
    :goto_3
    return-object p1
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

.method public final C0(Li2/m;)V
    .locals 6

    .line 1
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, v1

    .line 5
    :goto_0
    if-eqz v0, :cond_6

    .line 6
    .line 7
    if-ne v0, p1, :cond_5

    .line 8
    .line 9
    iget-boolean p1, v0, Lj1/p;->n:Z

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object v4, Li2/h1;->a:Lo/f0;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-string p1, "autoInvalidateRemovedNode called on unattached node"

    .line 19
    .line 20
    invoke-static {p1}, Lf2/a;->b(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 p1, -0x1

    .line 24
    invoke-static {v0, p1, v3}, Li2/h1;->a(Lj1/p;II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lj1/p;->y0()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lj1/p;->q0()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {v0, v0}, Lj1/p;->z0(Lj1/p;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput p1, v0, Lj1/p;->d:I

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    iget-object p1, v0, Lj1/p;->f:Lj1/p;

    .line 42
    .line 43
    iput-object p1, p0, Li2/n;->p:Lj1/p;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object p1, v0, Lj1/p;->f:Lj1/p;

    .line 47
    .line 48
    iput-object p1, v2, Lj1/p;->f:Lj1/p;

    .line 49
    .line 50
    :goto_1
    iput-object v1, v0, Lj1/p;->f:Lj1/p;

    .line 51
    .line 52
    iput-object v1, v0, Lj1/p;->e:Lj1/p;

    .line 53
    .line 54
    iget p1, p0, Lj1/p;->c:I

    .line 55
    .line 56
    invoke-static {p0}, Li2/h1;->f(Lj1/p;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-virtual {p0, v0, v2}, Li2/n;->D0(IZ)V

    .line 62
    .line 63
    .line 64
    iget-boolean v2, p0, Lj1/p;->n:Z

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    and-int/2addr p1, v3

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    and-int/lit8 p1, v0, 0x2

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {p0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object p1, p1, Li2/j0;->F:Li2/d1;

    .line 81
    .line 82
    iget-object v0, p0, Lj1/p;->a:Lj1/p;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lj1/p;->A0(Li2/g1;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Li2/d1;->g()V

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_2
    return-void

    .line 91
    :cond_5
    iget-object v2, v0, Lj1/p;->f:Lj1/p;

    .line 92
    .line 93
    move-object v5, v2

    .line 94
    move-object v2, v0

    .line 95
    move-object v0, v5

    .line 96
    goto :goto_0

    .line 97
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v2, "Could not find delegate: "

    .line 102
    .line 103
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v0
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

.method public final D0(IZ)V
    .locals 3

    .line 1
    iget v0, p0, Lj1/p;->c:I

    .line 2
    .line 3
    iput p1, p0, Lj1/p;->c:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lj1/p;->a:Lj1/p;

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    iput p1, p0, Lj1/p;->d:I

    .line 12
    .line 13
    :cond_0
    iget-boolean v1, p0, Lj1/p;->n:Z

    .line 14
    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    :goto_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget v2, v1, Lj1/p;->c:I

    .line 21
    .line 22
    or-int/2addr p1, v2

    .line 23
    iput p1, v1, Lj1/p;->c:I

    .line 24
    .line 25
    if-eq v1, v0, :cond_1

    .line 26
    .line 27
    iget-object v1, v1, Lj1/p;->e:Lj1/p;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-eqz p2, :cond_2

    .line 31
    .line 32
    if-ne v1, v0, :cond_2

    .line 33
    .line 34
    invoke-static {v0}, Li2/h1;->f(Lj1/p;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, v0, Lj1/p;->c:I

    .line 39
    .line 40
    :cond_2
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget-object p2, v1, Lj1/p;->f:Lj1/p;

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    iget p2, p2, Lj1/p;->d:I

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const/4 p2, 0x0

    .line 50
    :goto_1
    or-int/2addr p1, p2

    .line 51
    :goto_2
    if-eqz v1, :cond_4

    .line 52
    .line 53
    iget p2, v1, Lj1/p;->c:I

    .line 54
    .line 55
    or-int/2addr p1, p2

    .line 56
    iput p1, v1, Lj1/p;->d:I

    .line 57
    .line 58
    iget-object v1, v1, Lj1/p;->e:Lj1/p;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    return-void
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

.method public final p0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lj1/p;->p0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lj1/p;->h:Li2/g1;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lj1/p;->A0(Li2/g1;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v1, v0, Lj1/p;->n:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lj1/p;->p0()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final q0()V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lj1/p;->q0()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-super {p0}, Lj1/p;->q0()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public final w0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lj1/p;->w0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lj1/p;->w0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
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

.method public final x0()V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lj1/p;->x0()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-super {p0}, Lj1/p;->x0()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public final y0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lj1/p;->y0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 5
    .line 6
    :goto_0
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lj1/p;->y0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
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

.method public final z0(Lj1/p;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lj1/p;->a:Lj1/p;

    .line 2
    .line 3
    iget-object v0, p0, Li2/n;->p:Lj1/p;

    .line 4
    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lj1/p;->z0(Lj1/p;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
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
.end method
