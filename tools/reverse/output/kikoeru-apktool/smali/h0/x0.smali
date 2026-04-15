.class public final Lh0/x0;
.super Lac/h;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic c:I

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Lyb/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lh0/x0;->c:I

    iput-object p2, p0, Lh0/x0;->g:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/h;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Lyb/c;I)V
    .locals 0

    .line 2
    iput p4, p0, Lh0/x0;->c:I

    iput-object p1, p0, Lh0/x0;->f:Ljava/lang/Object;

    iput-object p2, p0, Lh0/x0;->g:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/h;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lyb/h;Lic/n;Lyb/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh0/x0;->c:I

    .line 3
    iput-object p1, p0, Lh0/x0;->f:Ljava/lang/Object;

    check-cast p2, Lac/h;

    iput-object p2, p0, Lh0/x0;->g:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/h;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 4

    .line 1
    iget v0, p0, Lh0/x0;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh0/x0;

    .line 7
    .line 8
    iget-object v1, p0, Lh0/x0;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lc2/m;

    .line 11
    .line 12
    iget-object v2, p0, Lh0/x0;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljc/y;

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    invoke-direct {v0, v1, v2, p2, v3}, Lh0/x0;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Lyb/c;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, Lh0/x0;->e:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, Lh0/x0;

    .line 24
    .line 25
    iget-object v1, p0, Lh0/x0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lr2/a;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-direct {v0, v2, v1, p2}, Lh0/x0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, v0, Lh0/x0;->f:Ljava/lang/Object;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, Lh0/x0;

    .line 37
    .line 38
    iget-object v1, p0, Lh0/x0;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lyb/h;

    .line 41
    .line 42
    iget-object v2, p0, Lh0/x0;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Lac/h;

    .line 45
    .line 46
    invoke-direct {v0, v1, v2, p2}, Lh0/x0;-><init>(Lyb/h;Lic/n;Lyb/c;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, v0, Lh0/x0;->e:Ljava/lang/Object;

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_2
    new-instance v0, Lh0/x0;

    .line 53
    .line 54
    iget-object v1, p0, Lh0/x0;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ll0/s0;

    .line 57
    .line 58
    iget-object v2, p0, Lh0/x0;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ll0/x;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-direct {v0, v1, v2, p2, v3}, Lh0/x0;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Lyb/c;I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v0, Lh0/x0;->e:Ljava/lang/Object;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_3
    new-instance v0, Lh0/x0;

    .line 70
    .line 71
    iget-object v1, p0, Lh0/x0;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lh0/c1;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-direct {v0, v2, v1, p2}, Lh0/x0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, v0, Lh0/x0;->e:Ljava/lang/Object;

    .line 80
    .line 81
    return-object v0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh0/x0;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc2/i0;

    .line 7
    .line 8
    check-cast p2, Lyb/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lh0/x0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh0/x0;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh0/x0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ldf/l;

    .line 24
    .line 25
    check-cast p2, Lyb/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lh0/x0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lh0/x0;

    .line 32
    .line 33
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lh0/x0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lc2/i0;

    .line 41
    .line 42
    check-cast p2, Lyb/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lh0/x0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lh0/x0;

    .line 49
    .line 50
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lh0/x0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Lc2/i0;

    .line 58
    .line 59
    check-cast p2, Lyb/c;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lh0/x0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lh0/x0;

    .line 66
    .line 67
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lh0/x0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_3
    check-cast p1, Lc2/i0;

    .line 75
    .line 76
    check-cast p2, Lyb/c;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Lh0/x0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lh0/x0;

    .line 83
    .line 84
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lh0/x0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lh0/x0;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lc2/m;->c:Lc2/m;

    .line 7
    .line 8
    const/4 v5, 0x2

    .line 9
    sget-object v6, Lub/a0;->a:Lub/a0;

    .line 10
    .line 11
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    sget-object v8, Lzb/a;->a:Lzb/a;

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    iget-object v10, v1, Lh0/x0;->g:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v10, Ljc/y;

    .line 22
    .line 23
    iget v0, v1, Lh0/x0;->d:I

    .line 24
    .line 25
    sget-object v2, Lu/u0;->a:Lu/u0;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    if-eq v0, v9, :cond_1

    .line 30
    .line 31
    if-ne v0, v5, :cond_0

    .line 32
    .line 33
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lc2/i0;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v4, p1

    .line 41
    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lc2/i0;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v7, p1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lc2/i0;

    .line 66
    .line 67
    :goto_0
    iget-object v7, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Lc2/m;

    .line 70
    .line 71
    iput-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 72
    .line 73
    iput v9, v1, Lh0/x0;->d:I

    .line 74
    .line 75
    invoke-virtual {v0, v7, v1}, Lc2/i0;->b(Lc2/m;Lac/a;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    if-ne v7, v8, :cond_3

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_3
    :goto_1
    check-cast v7, Lc2/l;

    .line 83
    .line 84
    iget-object v11, v7, Lc2/l;->a:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v12, v11

    .line 87
    check-cast v12, Ljava/util/Collection;

    .line 88
    .line 89
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    const/4 v13, 0x0

    .line 94
    :goto_2
    if-ge v13, v12, :cond_c

    .line 95
    .line 96
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    check-cast v14, Lc2/t;

    .line 101
    .line 102
    invoke-static {v14}, Lc2/s;->b(Lc2/t;)Z

    .line 103
    .line 104
    .line 105
    move-result v14

    .line 106
    if-nez v14, :cond_b

    .line 107
    .line 108
    iget v7, v7, Lc2/l;->c:I

    .line 109
    .line 110
    if-ne v7, v5, :cond_4

    .line 111
    .line 112
    sget-object v0, Lu/w0;->a:Lu/w0;

    .line 113
    .line 114
    iput-object v0, v10, Ljc/y;->a:Ljava/lang/Object;

    .line 115
    .line 116
    goto/16 :goto_8

    .line 117
    .line 118
    :cond_4
    move-object v7, v11

    .line 119
    check-cast v7, Ljava/util/Collection;

    .line 120
    .line 121
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    const/4 v12, 0x0

    .line 126
    :goto_3
    if-ge v12, v7, :cond_7

    .line 127
    .line 128
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    check-cast v13, Lc2/t;

    .line 133
    .line 134
    invoke-virtual {v13}, Lc2/t;->b()Z

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    if-nez v14, :cond_6

    .line 139
    .line 140
    iget-object v14, v0, Lc2/i0;->f:Lc2/j0;

    .line 141
    .line 142
    iget-wide v14, v14, Lc2/j0;->y:J

    .line 143
    .line 144
    invoke-virtual {v0}, Lc2/i0;->c()J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    invoke-static {v13, v14, v15, v4, v5}, Lc2/s;->e(Lc2/t;JJ)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_5

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 156
    .line 157
    const/4 v5, 0x2

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    :goto_4
    iput-object v2, v10, Ljc/y;->a:Ljava/lang/Object;

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_7
    iput-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 163
    .line 164
    const/4 v4, 0x2

    .line 165
    iput v4, v1, Lh0/x0;->d:I

    .line 166
    .line 167
    invoke-virtual {v0, v3, v1}, Lc2/i0;->b(Lc2/m;Lac/a;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-ne v4, v8, :cond_8

    .line 172
    .line 173
    :goto_5
    move-object v6, v8

    .line 174
    goto :goto_8

    .line 175
    :cond_8
    :goto_6
    check-cast v4, Lc2/l;

    .line 176
    .line 177
    iget-object v4, v4, Lc2/l;->a:Ljava/lang/Object;

    .line 178
    .line 179
    move-object v5, v4

    .line 180
    check-cast v5, Ljava/util/Collection;

    .line 181
    .line 182
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    const/4 v7, 0x0

    .line 187
    :goto_7
    if-ge v7, v5, :cond_a

    .line 188
    .line 189
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    check-cast v11, Lc2/t;

    .line 194
    .line 195
    invoke-virtual {v11}, Lc2/t;->b()Z

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    if-eqz v11, :cond_9

    .line 200
    .line 201
    iput-object v2, v10, Ljc/y;->a:Ljava/lang/Object;

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_a
    const/4 v5, 0x2

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_b
    add-int/lit8 v13, v13, 0x1

    .line 211
    .line 212
    const/4 v5, 0x2

    .line 213
    goto :goto_2

    .line 214
    :cond_c
    new-instance v0, Lu/v0;

    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Lc2/t;

    .line 222
    .line 223
    invoke-direct {v0, v2}, Lu/v0;-><init>(Lc2/t;)V

    .line 224
    .line 225
    .line 226
    iput-object v0, v10, Ljc/y;->a:Ljava/lang/Object;

    .line 227
    .line 228
    :goto_8
    return-object v6

    .line 229
    :pswitch_0
    iget v0, v1, Lh0/x0;->d:I

    .line 230
    .line 231
    if-eqz v0, :cond_e

    .line 232
    .line 233
    if-ne v0, v9, :cond_d

    .line 234
    .line 235
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 236
    .line 237
    iget-object v3, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v3, Ldf/l;

    .line 240
    .line 241
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :cond_e
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    iget-object v0, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Ldf/l;

    .line 257
    .line 258
    move-object v3, v0

    .line 259
    :cond_f
    move-object v0, v10

    .line 260
    check-cast v0, Lr2/a;

    .line 261
    .line 262
    invoke-virtual {v0}, Lr2/a;->b()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-eqz v0, :cond_10

    .line 267
    .line 268
    iput-object v3, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 271
    .line 272
    iput v9, v1, Lh0/x0;->d:I

    .line 273
    .line 274
    invoke-virtual {v3, v0, v1}, Ldf/l;->b(Ljava/lang/Object;Lyb/c;)V

    .line 275
    .line 276
    .line 277
    move-object v6, v8

    .line 278
    goto :goto_a

    .line 279
    :cond_10
    move-object v0, v2

    .line 280
    :goto_9
    if-nez v0, :cond_f

    .line 281
    .line 282
    :goto_a
    return-object v6

    .line 283
    :pswitch_1
    iget-object v0, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 284
    .line 285
    move-object v2, v0

    .line 286
    check-cast v2, Lyb/h;

    .line 287
    .line 288
    iget v0, v1, Lh0/x0;->d:I

    .line 289
    .line 290
    const/4 v4, 0x3

    .line 291
    if-eqz v0, :cond_14

    .line 292
    .line 293
    if-eq v0, v9, :cond_13

    .line 294
    .line 295
    const/4 v5, 0x2

    .line 296
    if-eq v0, v5, :cond_12

    .line 297
    .line 298
    if-ne v0, v4, :cond_11

    .line 299
    .line 300
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, Lc2/i0;

    .line 303
    .line 304
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    goto :goto_b

    .line 308
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v0

    .line 314
    :cond_12
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 315
    .line 316
    move-object v5, v0

    .line 317
    check-cast v5, Lc2/i0;

    .line 318
    .line 319
    :try_start_0
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 320
    .line 321
    .line 322
    goto :goto_c

    .line 323
    :catch_0
    move-exception v0

    .line 324
    goto :goto_e

    .line 325
    :cond_13
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 326
    .line 327
    move-object v5, v0

    .line 328
    check-cast v5, Lc2/i0;

    .line 329
    .line 330
    :try_start_1
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 331
    .line 332
    .line 333
    goto :goto_d

    .line 334
    :cond_14
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Lc2/i0;

    .line 340
    .line 341
    :goto_b
    move-object v5, v0

    .line 342
    :cond_15
    :goto_c
    invoke-static {v2}, Lhf/a0;->w(Lyb/h;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_18

    .line 347
    .line 348
    :try_start_2
    move-object v0, v10

    .line 349
    check-cast v0, Lac/h;

    .line 350
    .line 351
    iput-object v5, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 352
    .line 353
    iput v9, v1, Lh0/x0;->d:I

    .line 354
    .line 355
    invoke-interface {v0, v5, v1}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    if-ne v0, v8, :cond_16

    .line 360
    .line 361
    goto :goto_f

    .line 362
    :cond_16
    :goto_d
    iput-object v5, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 363
    .line 364
    const/4 v7, 0x2

    .line 365
    iput v7, v1, Lh0/x0;->d:I

    .line 366
    .line 367
    invoke-static {v5, v3, v1}, Lu/w1;->d(Lc2/i0;Lc2/m;Lac/a;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 371
    if-ne v0, v8, :cond_15

    .line 372
    .line 373
    goto :goto_f

    .line 374
    :goto_e
    invoke-static {v2}, Lhf/a0;->w(Lyb/h;)Z

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    if-eqz v7, :cond_17

    .line 379
    .line 380
    iput-object v5, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 381
    .line 382
    iput v4, v1, Lh0/x0;->d:I

    .line 383
    .line 384
    invoke-static {v5, v3, v1}, Lu/w1;->d(Lc2/i0;Lc2/m;Lac/a;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    if-ne v0, v8, :cond_15

    .line 389
    .line 390
    :goto_f
    move-object v6, v8

    .line 391
    goto :goto_10

    .line 392
    :cond_17
    throw v0

    .line 393
    :cond_18
    :goto_10
    return-object v6

    .line 394
    :pswitch_2
    iget v0, v1, Lh0/x0;->d:I

    .line 395
    .line 396
    if-eqz v0, :cond_1b

    .line 397
    .line 398
    if-eq v0, v9, :cond_1a

    .line 399
    .line 400
    const/4 v4, 0x2

    .line 401
    if-ne v0, v4, :cond_19

    .line 402
    .line 403
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v0, p1

    .line 407
    .line 408
    goto :goto_13

    .line 409
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 410
    .line 411
    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v0

    .line 415
    :cond_1a
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, Lc2/i0;

    .line 418
    .line 419
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v3, p1

    .line 423
    .line 424
    goto :goto_11

    .line 425
    :cond_1b
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v0, Lc2/i0;

    .line 431
    .line 432
    iput-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 433
    .line 434
    iput v9, v1, Lh0/x0;->d:I

    .line 435
    .line 436
    sget-object v3, Lu/n2;->a:Li7/k;

    .line 437
    .line 438
    sget-object v3, Lc2/m;->b:Lc2/m;

    .line 439
    .line 440
    invoke-static {v0, v3, v1}, Lu/n2;->d(Lc2/i0;Lc2/m;Lac/a;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    if-ne v3, v8, :cond_1c

    .line 445
    .line 446
    goto :goto_12

    .line 447
    :cond_1c
    :goto_11
    check-cast v3, Lc2/t;

    .line 448
    .line 449
    iput-object v2, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 450
    .line 451
    const/4 v4, 0x2

    .line 452
    iput v4, v1, Lh0/x0;->d:I

    .line 453
    .line 454
    sget-object v2, Lc2/m;->a:Lc2/m;

    .line 455
    .line 456
    invoke-static {v0, v3, v2, v1}, Lu/e0;->a(Lc2/i0;Lc2/t;Lc2/m;Lac/a;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    if-ne v0, v8, :cond_1d

    .line 461
    .line 462
    :goto_12
    move-object v6, v8

    .line 463
    goto :goto_14

    .line 464
    :cond_1d
    :goto_13
    check-cast v0, Ljava/lang/Boolean;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-nez v0, :cond_1f

    .line 471
    .line 472
    iget-object v0, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Ll0/s0;

    .line 475
    .line 476
    invoke-virtual {v0}, Ll0/s0;->d()Lh0/h0;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    if-eqz v0, :cond_1e

    .line 481
    .line 482
    goto :goto_14

    .line 483
    :cond_1e
    check-cast v10, Ll0/x;

    .line 484
    .line 485
    invoke-virtual {v10}, Ll0/x;->b()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    :cond_1f
    :goto_14
    return-object v6

    .line 489
    :pswitch_3
    const/4 v2, 0x0

    .line 490
    check-cast v10, Lh0/c1;

    .line 491
    .line 492
    iget v0, v1, Lh0/x0;->d:I

    .line 493
    .line 494
    if-eqz v0, :cond_22

    .line 495
    .line 496
    if-eq v0, v9, :cond_21

    .line 497
    .line 498
    const/4 v4, 0x2

    .line 499
    if-ne v0, v4, :cond_20

    .line 500
    .line 501
    iget-object v0, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, Lc2/t;

    .line 504
    .line 505
    iget-object v3, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v3, Lc2/i0;

    .line 508
    .line 509
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    move-object/from16 v5, p1

    .line 513
    .line 514
    const/4 v4, 0x2

    .line 515
    goto :goto_18

    .line 516
    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 517
    .line 518
    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    throw v0

    .line 522
    :cond_21
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, Lc2/i0;

    .line 525
    .line 526
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    move-object/from16 v3, p1

    .line 530
    .line 531
    const/4 v4, 0x2

    .line 532
    goto :goto_15

    .line 533
    :cond_22
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    iget-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, Lc2/i0;

    .line 539
    .line 540
    iput-object v0, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 541
    .line 542
    iput v9, v1, Lh0/x0;->d:I

    .line 543
    .line 544
    const/4 v4, 0x2

    .line 545
    invoke-static {v0, v1, v4}, Lu/n2;->c(Lc2/i0;Lyb/c;I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    if-ne v3, v8, :cond_23

    .line 550
    .line 551
    goto :goto_17

    .line 552
    :cond_23
    :goto_15
    check-cast v3, Lc2/t;

    .line 553
    .line 554
    iget-wide v11, v3, Lc2/t;->c:J

    .line 555
    .line 556
    invoke-interface {v10}, Lh0/c1;->d()V

    .line 557
    .line 558
    .line 559
    move-object/from16 v16, v3

    .line 560
    .line 561
    move-object v3, v0

    .line 562
    move-object/from16 v0, v16

    .line 563
    .line 564
    :goto_16
    iput-object v3, v1, Lh0/x0;->e:Ljava/lang/Object;

    .line 565
    .line 566
    iput-object v0, v1, Lh0/x0;->f:Ljava/lang/Object;

    .line 567
    .line 568
    iput v4, v1, Lh0/x0;->d:I

    .line 569
    .line 570
    invoke-static {v3, v1}, La0/c;->y(Lc2/i0;Lac/a;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v5

    .line 574
    if-ne v5, v8, :cond_24

    .line 575
    .line 576
    :goto_17
    move-object v6, v8

    .line 577
    goto :goto_1a

    .line 578
    :cond_24
    :goto_18
    check-cast v5, Lc2/l;

    .line 579
    .line 580
    iget-object v5, v5, Lc2/l;->a:Ljava/lang/Object;

    .line 581
    .line 582
    move-object v7, v5

    .line 583
    check-cast v7, Ljava/util/Collection;

    .line 584
    .line 585
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 586
    .line 587
    .line 588
    move-result v7

    .line 589
    const/4 v9, 0x0

    .line 590
    :goto_19
    if-ge v9, v7, :cond_26

    .line 591
    .line 592
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v11

    .line 596
    check-cast v11, Lc2/t;

    .line 597
    .line 598
    iget-wide v12, v11, Lc2/t;->a:J

    .line 599
    .line 600
    iget-wide v14, v0, Lc2/t;->a:J

    .line 601
    .line 602
    invoke-static {v12, v13, v14, v15}, Lc2/s;->d(JJ)Z

    .line 603
    .line 604
    .line 605
    move-result v12

    .line 606
    if-eqz v12, :cond_25

    .line 607
    .line 608
    iget-boolean v11, v11, Lc2/t;->d:Z

    .line 609
    .line 610
    if-eqz v11, :cond_25

    .line 611
    .line 612
    goto :goto_16

    .line 613
    :cond_25
    add-int/lit8 v9, v9, 0x1

    .line 614
    .line 615
    goto :goto_19

    .line 616
    :cond_26
    invoke-interface {v10}, Lh0/c1;->c()V

    .line 617
    .line 618
    .line 619
    :goto_1a
    return-object v6

    .line 620
    nop

    .line 621
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
