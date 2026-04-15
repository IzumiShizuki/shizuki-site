.class public final Llf/s;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf/f;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Llf/f;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Llf/s;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Llf/s;->b:Llf/f;

    .line 4
    .line 5
    iput-object p2, p0, Llf/s;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
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
.method public final b(Llf/g;Lyb/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Llf/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Li7/s0;

    .line 7
    .line 8
    iget-object v1, p0, Llf/s;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    invoke-direct {v0, v2, p1, v1}, Li7/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Llf/s;->b:Llf/f;

    .line 18
    .line 19
    invoke-interface {p1, v0, p2}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 24
    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    :goto_0
    return-object p1

    .line 31
    :pswitch_0
    iget-object v0, p0, Llf/s;->b:Llf/f;

    .line 32
    .line 33
    check-cast v0, Li7/n;

    .line 34
    .line 35
    new-instance v1, Li7/s0;

    .line 36
    .line 37
    iget-object v2, p0, Llf/s;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lm9/c;

    .line 40
    .line 41
    const/16 v3, 0x8

    .line 42
    .line 43
    invoke-direct {v1, v3, p1, v2}, Li7/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, p2}, Li7/n;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 51
    .line 52
    if-ne p1, p2, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 56
    .line 57
    :goto_1
    return-object p1

    .line 58
    :pswitch_1
    new-instance v0, Li7/s0;

    .line 59
    .line 60
    iget-object v1, p0, Llf/s;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Li7/a;

    .line 63
    .line 64
    const/4 v2, 0x6

    .line 65
    invoke-direct {v0, v2, p1, v1}, Li7/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Llf/s;->b:Llf/f;

    .line 69
    .line 70
    invoke-interface {p1, v0, p2}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 75
    .line 76
    if-ne p1, p2, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 80
    .line 81
    :goto_2
    return-object p1

    .line 82
    :pswitch_2
    instance-of v0, p2, Llf/y;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    move-object v0, p2

    .line 87
    check-cast v0, Llf/y;

    .line 88
    .line 89
    iget v1, v0, Llf/y;->e:I

    .line 90
    .line 91
    const/high16 v2, -0x80000000

    .line 92
    .line 93
    and-int v3, v1, v2

    .line 94
    .line 95
    if-eqz v3, :cond_3

    .line 96
    .line 97
    sub-int/2addr v1, v2

    .line 98
    iput v1, v0, Llf/y;->e:I

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    new-instance v0, Llf/y;

    .line 102
    .line 103
    invoke-direct {v0, p0, p2}, Llf/y;-><init>(Llf/s;Lyb/c;)V

    .line 104
    .line 105
    .line 106
    :goto_3
    iget-object p2, v0, Llf/y;->d:Ljava/lang/Object;

    .line 107
    .line 108
    iget v1, v0, Llf/y;->e:I

    .line 109
    .line 110
    const/4 v2, 0x1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    if-ne v1, v2, :cond_4

    .line 114
    .line 115
    iget-object p1, v0, Llf/y;->g:Li7/s0;

    .line 116
    .line 117
    :try_start_0
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Lmf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :catch_0
    move-exception p2

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 126
    .line 127
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_5
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object p2, p0, Llf/s;->b:Llf/f;

    .line 135
    .line 136
    new-instance v1, Li7/s0;

    .line 137
    .line 138
    iget-object v3, p0, Llf/s;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v3, Li7/a;

    .line 141
    .line 142
    const/4 v4, 0x4

    .line 143
    invoke-direct {v1, v4, v3, p1}, Li7/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :try_start_1
    iput-object v1, v0, Llf/y;->g:Li7/s0;

    .line 147
    .line 148
    iput v2, v0, Llf/y;->e:I

    .line 149
    .line 150
    invoke-interface {p2, v1, v0}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1
    :try_end_1
    .catch Lmf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 155
    .line 156
    if-ne p1, p2, :cond_6

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :catch_1
    move-exception p2

    .line 160
    move-object p1, v1

    .line 161
    :goto_4
    iget-object v1, p2, Lmf/a;->a:Ljava/lang/Object;

    .line 162
    .line 163
    if-ne v1, p1, :cond_7

    .line 164
    .line 165
    iget-object p1, v0, Lac/c;->b:Lyb/h;

    .line 166
    .line 167
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-static {p1}, Lhf/a0;->m(Lyb/h;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_5
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 174
    .line 175
    :goto_6
    return-object p2

    .line 176
    :cond_7
    throw p2

    .line 177
    :pswitch_3
    new-instance v0, Ljc/u;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Llf/s;->b:Llf/f;

    .line 183
    .line 184
    check-cast v1, Lmf/j;

    .line 185
    .line 186
    new-instance v2, Lf7/v;

    .line 187
    .line 188
    iget-object v3, p0, Llf/s;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v3, Li7/a;

    .line 191
    .line 192
    const/4 v4, 0x5

    .line 193
    invoke-direct {v2, v0, p1, v3, v4}, Lf7/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2, p2}, Lmf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 201
    .line 202
    if-ne p1, p2, :cond_8

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_8
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 206
    .line 207
    :goto_7
    return-object p1

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
