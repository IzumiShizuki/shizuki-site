.class public final synthetic Lda/q0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/p;


# instance fields
.field public final synthetic a:Lhf/y;

.field public final synthetic b:J

.field public final synthetic c:Lda/b1;


# direct methods
.method public synthetic constructor <init>(Lhf/y;JLda/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lda/q0;->a:Lhf/y;

    .line 5
    .line 6
    iput-wide p2, p0, Lda/q0;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lda/q0;->c:Lda/b1;

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


# virtual methods
.method public final l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La0/d;

    .line 6
    .line 7
    move-object/from16 v6, p2

    .line 8
    .line 9
    check-cast v6, Lbg/p;

    .line 10
    .line 11
    move-object/from16 v14, p3

    .line 12
    .line 13
    check-cast v14, Lx0/o;

    .line 14
    .line 15
    move-object/from16 v2, p4

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const-string v3, "$this$items"

    .line 24
    .line 25
    invoke-static {v1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v14}, Lx0/o;->K()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v9, Lx0/k;->a:Lx0/r0;

    .line 37
    .line 38
    if-ne v1, v9, :cond_1

    .line 39
    .line 40
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v14, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    check-cast v1, Lx0/w0;

    .line 50
    .line 51
    and-int/lit8 v2, v2, 0x70

    .line 52
    .line 53
    or-int/lit8 v2, v2, 0x6

    .line 54
    .line 55
    invoke-static {v1, v6, v14, v2}, Lq9/a;->f(Lx0/w0;Lbg/p;Lx0/o;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Lbg/p;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-static {}, Lnh/b;->w()Lw1/f;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_0
    move-object v10, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {}, Lnh/a;->p()Lw1/f;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    goto :goto_0

    .line 75
    :goto_1
    invoke-static {v6}, Lna/o;->a(Lbg/p;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    move-object v12, v11

    .line 80
    iget v11, v6, Lbg/p;->j:I

    .line 81
    .line 82
    iget-object v2, v6, Lbg/p;->g:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    :cond_3
    move-object v13, v2

    .line 92
    move-object v15, v10

    .line 93
    iget-boolean v10, v6, Lbg/p;->k:Z

    .line 94
    .line 95
    iget-object v3, v0, Lda/q0;->a:Lhf/y;

    .line 96
    .line 97
    invoke-virtual {v14, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iget-wide v4, v0, Lda/q0;->b:J

    .line 102
    .line 103
    invoke-virtual {v14, v4, v5}, Lx0/o;->e(J)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    or-int/2addr v2, v7

    .line 108
    invoke-virtual {v14, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    or-int/2addr v2, v7

    .line 113
    iget-object v7, v0, Lda/q0;->c:Lda/b1;

    .line 114
    .line 115
    invoke-virtual {v14, v7}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    or-int/2addr v2, v8

    .line 120
    invoke-virtual {v14}, Lx0/o;->K()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    if-nez v2, :cond_4

    .line 125
    .line 126
    if-ne v8, v9, :cond_5

    .line 127
    .line 128
    :cond_4
    new-instance v2, Lda/s;

    .line 129
    .line 130
    const/4 v8, 0x1

    .line 131
    invoke-direct/range {v2 .. v8}, Lda/s;-><init>(Lhf/y;JLjava/lang/Object;Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v14, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v8, v2

    .line 138
    :cond_5
    check-cast v8, Lic/a;

    .line 139
    .line 140
    invoke-virtual {v14}, Lx0/o;->K()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-ne v2, v9, :cond_6

    .line 145
    .line 146
    new-instance v2, Laa/f;

    .line 147
    .line 148
    const/4 v3, 0x7

    .line 149
    invoke-direct {v2, v1, v3}, Laa/f;-><init>(Lx0/w0;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v14, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    check-cast v2, Lic/a;

    .line 156
    .line 157
    move-object v7, v15

    .line 158
    const/high16 v15, 0x180000

    .line 159
    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    move-object v9, v12

    .line 163
    move-object v12, v8

    .line 164
    move-object v8, v9

    .line 165
    move-object v9, v13

    .line 166
    move-object v13, v2

    .line 167
    invoke-static/range {v7 .. v16}, Lda/a;->e(Lw1/f;Ljava/lang/String;Ljava/lang/String;ZILic/a;Lic/a;Lx0/o;II)V

    .line 168
    .line 169
    .line 170
    :goto_2
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 171
    .line 172
    return-object v1
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
.end method
